import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1-3: ");
        int n = sc.nextInt();
        if (n==1) {
            System.out.println("Hello");
        } else if(n==2){
            System.out.println("Namaste");
            
        }else if (n==3) {
            System.out.println("Bonjour");
        }else{
            System.out.println("Please enter valid number");
        }
    }
}
