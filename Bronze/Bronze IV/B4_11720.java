import java.util.*;

public class B4_11720 {
public static void main(String[] args) {
    int sum =0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); 
    // int[] nums = new int[n];
    String numString = sc.nextLine();
    String[] numArray = numString.split("");
    for(int i =0; i<n; i++){
        sum += Integer.parseInt(numArray[i]);
    }
    System.out.println(sum);
    sc.close();
}
    
    
}