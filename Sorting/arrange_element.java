package Sorting;
// Move all element to the end of the string

public class arrange_element {
    public static void arrangeElement(String s, int index, char c){
        char temp;
        char a=s.charAt(index);
        char b=s.charAt(index+1);
        if(index==s.length()-1){
            System.out.println(s);
            return;
        }
        else{
            if(s.charAt(index)==c){
                temp=a;
                a=b;
                b=temp;
                index++;
            }
            else{
                arrangeElement(s, index+1, c);
            }
            
        }
        
    }

    public static void main(String[] args){
        String s="axbcxxd";
        arrangeElement(s, 0, 'x');
        
    }
}
