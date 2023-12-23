import java.util.*;
public class ques{
    public static void main(String args[]){
        System.out.println("Enter the number upto which the sum is to be calculated.");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=0; i<=num; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}