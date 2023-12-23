import java.util.*;
public class butterfly{
    public static void main(String args[]){
        System.out.println("Enter the no. of rows:");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        //upper half
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");  
            }
            int spaces= 2*(rows-i);
            for(int l=1; l<=spaces; l++){
                System.out.print(" ");  
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");  
            }
            System.out.println();
        }
        //lower half
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");  
            }
            int spaces= 2*(rows-i);
            for(int l=1; l<=spaces; l++){
                System.out.print(" ");  
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}