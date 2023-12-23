import java.util.*;
public class Switch{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter choice \n 1/2/3");
        int choice= sc.nextInt();
        switch(choice){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }

        }
}
