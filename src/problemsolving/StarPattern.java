package problemsolving;

import java.sql.SQLOutput;

public class StarPattern {

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=1; k<=10; k++){
            for(int l=10; l>=k;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
