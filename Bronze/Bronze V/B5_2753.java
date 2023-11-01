import java.util.Scanner;

public class B5_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0 && year%100!=0 ){
            System.out.println(1);
        }else{
            System.out.println(year%400==0? 1: 0);
        }
        sc.close();
    }
}
