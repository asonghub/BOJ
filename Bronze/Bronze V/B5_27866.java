import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B5_27866 {
    private static String str;
    private static int i;

    private static BufferedReader in;
    private static BufferedWriter out;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));

        str = in.readLine();
        i = Integer.parseInt(in.readLine());
        out.write(str.toCharArray()[i-1]);;
        out.flush();
        out.close();
        in.close();
        
    }
}
