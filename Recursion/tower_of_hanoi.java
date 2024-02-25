package Recursion;
//Tower of hanoi or tower of brahma

public class tower_of_hanoi {
    public static void recursion(int n, char source_rod,char destination_rod, char helper_rod){
        if(n==1){
            System.out.println("Move disk 1 from " +source_rod+ " to "+destination_rod);
        }
        else{
            recursion(n-1, source_rod, helper_rod, destination_rod);
            System.out.println("Move disk " +n+ " from " +source_rod+ " to "+destination_rod);
            recursion(n-1, helper_rod, destination_rod, source_rod);
        }
    }

    public static void main(String[] args){
        recursion(2, 'A', 'C', 'B');
    }
}
