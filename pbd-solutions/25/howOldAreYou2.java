import java.util.Scanner;

class howOldAreYou2{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Hey, what's your name?: ");
    String name = input.nextLine();
    
    System.out.print("Ok, " + name + ", how old are you?: ");
    int age = input.nextInt();
    
    if (age < 16){
        System.out.print("You can't drive.");
    }
    
    else if (16 <= age && age <= 17){
        System.out.print("You can drive but not vote.");
        
    }
    
    else if (18 <= age && age <= 24){
        System.out.print("You can vote but not rent a car.");
        
    }
    
    else if (age >= 25){
        System.out.print("You can do pretty much anything.");
    }
        
    } 
}
