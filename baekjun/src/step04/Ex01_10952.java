package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 입력의 마지막에는 0 두 개가 들어온다.
public class Ex01_10952 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			while(true) {
				
				String s = br.readLine(); // 한줄 받아옴
				
				StringTokenizer st = new StringTokenizer(s);
				
				// 공백으로 두개 자른다.
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				// 받아온 두 값이 모두 0이면 반복문 종료 
				if(a == 0 && b == 0) {
					break;
				}
				
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
