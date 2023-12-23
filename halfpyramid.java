import java.util.*;
public class halfpyramid{
    public static void main(String args[]){
        System.out.println("Enter the no. of rows:");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}