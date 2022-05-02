package day46.assignment.src;

public class HiFriend {
    public static void main(String[] args){  
        String hi="Hi ";  
        String firstName="Shane ";  
        String lastName="Roberts"; 
        String punctuation="!";
        String fullName=firstName.concat(lastName);
        String s = String.join("", hi, fullName, punctuation);
        System.out.println(s);
       }  
}
//I know I made that harder than I needed but I wanted to test out different concat methods