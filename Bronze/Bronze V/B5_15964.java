import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_15964 {
    private static BufferedReader in;
    
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        StringTokenizer arr = new StringTokenizer(str);
        long x = Integer.parseInt(arr.nextToken());
        long y = Integer.parseInt(arr.nextToken());
        System.out.println(cal(x, y));
        in.close();

    }

    private static long cal(long x, long y){
        return (x+y)*(x-y);
    }
    
}
