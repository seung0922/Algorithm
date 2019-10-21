package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. 
public class Ex02_10951 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			while(true) {
				
				String s = br.readLine(); // 한줄 받아옴
				
				if(s == null) {
					break;
				}
				
				StringTokenizer st = new StringTokenizer(s);
				
				// 공백으로 두개 자른다.
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				// 앞에서 자른 두 값 더한다.
				int result = a + b;
				
				// 출력한다.
				bw.write(result + "\n");
				
				// 남아있는 것 모두 밀어준다.
				bw.flush();
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
