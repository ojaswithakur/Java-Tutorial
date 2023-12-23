import java.util.*;
public class numberpy{
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
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}