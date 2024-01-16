import java.util.Scanner;

public class B5_10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int facInt = 1; 

        for(int i=1; i<= n ; i++){
            facInt *= i;
        }

        System.out.println(facInt);
        sc.close();
    }
}