import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B5_5597 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] submitted = new boolean[30];
        
        for(int i=0; i<28; i++){
            int student = Integer.parseInt(br.readLine());
            submitted[student-1] = true;
        }

        for(int i=0; i<30 ; i++){
            if(!submitted[i]){
                System.out.println(i+1);;
            }
        }


    }
}
