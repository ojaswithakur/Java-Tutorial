import java.util.*;
public class multi{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=0; i<=10; i++){
            System.out.print(num);
            System.out.print("x");
            System.out.print(i);
            System.out.print("=");
            System.out.println(num*i);      
            }

    }
}