
package evenorodd;

import java.util.Scanner;

public class EvenorOdd {

     static Scanner sc;
    public static void check(int num){
    
        
        sc = new Scanner(System.in);
        
        
        int result = num %2;
        
        if(result ==0){
        
               System.out.println(num +" its even");
               
        }else{
            System.out.println(num +" is odd");
        
        }
    
    }
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        
        System.out.println("enter your choice");
        System.out.println("1. OddorEven");
        System.out.println("2.Exit");
        String choice = sc.nextLine();
        
        if(Integer.parseInt(choice)==1){
            System.out.println("OddOrEven");
        }else{
            System.out.println("exiting.....");
        }
        
        
    }
    
}
