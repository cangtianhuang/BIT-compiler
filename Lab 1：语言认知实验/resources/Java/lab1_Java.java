import java.io.*;
import java.util.Arrays;

public class lab1_Java {
	public static void main(String[] args) throws IOException {
		long stime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new FileReader("src/testdata.txt"));
		if (!br.ready()) {
			System.out.println("error!");
			System.exit(1);
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/result_Java.txt"));
		StringBuilder stringBuilder = new StringBuilder();
		String s1;
		String[] stemp;
		while ((s1 = br.readLine()) != null) {
			if (s1.isEmpty()) continue;
			if (s1.charAt(0) >= '0' && s1.charAt(0) <= '9') {
				long time1 = System.currentTimeMillis();
				int q = Integer.parseInt(s1);
				int[][] leftMatrix = new int[q][q];
				int[][] rightMatrix = new int[q][q];
				int[] resultVector = new int[q];
				for (int i = 0; i < q; i++) {
					s1 = br.readLine();
					stemp = s1.split("\\s+");
					for (int j = 0; j < q; j++) {
						String s = stemp[j + 1];
						leftMatrix[i][j] = Integer.parseInt(s);
					}
				}
				br.readLine();
				for (int i = 0; i < q; i++) {
					s1 = br.readLine();
					stemp = s1.split("\\s+");
					for (int j = 0; j < q; j++) {
						String s = stemp[j + 1];
						rightMatrix[i][j] = Integer.parseInt(s);
					}
				}
				stringBuilder.append(q).append("\n");
				System.out.println(stringBuilder);
				bw.write(stringBuilder.toString(), 0,stringBuilder.length());
				stringBuilder.setLength(0);
				for (int i = 0; i < q; i++) {
					Arrays.fill(resultVector, 0);
					for (int k = 0; k < q; k++) {
						int x=leftMatrix[i][k];
						for (int j = 0; j < q; j++) {
							resultVector[j] += x * rightMatrix[k][j];
						}
					}
					for(int j=0;j<q;j++){
						stringBuilder.append("\t\t").append(resultVector[j]);
					}
					stringBuilder.append("\n");
					System.out.println(stringBuilder);
					bw.write(stringBuilder.toString(), 0,stringBuilder.length());
					stringBuilder.setLength(0);
				}
				System.out.println(q + ": success!");
				long time2 = System.currentTimeMillis();
				double time = (double) (time2 - time1) / 1000;
				stringBuilder.append("TIME: ").append(String.format("%.6f",time)).append("s.\n\n");
				System.out.print(stringBuilder);
				bw.write(stringBuilder.toString(), 0, stringBuilder.length());
				bw.flush();
				stringBuilder.setLength(0);
			}
		}
		long etime = System.currentTimeMillis();
		double time = (double) (etime - stime) / 1000;
		stringBuilder.append("TOTAL TIME: ").append(String.format("%.6f",time)).append("s.\n");
		System.out.print(stringBuilder);
		bw.write(stringBuilder.toString(), 0, stringBuilder.length());
		bw.flush();
		br.close();
		bw.close();
	}
}