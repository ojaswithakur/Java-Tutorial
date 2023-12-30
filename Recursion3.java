import java.util.*;
public class Recursion3{
    /*
    //printing Permutations
    //time complexity= 0(n!)
    public static void printPerm(String str, String permutation){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);
            String newStr =str.substring(0,i)+ str.substring(i+1);
            printPerm(newStr , permutation+currChar);
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the string:");
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        printPerm(st, "");
    }
    */

   /*
   //count total paths in a maze to move from (0,0) to (n,m)
   //can only move towards right or downwards
   public static int countPaths(int  i, int j, int m, int n){
    if(i==n || j==m){
        return 0;
    }
    if(i==n-1 && j==m-1){
        return 1;
    }
    //for moving downwards
    int downPaths=countPaths( i+1,  j,  m,  n);

    //for moving right
    int rightPaths=countPaths( i,  j+1,  m,  n);

    return downPaths+ rightPaths;
   }
   public static void main(String args[]){
    System.out.println("Enter the no. of rows");
    Scanner sc= new Scanner(System.in);
    int rows= sc.nextInt();
    System.out.println("Enter the no. of columns");
    int cols= sc.nextInt();
    int ans=countPaths(0,0,rows,cols);
    System.out.println(ans);
   }
   */

/*
  //placing tiles of size 1 x m on a floor of size n x m
   public static int placeTiles(int n, int m){
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }
    // vertically
    int vertPlacement= placeTiles(n-m, m);

    //horizontally
    int horiPlacement= placeTiles(n-1, m);

    return vertPlacement+ horiPlacement;
   }
   public static void main(String args[]){
    System.out.println("Enter the no. of rows");
    Scanner sc= new Scanner(System.in);
    int rows= sc.nextInt();
    System.out.println("Enter the no. of columns");
    int cols= sc.nextInt();
    int ans=placeTiles(rows,cols);
    System.out.println(ans);
   }
   */

/*
   //no. of ways in which you can invite n people to a party, single or in pairs
   public static int callGuests(int n){
    if(n<=1){
        return 1;
    }
    //if calling singly
    int ways1= callGuests(n-1);
    //if calling in a pair(n-1) ways to choose whom to pair with
    //rest (n-2) we'll call
    int ways2= (n-1) * callGuests(n-2);
    return ways1 + ways2;
   }
   public static void main(String args[]){
    System.out.println("How many guests?");
    Scanner sc= new Scanner(System.in);
    int guest=sc.nextInt();
    int ans=callGuests(guest);
    System.out.println(ans);
   }
   */
   
  //printing subsets of a given set
  public static void printSubset(ArrayList<Integer> subset){
    for(int i=-0; i<subset.size(); i++){
        System.out.print(subset.get(i)+ " ");
        
    }
    System.out.println();

  }
  public static void findSubsets(int n, ArrayList<Integer> subset){
    if(n==0){
        printSubset(subset);
        return;
    }
    //add hoga
    subset.add(n);
    findSubsets(n-1, subset);

    //add nahi hoga
    subset.remove(subset.size()-1);
    findSubsets(n-1, subset);
  }
  public static void main(String args[]){
    System.out.println("Enter the no. of natural numbers:");
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    ArrayList<Integer> subset= new ArrayList<>();
    findSubsets(num, subset);
  }
}
