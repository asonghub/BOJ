import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] mat1= new int[N][M];
        int[][] mat2= new int[N][M];

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int x = Integer.parseInt(st.nextToken());
                mat1[i][j] = x;
            }
        }
        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int x = Integer.parseInt(st.nextToken());
                mat2[i][j] = x;
            }
        }
        for(int i=0 ; i<N ; i++){
            for(int j=0; j<M; j++){
                System.out.print(mat1[i][j]+mat2[i][j] + " ");
            }
            System.out.println();
        }
        

    }
}
