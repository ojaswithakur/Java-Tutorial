import java.util.*;
public class pattern{
    public static void main(String args[]){
        System.out.println("Enter the number of rows:");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols=sc.nextInt();
        for(int i=1; i<=rows; i++){
            
            for(int j=1; j<=cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}