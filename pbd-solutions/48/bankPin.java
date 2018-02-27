import java.util.Scanner;

class bankPin{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int pin = 12345;
        
        System.out.println("Welcome to the bank of Sauce.");
        System.out.print("Please enter your 5 digit PIN: ");
        int guess = input.nextInt();
    
        while (guess != pin){
        
            System.out.print("Oops! Try again: ");
            guess = input.nextInt();
            
        }
        
        System.out.print("Congratulations! You may access your mooniens.");
        
    }
    
 }
