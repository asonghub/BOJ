import java.util.Scanner;

public class B5_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();

        long c = x-y;
        System.out.println(Math.abs(c));

        sc.close();
    }
}
