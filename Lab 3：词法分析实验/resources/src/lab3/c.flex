import lab3.MySymbol;
%%

%class Lab3Scanner
%unicode
%line
%column
%type MySymbol
%eofval{
	return symbol(MySymbol.EOF, "<EOF>");
%eofval}

%{
private MySymbol symbol(int type){
return new MySymbol(type, yyline, yycolumn, yytext());
}
private MySymbol symbol(int type, String value){
return new MySymbol(type, yyline, yycolumn, value);
}
%}

KeyWord = "auto"|"break"|"case"|"char"|"const"
        |"continue"|"default"|"do"|"double"|"else"
        |"enum"|"extern"|"float"|"for"|"goto"
        |"if"|"inline"|"int"|"long"|"register"
        |"restrict"|"return"|"short"|"signed"|"sizeof"
        |"static"|"struct"|"switch"|"typedef"|"union"
        |"unsigned"|"void"|"volatile"|"while"

Identifier = {nodigit} ({nodigit} | {digit})*
nodigit = [a-zA-Z_]
digit = [0-9]

Integer = {sign}? ({decimal} | {octal} | {hexadecimal}) {integer_suffix}?
decimal = {nonzero_digit} {digit}*
octal = 0 {octal_digit}*
hexadecimal = {hexadecimal_prefix} {hexadecimal_digit}+
hexadecimal_prefix = 0x | 0X
nonzero_digit = [1-9]
octal_digit = [0-7]
hexadecimal_digit = [0-9a-fA-F]
integer_suffix = {unsigned_suffix} ({long_suffix} | {long_long_suffix})?
        | ({long_suffix} | {long_long_suffix}) {unsigned_suffix}?
unsigned_suffix = u | U
long_suffix = l | L
long_long_suffix = ll | LL

Float = {sign}? ({decimal_float} | {hexadecimal_float})
decimal_float = ({fractional_constant} | {digit_sequence}) {exponent_part}? {floating_suffix}?
hexadecimal_float = {hexadecimal_prefix} ({hexadecimal_fractional_constant} | {hexadecimal_digit_sequence})
          {binary_exponent_part}? {floating_suffix}?
fractional_constant = {digit_sequence} "." {digit_sequence}?
exponent_part = (e | E) {sign}? {digit_sequence}
sign = "+" | "-"
digit_sequence = {digit}+
hexadecimal_fractional_constant = {hexadecimal_digit_sequence} "." {hexadecimal_digit_sequence}?
binary_exponent_part = (p | P) {sign}? {digit_sequence}
hexadecimal_digit_sequence = {hexadecimal_digit}+
floating_suffix = f | l | F | L

ConstString = [LuU]?\'([^\'\\\r\n]|\\.)*\'
simple_escape_sequence = "\'" | "\"" | "\?" | "\\" | "\a" | "\b" | "\f" | "\n" | "\r" | "\t" | "\v"

String = (u8 | u | U | L)?\"([^\"\\\r\n]|\\.)*\"

Operator = "["|"]"|"("|")"|"{"|"}"|"."|"->"
           |"++"|"--"|"&"|"*"|"+"|"-"|"~"|"!"
           |"/"|"%"|"<<"|">>"|"<"|">"|"<="|">="
           |"=="|"!="|"^"|"|"|"&&"|"||"
           |"?"|":"|";"|"..."
           |"="|"*="|"/="|"%="|"+="|"-="|"<<="|">>="
           |"&="|"^="|"|="|","|"#"|"##"|"<:"|":>"
           |"<%"|"%>"|"%:"|"%:%:"

Comment = {traditional_comment} | {end_of_line_comment}
traditional_comment = "/*"([^*]|\*+[^*/])*\*+"/"
end_of_line_comment     = "//" [^\r\n]* {line_terminator}?

line_terminator = \r|\n|\r\n
WhiteSpace 	= " "|{line_terminator}|\t|\f

%%

<YYINITIAL>
{
	{KeyWord}							{return symbol(MySymbol.KeyWord);}
	{Identifier}						{return symbol(MySymbol.Identifier);}
	{Integer}							{return symbol(MySymbol.Integer);}
    {Float}                             {return symbol(MySymbol.Float);}
    {ConstString}                       {return symbol(MySymbol.ConstString);}
    {String}                            {return symbol(MySymbol.String);}
	{Operator}							{return symbol(MySymbol.Operator);}
    {WhiteSpace}                        {}
    {Comment}                           {}
    [^]                                 { throw new Error("Illegal character <"+yytext()+">"); }
}