import java.util.*;

public class B3_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int n1 = num2%10;
        int n10 = (num2%100) - n1 ;
        int n100 = num2 - n10 - n1;

        System.out.println(n1*num1);
        System.out.println(n10/10*num1);
        System.out.println(n100/100*num1);
        System.out.println(num1*num2);



        sc.close();

    }
}
