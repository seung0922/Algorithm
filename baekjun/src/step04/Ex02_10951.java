package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Q. �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷�
// �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
// �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. 
public class Ex02_10951 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			while(true) {
				
				String s = br.readLine(); // ���� �޾ƿ�
				
				if(s == null) {
					break;
				}
				
				StringTokenizer st = new StringTokenizer(s);
				
				// �������� �ΰ� �ڸ���.
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				// �տ��� �ڸ� �� �� ���Ѵ�.
				int result = a + b;
				
				// ����Ѵ�.
				bw.write(result + "\n");
				
				// �����ִ� �� ��� �о��ش�.
				bw.flush();
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
