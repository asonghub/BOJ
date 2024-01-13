import java.util.Scanner;

public class B5_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        int v = sc.nextInt();
        for(int j=0; j<n; j++){
            if(arr[j]==v){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
