import java.util.*;
public class rhombus{
    public static void main(String args[]){
        System.out.println("Enter the no. of rows:");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int j;
        for(int i=rows; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=rows; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}