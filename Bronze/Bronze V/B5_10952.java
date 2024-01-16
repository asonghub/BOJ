import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x==0&&y==0){
                break;
            }
            int c = x+y;
            arr.add(c);
        }

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        

        sc.close();
    }
}
