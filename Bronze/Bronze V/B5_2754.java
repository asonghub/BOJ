import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] abc =br.readLine().toCharArray();
        if(abc.length==1){
            System.out.println(0.0);
        }else{
            System.out.println(score(abc[0], abc[1]));
        }
        
    }

    private static float score(char x, char y){
        float score =0;
        if(x=='A'){
            score += 4;
        }else if(x =='B'){
            score += 3;
        }else if(x =='C'){
            score += 2;
        }else if(x =='D'){
            score += 1;
        }

        if(y=='+'){
            score += 0.3;
        }else if(y=='-'){
            score  -= 0.3;
        }

        return score;
    }
    
}
