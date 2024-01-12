import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B5_117118 {
    private static BufferedReader in;
    private static BufferedWriter out;
    private static String str;
    
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while ((str = in.readLine()) != null ) {
            out.write(str +"\n");
            out.flush();
        }
        out.close();
        in.close();
    }
}
