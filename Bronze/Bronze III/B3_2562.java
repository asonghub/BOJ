import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B3_2562 {
    private static BufferedReader in;
    
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max;
        for(int i =0; i < 9; i++ ){
            arr[i] = Integer.parseInt(in.readLine());
            
        }
        max = arr[0];
        int cnt =0;
        for(int i =0; i < 9; i++ ){
            if(max < arr[i]){
                max = arr[i];
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.println(cnt+1);
        
    }
    
}
