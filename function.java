import java.util.*;
public class function{
    /*
    public static void printMyName(String name){
        System.out.println("Hello,"+ name);
        return;
    }
    */

   /*
   public static int calculateSum(int a, int b){
    int sum=a+b;
    System.out.println("The sum is: "+ sum);
    return sum;
   }
   */

/*
  public static int calculateProduct(int a, int b){
    int product= a*b;
    System.out.println("The product is: "+ product);
    return product;
  }
  */

    public static void printFactorial(int n){
        int factorial=1;
        for(int i= n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println("The factorial of "+ n + " is "+ factorial);
        return;
    }

    public static void main(String args[]){
        //System.out.println("Enter your name:");
        //Scanner sc= new Scanner(System.in);
        //String name= sc.next();
        //printMyName(name);

        /*
        System.out.println("Enter the first number:");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        calculateSum(num1, num2);
        */ 

       /*
       System.out.println("Enter the first number:");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        calculateProduct(num1, num2);
        */

       System.out.println("Enter the number:");
       Scanner sc= new Scanner(System.in);
       int num=sc.nextInt();
       printFactorial(num);

    }
}