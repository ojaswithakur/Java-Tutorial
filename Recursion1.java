import java.util.*;
public class Recursion1{
    /*
    //print n natural numbers
    public static void printNumb(int n){
        if (n==0){
            return;
        }
        System.out.print(n+ " ");
        printNumb(n-1);
    }

    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        printNumb(num);
        
    }
    */

   /*
   //sum of n natural numbers
   public static void printSum(int i, int n, int sum){
      if(i==n){
        sum=sum+i;
        System.out.println("The sum is "+sum);
        return;
      }
      sum=sum+i;
      printSum(i+1, n, sum);
      
   }
   public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        printSum(1, num, 0);
   }
   */

   /*
   //print the factorial of a number
  public static int calcFactorial(int n){
    if(n==1 || n==0){
        return 1;
    }
    int fact=calcFactorial(n-1);
    int fact1= n*fact;
    return fact1;
  }
  public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int ans=calcFactorial(num);
        System.out.print("The factorial is "+ ans);
  }
  */

/*
 // Fibonacci Series.
  public static void printFib(int a, int b, int n){
    if(n==0){
        return;
    }
    int c=a+b;
    System.out.print(c+" ");
    printFib(b, c, n-1);
  }
  public static void main(String args[]){
    int a=0;
    int b=1;
    System.out.print("Enter the number: ");
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(a+" ");
    System.out.print(b+" ");
    printFib(a, b, num-2);
  }

*/

/*
//stack height=n
   public static int calcPower(int x, int n){
    if (n==0){
        return 1;
    }
    if (x==0){
        return 0;
    }
    int powxmn=calcPower(x, n-1);
    int powx=x * powxmn;
    return powx;
   }
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the base");
    int base = sc.nextInt();
    System.out.println("Enter the power");
    int power = sc.nextInt();
    int ans=calcPower(base, power);
    System.out.print(ans);
   }
*/

//stack height=log2n
   public static int calcPower(int x, int n){
    if (n==0){
        return 1;
    }
    if (x==0){
        return 0;
    }
    if(n%2==0){
        return calcPower(x, n/2)* calcPower(x, n/2);
    }
    else{
        return calcPower(x, n/2)* calcPower(x, n/2)* x;
    }
   }
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the base");
    int base = sc.nextInt();
    System.out.println("Enter the power");
    int power = sc.nextInt();
    int ans=calcPower(base, power);
    System.out.print(ans);
   }

}