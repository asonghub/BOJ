import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B5_9086 {
    private static int n;
    private static BufferedReader in;
    private static BufferedWriter out;
    
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(in.readLine());
        for(int i=0; i<n ; i++){
            char[] arr = in.readLine().toCharArray();
            out.write(arr[0]+""+arr[arr.length-1]+"\n");
        }
        out.flush();
        in.close();
        out.close();
    }
    
}
