package problemsolving;

public class LearnPalindrome {

    public static void main(String[] args) {

       String a="";
       String rev="";

       for(int i=a.length()-1; i>=0; i--){
           rev=rev+a.charAt(i);
       }
        if(a.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }
        }
        }

