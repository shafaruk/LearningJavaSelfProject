package controlflow;

public class LearnIfandElse {


    public static void main(String[] args) {
        int number =24;

        if(number ==24){
            System.out.println("Number found");
        }else
            {
            System.out.println("Number is not found");
        }


        int age=21;
        if(age>=18 && age<21){
            System.out.println("You can buy cigarette");
        }else{
            System.out.println("age is 25");
        }

        int age1 =19;
        if(age1>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Under age");
        }

    }


}
