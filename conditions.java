import java.util.*;
public class conditions{
    public static void main(String args[]){
        System.out.println("Please enter your age:");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("You are an adult");   
        }
        else{
            System.out.println("Sorry!! You are not an adult");
        }
    }
}

