//Strings are immutable.

import java.util.*;
public class Strings{
    public static void main(String args[]){
        /*
        //String Declaration
        String name="Tony";
        String fullname="Tony Stark";
        String sentence="My full name is Tony Stark.";
        System.out.println(name);
        System.out.println(fullname);
        System.out.println(sentence);
        */

       /*
       System.out.print("Enter your name: ");
       Scanner sc= new Scanner(System.in);
       String name= sc.nextLine();
       System.out.print("Hello "+ name+", how are you?");
       */

      /*
      //concatenation
      String firstname="Ojaswi";
      String lastname="Thakur";
      String space=" ";
      String fullname= firstname+space+lastname;
      System.out.println(fullname);
      System.out.println("The length of the string is "+fullname.length());

      //charAt
      for(int i=0; i<fullname.length(); i++){
        System.out.println(fullname.charAt(i));
      }
      */

      /*
      //compareTo
      String name1="Ojaswi";
      String name2="Ojaswi";
      if(name1.compareTo(name2)==0){
        System.out.println("Strings are equal");
      }
      else{
        System.out.println("Strings are not equal");
      }
      */

      //substrings
      String sentence="My name is Ojaswi";
      //substring(beg index, end index)
      String name=sentence.substring(11, sentence.length());
      System.out.println(name);
      String name1=sentence.substring(11);
      System.out.println(name1);
    }
}