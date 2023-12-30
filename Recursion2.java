import java.util.*;
public class Recursion2{
    
    /*
    //tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    
// Reversal of a string
   public static void printRev(String str, int idx){
    if(idx==0){
        System.out.print(str.charAt(idx)+" ");
        return;
    }
    System.out.print(str.charAt(idx)+" ");
    printRev(str, idx-1);
   }
    public static void main(String args[]){
        
        System.out.println("Enter the no. of disks:");
        Scanner sc= new Scanner(System.in);
        int nOfDisk=sc.nextInt();
        towerOfHanoi(nOfDisk, "S", "H", "D");
        

       System.out.println("Enter the string");
       Scanner sc= new Scanner(System.in);
       String s =sc.nextLine();
       printRev(s, s.length()-1);
    }
    */
   

   /*
   //Find occurence
   public static int first=-1;
   public static int last=-1;
   
   public static void findOccurence(String str, int idx, char ele){
    char currChar=str.charAt(idx);
    if(idx==str.length()-1){
        System.out.println("First occurence at "+ first);
        System.out.println("Last occurence at "+ last);
        return;
    }
    if(currChar == ele){
        if(first==-1){
            first=idx;
        }
        else{
            last=idx;
        }
    }
    findOccurence(str, idx+1, ele);
   }
   public static void main(String args[]){
        System.out.println("Enter the string:");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.println("Enter the character to be searched:");
        char element=sc.next().charAt(0);
        findOccurence(s, 0 , element);
   }
   */

/*
// is the array sorted?
  public static boolean isSorted(int arr[], int idx){
    if(idx == arr.length -1){
        return true;
    }
    if(arr[idx]<arr[idx+1]){
        //array is sorted till now
        return isSorted(arr, idx+1);
    }
    else{
        return false;
    }
  }
  public static void main(String args[]){
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
       boolean ans=isSorted(numbers, 0);
       System.out.print(ans);

  }
  */

/*
//moving all X towards the end
 public static void moveAllX(String str, int count, int idx, String newString){
    if(idx== str.length()-1){
        for(int i=0; i<count; i++){
            newString= newString+'x';
        }
        System.out.print(newString);
        return;
    }
    char currChar=str.charAt(idx);
    if (currChar== 'x'){
        count++;
        moveAllX(str, count, idx+1, newString);
    }
    else{
        newString=newString + currChar;
        moveAllX(str, count, idx+1, newString);
    }
 }

 public static void main(String args[]){
    System.out.println("Enter the string:");
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    moveAllX(st, 0, 0, "");
 }
 */

/*
//remove duplicates
public static boolean[] map=new boolean[26];
public static void removeDuplicates(String str, int idx, String newString){
    if(idx==str.length()){
        System.out.println(newString);
        return;
    }
    char currChar=str.charAt(idx);
    if(map[currChar-'a']==true){
        removeDuplicates(str, idx+1, newString);
    }
    else{
        newString=newString+currChar;
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newString);
    }
}
public static void main(String args[]){
    System.out.println("Enter the string:");
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    removeDuplicates(st, 0, "");
 }
 */
   
   /*
   // Find subsequences
   public static void subsequences(String str, int idx, String newString){
    if(idx==str.length()){
        System.out.println(newString);
        return;
    }
    char currChar=str.charAt(idx);
    //to be
    subsequences(str, idx+1, newString+currChar);
    //not to be
    subsequences(str, idx+1, newString);
   }
   public static void main(String args[]){
    System.out.println("Enter the string:");
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    subsequences(st, 0, "");
    
   }
   */

/*
//unique subsequences
public static void subsequencesUnique(String str, int idx, String newString, HashSet<String> sett){
    if(idx==str.length()){
        if(sett.contains(newString)){
            return;
        }
        else{
            System.out.println(newString);
            sett.add(newString);
            return;
        }
        
    }
    char currChar=str.charAt(idx);
    //to be
    subsequencesUnique(str, idx+1, newString+currChar, sett);
    //not to be
    subsequencesUnique(str, idx+1, newString, sett);
   }
   public static void main(String args[]){
    System.out.println("Enter the string:");
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    HashSet<String> set= new HashSet<>();
    subsequencesUnique(st, 0, "", set);
    
   }
*/

/*
//keypad combinations
   public static String[] keypad={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
   public static void printComb(String str, int idx, String combinations){
    if(idx==str.length()){
        System.out.println(combinations);
        return;
    }
    char currChar=str.charAt(idx);
    String mapping= keypad[currChar - '0'];

    for(int i=0; i<mapping.length(); i++){
        printComb(str, idx+1 , combinations+mapping.charAt(i));
    }
    
   }
   public static void main(String args[]){
    System.out.println("Enter the string:");
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    printComb(st, 0, "");
   }
   */ 
}