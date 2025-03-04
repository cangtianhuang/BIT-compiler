import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CVisitor extends lab6BaseVisitor<Object> {

	enum Species {
		SIMPLE(0), ARRAY(1), POINTER(2),
		STRUCT(4), UNION(8), ENUM(16), CLASS(32), FUNC(64);
		public final int value;

		Species(int value) {
			this.value = value;
		}
	}

	static class PointerInfo {
		int pointerNum;
		ArrayList<String> qualifier;
	}

	static class ArrayInfo {
		int dimeNum;
		ArrayList<String> qualifier;
		ArrayList<String> assExpr;
	}

	static class Info {
		String id;
		ArrayList<String> specifiers;
		int species;
		PointerInfo pointerInfo;
		ArrayInfo arrayInfo;
		long length, size, offset;
	}

	static class FuncInfo {
		String id;
		ArrayList<String> specifiers;
		int species;
		PointerInfo pointerInfo;
		ArrayInfo arrayInfo;
		long offset;
		Map<String, Info> para = new ConcurrentHashMap<>();
	}

	Map<String, FuncInfo> funcMemory = new ConcurrentHashMap<>();
	Map<String, Info> globalMemory = new ConcurrentHashMap<>();

	Map<String, Info> thisMemory;
	FuncInfo thisFunc;
	int isInIter, haveAddPara;

	/**
	 * @return null
	 */
	@Override
	public Object visitTranslation_unit(lab6Parser.Translation_unitContext ctx) {

		isInIter = 0;
		thisMemory = globalMemory;
		return super.visitTranslation_unit(ctx);
	}

	/**
	 * @return null
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object visitFunction_definition(lab6Parser.Function_definitionContext ctx) {
		FuncInfo funcInfo = new FuncInfo();
		funcInfo.species |= Species.FUNC.value;
		funcInfo.specifiers = (ArrayList<String>) visitDeclaration_specifiers(ctx.declaration_specifiers());
		Info info = (Info) visitDeclarator(ctx.declarator());
		funcInfo.id = info.id;
		funcInfo.pointerInfo = info.pointerInfo;
		funcInfo.arrayInfo = info.arrayInfo;
		if (ctx.parameter_list() != null) {
			funcInfo.para = (Map<String, Info>) visitParameter_list(ctx.parameter_list());
			haveAddPara = 1;
		}
		if (funcMemory.get(funcInfo.id) != null) {
			System.out.println(ctx.declarator().direct_declarator().IDENTIFIER(0).getSymbol().toString()
					+ " ES02: Duplicate definition: " + funcInfo.id);
		} else funcMemory.put(funcInfo.id, funcInfo);
		globalMemory.put(funcInfo.id, info);
		thisFunc = funcInfo;
		visitCompound_statement(ctx.compound_statement());
		thisMemory = globalMemory;
		return null;
	}

	/**
	 * @return ArrayList<String>
	 */
	@Override
	public Object visitDeclaration_specifiers(lab6Parser.Declaration_specifiersContext ctx) {
		ArrayList<String> specifiers = new ArrayList<>();
		for (lab6Parser.Declaration_specifierContext specifier : ctx.declaration_specifier()) {
			specifiers.add((String) visitDeclaration_specifier(specifier));
		}
		return specifiers;
	}

	/**
	 * @return String
	 */
	@Override
	public Object visitDeclaration_specifier(lab6Parser.Declaration_specifierContext ctx) {
		return ctx.getText();
	}

	/**
	 * @return Info
	 */
	@Override
	public Object visitDeclarator(lab6Parser.DeclaratorContext ctx) {
		Info info = (Info) visitDirect_declarator(ctx.direct_declarator());
		if (ctx.pointer() != null) {
			info.pointerInfo = (PointerInfo) visitPointer(ctx.pointer());
			info.species |= Species.POINTER.value;
		}
		return info;
	}

	/**
	 * @return Info
	 */
	@Override
	public Object visitDirect_declarator(lab6Parser.Direct_declaratorContext ctx) {
		Info info = new Info();
		info.id = ctx.IDENTIFIER(0).getText();
		int arrayNum = ctx.LB().size();
		if (arrayNum > 0) {
			ArrayInfo arrayInfo;
			info.species |= Species.ARRAY.value;
			arrayInfo = new ArrayInfo();
			arrayInfo.dimeNum = arrayNum;
			for (lab6Parser.Type_qualifierContext qualifier : ctx.type_qualifier()) {
				arrayInfo.qualifier.add(qualifier.getText());
			}
			for (lab6Parser.Assignment_expressionContext assExpr : ctx.assignment_expression()) {
				arrayInfo.assExpr.add(assExpr.getText());
			}
			info.arrayInfo = arrayInfo;
		}
		return info;
	}

	/**
	 * @return PointerInfo
	 */
	@Override
	public Object visitPointer(lab6Parser.PointerContext ctx) {
		PointerInfo pointerInfo = new PointerInfo();
		pointerInfo.pointerNum = ctx.MUL().size();
		for (lab6Parser.Type_qualifierContext qualifier : ctx.type_qualifier()) {
			pointerInfo.qualifier.add(qualifier.getText());
		}
		return pointerInfo;
	}

	/**
	 * @return Map<String, Info>
	 */
	@Override
	public Object visitParameter_list(lab6Parser.Parameter_listContext ctx) {
		Map<String, Info> para = new ConcurrentHashMap<>();
		for (lab6Parser.Parameter_declarationContext decCtx : ctx.parameter_declaration()) {
			Info info = (Info) visitParameter_declaration(decCtx);
			para.put(info.id, info);
		}
		return para;
	}

	/**
	 * @return Info
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object visitParameter_declaration(lab6Parser.Parameter_declarationContext ctx) {
		Info info = (Info) visitDeclarator(ctx.declarator());
		info.specifiers = (ArrayList<String>) visitDeclaration_specifiers(ctx.declaration_specifiers());
		return info;
	}

	/**
	 * @return null
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object visitDeclaration(lab6Parser.DeclarationContext ctx) {
		ArrayList<Info> infos = (ArrayList<Info>) visitInit_declarator_list(ctx.init_declarator_list());
		ArrayList<String> specifiers = (ArrayList<String>) visitDeclaration_specifiers(ctx.declaration_specifiers());
		int i = 0;
		for (Info info : infos) {
			info.specifiers = specifiers;
			if (thisMemory.get(info.id) != null) {
				System.out.println(ctx.init_declarator_list().init_declarator(i).declarator().direct_declarator()
						.IDENTIFIER(0).getSymbol().toString() + " ES02: Duplicate definition: " + info.id);
			} else thisMemory.put(info.id, info);
			i++;
		}
		return null;
	}

	/**
	 * @return ArrayList<Info>
	 */
	@Override
	public Object visitInit_declarator_list(lab6Parser.Init_declarator_listContext ctx) {
		ArrayList<Info> infos = new ArrayList<>();
		for (lab6Parser.Init_declaratorContext declaratorContext : ctx.init_declarator()) {
			infos.add((Info) visitInit_declarator(declaratorContext));
		}
		return infos;
	}

	/**
	 * @return Info
	 */
	@Override
	public Object visitInit_declarator(lab6Parser.Init_declaratorContext ctx) {
		if (ctx.initializer() != null) {
			visitInitializer(ctx.initializer());
		}
		return visitDeclarator(ctx.declarator());
	}

	/**
	 * @return null
	 */
	@Override
	public Object visitCompound_statement(lab6Parser.Compound_statementContext ctx) {
		Map<String, Info> localMemory = new ConcurrentHashMap<>();
		if (haveAddPara == 1) {
			localMemory.putAll(thisFunc.para);
			haveAddPara = 0;
		}
		thisMemory = localMemory;
		super.visitCompound_statement(ctx);
		return null;
	}

	/**
	 * @return null
	 */
	@Override
	public Object visitStatement(lab6Parser.StatementContext ctx) {
		if (ctx.iteration_statement() != null) isInIter = 1;
		super.visitStatement(ctx);
		isInIter = 0;
		return null;
	}

	/**
	 * @return null
	 */
	@Override
	public Object visitLabeled_statement(lab6Parser.Labeled_statementContext ctx) {
		if (ctx.IDENTIFIER() != null) {
			String id = ctx.IDENTIFIER().getText();
			if (thisMemory.get(id) == null) {
				if (thisMemory == globalMemory || globalMemory.get(id) == null)
					System.out.println(ctx.IDENTIFIER().getSymbol().toString() + " ES01: Undefined identifier: " + id);
			}
		}
		return super.visitLabeled_statement(ctx);
	}

	/**
	 * @return null
	 */
	@Override
	public Object visitJump_statement(lab6Parser.Jump_statementContext ctx) {
		if (ctx.BREAK() != null) {
			if (isInIter == 0)
				System.out.println(ctx.BREAK().getSymbol().toString() +
						" ES03: 'break' is not in iteration_statement");
		}
		if (ctx.IDENTIFIER() != null) {
			String id = ctx.IDENTIFIER().getText();
			if (thisMemory.get(id) == null) {
				if (thisMemory == globalMemory || globalMemory.get(id) == null)
					System.out.println(ctx.IDENTIFIER().getSymbol().toString() +
							" ES01: Undefined identifier: " + id);
			}
		}
		return super.visitJump_statement(ctx);
	}

	/**
	 * @return null
	 */
	@Override
	public Object visitPostfix_expression(lab6Parser.Postfix_expressionContext ctx) {
		if (ctx.IDENTIFIER() != null) {
			for (TerminalNode node : ctx.IDENTIFIER()) {
				String id = node.getText();
				if (thisMemory.get(id) == null) {
					if (thisMemory == globalMemory || globalMemory.get(id) == null)
						System.out.println(node.getSymbol().toString() + " ES01: Undefined identifier: " + id);
				}
			}
		}
		return super.visitPostfix_expression(ctx);
	}

	/**
	 * @return null
	 */
	@Override
	public Object visitPrimary_expression(lab6Parser.Primary_expressionContext ctx) {
		if (ctx.IDENTIFIER() != null) {
			String id = ctx.IDENTIFIER().getText();
			if (thisMemory.get(id) == null) {
				if (thisMemory == globalMemory || globalMemory.get(id) == null)
					System.out.println(ctx.IDENTIFIER().getSymbol().toString() + " ES01: Undefined identifier: " + id);
			}
		}
		return super.visitPrimary_expression(ctx);
	}

}
