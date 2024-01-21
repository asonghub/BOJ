import java.io.*;
import java.util.*;
public class B5_2475 {
    private static BufferedReader in;
    private static BufferedWriter out;
    
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(in.readLine());
        int ans =0;
        for(int i=0; i<5; i++){
            int temp = Integer.parseInt(st.nextToken());
            ans += temp*temp;
        }
        out.write(Integer.toString(ans%10));
        out.flush();
        out.close();
        in.close();
    }
}
