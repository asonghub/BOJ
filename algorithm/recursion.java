package algorithm;

import java.util.Scanner;

// 1~n 까지의 합
public class recursion {
    public static void main(String[] args) {
        int result = func(4);
    }

    public static int func(int n){
        if(n==0){
            return 0;
        }else{
            return n + func(n-1);
        }
    }

    //팩토리얼
    public static int fac(int n){
        if(n ==1){
            return 0;
        }else{
            return n*fac(-1);
        }
    }

    //x의 n승
    public static double power(int x, int n){
        if(n ==0){
            return 1;
        }else{
            return x*power(x, n-1);
        }
    }

    //피보나치
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    //최대공약수
    public static int gcd(int p, int q){
        if( q == 0){
            return p;
        }else{
            return gcd(q, p%q);
        }
    }

    //문자열의 길이 계산
    public static int length(String str){
        if(str.equals("")){
            return 0;
        }else{
            return 1 + length(str.substring(1)); //1 + 첫 글자를 제외한 나머지 자리수
        }
    }

    //문자열 프린트
    public static void printChars(String str){
        if(str.length()==0){
            return ;
        }else{
            System.out.print(str.charAt(0)); // 맨앞 글자를 프린트
            printChars(str.substring(1)); // 맨 앞 글자를 뺀 나머지를 프린트
        }
    }

    //문자열을 뒤집어 프린트
    public static void reversePrintChars(String str){
        if(str.length()==0){
            return ;
        }else{
            printChars(str.substring(1)); //맨앞글자를 빼고 나머지를 인쇄
            System.out.print(str.charAt(0)); // 맨 앞글자를 그 뒤에 인쇄
        }
    }

    //이진수로 변환하기
    public void printInBinary(int n){
        if(n<2){
            System.out.print(n);
        }else{
            printInBinary(n/2); //n울 2로 나눈 몫을 2진수로 변환
            System.out.print(n%2); //n을 2로 나눈 나머지 
        }
    }

    //배열의 합 구하기
    public static int sum(int n, int[] data){
        if(n<=0){
            return 0;
        }else{
            return sum(n-1 , data) + data[n-1];
        }
    }

    //데이터파일로부터 n개의 정수 읽어오기 
    public void readFrom(int n, int[] data, Scanner in){
        if(n==0){
            return;
        }else{
            // n개의 정수를 data[0], ... , data[n-1] 에 저장
            readFrom(n-1, data, in);
            data[n-1] =in.nextInt();
        }
    }

}
