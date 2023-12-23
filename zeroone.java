import java.util.*;
public class zeroone{
    public static void main(String args[]){
        System.out.println("Enter the no. of rows:");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int number=1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(number+ " ");
                }
                else{
                    System.out.print((number-1)+" ");
                }
                
            }
            System.out.println();
        }
    }
}