/*
import java.util.*;
public class twoDarrays{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows= sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols= sc.nextInt();

        int numbers[][]=new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter element for matrix:");
                numbers[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
// Take a matrix as input from the user.Search for a given number x and print the
//indices at which it occurs.
import java.util.*;
public class twoDarrays{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows= sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols= sc.nextInt();


        int numbers[][]=new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter element for"+ i+" "+ j);
                numbers[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the number you want to search:");
        int num= sc.nextInt();


        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        //check
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if (numbers[i][j]==num){
                    System.out.println("The indices of the element are:");
                    System.out.print(i + ", ");
                    System.out.print(j);
                }
            }
        }

    }
}