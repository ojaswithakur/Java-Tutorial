import java.util.*;
public class arrays{
    public static void main(String args[]){
        /*
        int numbers[]={67,98,77};
        //int[] marks= new int[3];
        int marks[]= new int[3];
        marks[0]=34; //Chemistry
        marks[1]=64; //Physics
        marks[2]=44; //Mathematics
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
        */
       /*
       System.out.println("Enter the size of array:");
       Scanner sc= new Scanner(System.in);
       int size=sc.nextInt();
       int numbers[]=new int[size];

       //input
       for(int i=0; i<size; i++){
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        numbers[i]=num;
       }

       //output
       for(int i=0; i<3; i++){
            System.out.println(numbers[i]);
        }
        */

        //Take an array as input from the user.Search for a given number x and print
        //the index at which it occurs.
       System.out.println("Enter the size of array:");
       Scanner sc= new Scanner(System.in);
       int size=sc.nextInt();
       int numbers[]=new int[size];

       //input
       for(int i=0; i<size; i++){
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        numbers[i]=num;
       }
       System.out.println("Enter the element you want to search in an array");
       int element=sc.nextInt();

       //size=numbers.length

       //output
       for(int i=0; i<3; i++){
        if (numbers[i]==element){
            System.out.println("The index of the element is "+i);
        }
       }

    }
}