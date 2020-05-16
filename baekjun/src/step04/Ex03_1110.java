package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Ex03_1110
 */
public class Ex03_1110 {

    public static void main(final String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {

            int cnt = 0;
            String numStr = br.readLine();

            if(numStr.length()==1) {
                numStr = "0" + numStr;    
            }

            String result = numStr;

            // while(true) {

            //     int firstNum = Integer.parseInt(result)/10;
            //     int secondNum = Integer.parseInt(result)%10;

            //     result = "" + secondNum + (firstNum + secondNum)%10;

            //     cnt++;

            //     if(numStr.equals(result)) {
            //         break;
            //     }
            // }

            // bw.write(Integer.toString(cnt));
            // bw.flush();
            // bw.close();

            do{

                int firstNum = Integer.parseInt(result)/10;
                int secondNum = Integer.parseInt(result)%10;

                int r = firstNum + secondNum;

                result = secondNum + Integer.toString(r%10);

                cnt++;

            } while(!numStr.equals(result));

            bw.write(Integer.toString(cnt));
            bw.flush();
            bw.close();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }

}