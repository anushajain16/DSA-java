package Recursion;
//Find the first and last occurance of an element
public class occurance_of_element {

    public static int first=-1;
    public static int last=-1;

    public static void occurance(String s, char element,int index){// Checking from start
        if(index==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(index)==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        occurance(s, element, index+1);
    }

    public static void occurance1(String s, char element, int index){
        if(index==-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(index)==element){
            if(last==-1){
                last = index;
            }
            else{
                first = index;
            }
        }
        occurance1(s, element, index-1);
    }

    public static void main(String[] args){
        String s="abaacdaefaah";
        occurance(s, 'a',0);
        occurance1(s, 'a', s.length()-1);
    }
}
