package algorithm;

public class 순환알고리즘설계 {
    public static void main(String[] args) {
        //순차탐색을 위한 순환 알고리즘 설계

    

    }

    //반복문을 이용한 순차탐색
    public static int search(int [] data, int n, int target){
        for(int i=0; i<n; i++){
            if(data[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    //재귀함수를 이용한 순차탐색 (앞에서부터)
    public static int searchRecursion(int [] data, int begin, int end, int target){
        if(begin > end){
            return -1;
        }
        else if(target == data[begin]){
            return begin;
        }else{
            return searchRecursion(data, begin +1, end, target);
        }
    }

    public static int searchRecursion2(int[] data, int begin, int end, int target){
        if(end < begin){
            return -1;
        }else if( target == data[end]){
            return end;
        }else{
            return searchRecursion2(data, begin, end -1 , target);
        }
    }

    //최대값 찾기
    
}
