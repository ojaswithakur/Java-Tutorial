import java.util.*;
public class Bits{
    public static void main(String args[]){
        //Get 
        /*
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if((bitMask & n) ==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
        */
        
        //Set
        /*
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int newNumber= bitMask | n;
        System.out.println(newNumber);
        */
        

        //CLEAR
        /*
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int notBitMask= ~bitMask;
        int newNumber= notBitMask & n;
        System.out.println(newNumber);
        */  

       //Update
        System.out.print("By which binary digit should we update?  ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if(num==1){
            //set
            int newNumber= bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int notBitMask= ~bitMask;
            int newNumber= notBitMask & n;
            System.out.println(newNumber);
        }
    }
}