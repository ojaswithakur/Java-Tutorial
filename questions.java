//Enter 3 numbers from user & make function to print their average.
/*
import java.util.*;
public class questions{
    public static int calAvg(int a, int b, int c){
        int Average= (a+b+c)/3;
        System.out.println("The average is: "+ Average);
        return Average;
    }
    public static void main(String args[]){
        System.out.println("Enter first number :");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter second number :");
        int num2=sc.nextInt();
        System.out.println("Enter third number :");
        int num3=sc.nextInt();
        calAvg(num1, num2, num3);
    }


}
*/
/*
//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class questions{
    public static int sumOdd(int n){
        int x=0;
        for(int i=1; i<=n; i++){
            if(i%2 !=0){
                x=x+i;
            }
        }
        System.out.println("The sum is "+ x);
        return x;
    }
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sumOdd(num);
    }
}
*/

/*
//Write a function which takes in 2 numbers and returns the greater of them two.
import java.util.*;
public class questions{
    public static void whoIsGreater(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+ b);
        }
    
        else{
            System.out.println(b+" is greater than "+ a);
        }
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter first number:");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        whoIsGreater(num1, num2);
    }
    
}
*/
/*
//Write a function that takes in the radius as input and returns the circumference
//of the circle
import java.util.*;
public class questions{
    public static void calCircumference(float r){
        int pi=22/7;
        double circumference=2*3.14*r;
        System.out.println("The circumference is "+ circumference);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter the radius");
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextInt();
        calCircumference(rad);
    }
}
*/

/*
//Can vote or not
import java.util.*;
public class questions{
    public static void canYouVote(int a){
        if(a>=18){
            System.out.println("You are allowed to vote");   
        }
        else{
            System.out.println("Sorry!! You are not allowed to vote");
        }
    }
    public static void main(String args[]){
        System.out.println("Please enter your age:");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        canYouVote(age);
    }
}
*/
/*
//Write an infinite loop using do while condition
import java.util.*;
public class questions{
    public static void main(String args[]){
        int i=1;
        do{
            System.out.print("*");
        }while (i==1);
    }
}
*/

//enter the numbers till the user wants and at the end it should display the count of positive negative and zeroes entered.
//value of one number raised to the power of another
import java.util.*;
public class questions{
    public static void calDegree(int x, int n){
        int m=1;
        for(int i=1; i<=n; i++){
            m=m*x;   
        }
        System.out.println(m);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter the base number:");
        Scanner sc= new Scanner(System.in);
        int base= sc.nextInt();
        System.out.println("Enter the power to which base is raised:");
        int power= sc.nextInt();
        calDegree(base,power);
    }
}