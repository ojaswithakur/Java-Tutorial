import java.util.*;
public class diamond{
    public static void main(String args[]){
        System.out.println("Enter the no. of rows:");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int spaces;
        for(int i=1; i<=rows; i++){
            spaces=rows-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=rows; i>=1; i--){
            spaces=rows-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        
    }
}