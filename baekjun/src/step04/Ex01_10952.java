package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Q. �� ���� A�� B�� �Է¹��� ����, A+B�� ���
// �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
// �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
// �Է��� ���������� 0 �� ���� ���´�.
public class Ex01_10952 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			while(true) {
				
				String s = br.readLine(); // ���� �޾ƿ�
				
				StringTokenizer st = new StringTokenizer(s);
				
				// �������� �ΰ� �ڸ���.
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				// �޾ƿ� �� ���� ��� 0�̸� �ݺ��� ���� 
				if(a == 0 && b == 0) {
					break;
				}
				
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
