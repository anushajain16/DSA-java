package Recursion;


public class range_of_nos{
    public static void range1(int n){ //Print numbers from 1 to 5 using recursion
        if(n==6){
            return;
        }
        else{
            System.out.print(n+" ");
            range1(n+1);
        }
    }

    public static void range2(int n){//Print numbers from 5 to 1 using recursion
        if(n==1){
            System.out.print(1);
        }
        else{
            System.out.print(n +" ");
            range2(n-1);
        }
    }

    public static void range3(int x, int n){//Print numbers from x to n using recursion where n is less than x
        if(x==n+1){
            return;
        }
        else{
            System.out.print(x +" ");
            range3(x+1, n);
        }

    }
    
    public static void main(String [] args){
        range1(1);
        System.out.println();
        range2(5);
        System.out.println();
        range3(4, 7);
        System.out.println();
        range4(1);

    }

    public static void range4(int n){
        if(n==6){
            return ;
        }
        else{
            System.out.print(n+" ");
            range4(n+1);
        }
    }
}