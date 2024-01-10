import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        for(char x : str.toCharArray()){
            if(Character.isUpperCase(x)){
                result +=Character.toLowerCase(x);
            }else{
                result +=Character.toUpperCase(x);
            }
        }

        System.out.println(result);

    }
    
}
