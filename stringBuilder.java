import java.util.*;
public class stringBuilder{
    public static void main(String args[]){
        /*
        StringBuilder sb= new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //using insert
        sb.insert(2, 'n');
        System.out.println(sb);

        sb.setCharAt(0, 'T');
        System.out.println(sb);

        //deleting two 'n' from the string
        sb.delete(2, 4);
        System.out.println(sb);

        //using append method
        StringBuilder greet=new StringBuilder("h");
        greet.append("e");
        greet.append("l");
        greet.append("l");
        greet.append("o");
        System.out.println(greet);

        //length of string
        System.out.println(greet.length());
        */
        StringBuilder sb= new StringBuilder("hello");
        for(int i=0; i<sb.length()/2; i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar= sb.charAt(front);
            char backChar= sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }
}