package controlflow;

import java.util.Scanner;

public class LearnNestedForLoop {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        int rowNumber=input.nextInt();
        for(int i=1; i<=rowNumber; i++){
            for(int j=1; j<=i; j++){
                System.out.println(j+" ");
            }
            System.out.println();
        }

    }
}
