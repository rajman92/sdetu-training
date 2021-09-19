package basics;

public class NumbersCalc {
    
    public static void main(String[] args){
        
        System.out.println("Program is starting...");
        
        printName();
        
        int numA = 10;
        int numB = 20;
        
        addNumbers(numA, numB); // To jest wywoływanie funcji.
        
        int product = multiplyNumbers(numA, numB); // To jest ustawianie czegoś porównywalnego do funcji.
        
        // System.out.println("Ilorazem liczb: " + numA + " i " + numB + ", jest: " + multiplyNumbers(numA, numB) + ".");
        
        System.out.println("Ilorazem liczb: " + numA + " i " + numB + ", jest: " + product + ".");
    }
    
    static void printName() {
        System.out.println("My name is Piotr.");
    }
            
    static void addNumbers(int numberA, int numberB) {
        // Funkcja ta będzie dodawała dwie liczby.
        
        int sum = numberA + numberB;
        
        System.out.println("Sumą liczb: " + numberA + " i " + numberB + ", jest: " + sum + ".");
        
    }
    
    static int multiplyNumbers(int valueA, int valueB){
            // Funkcja ta będzie mnożyła dwie liczby.
            
            int product = valueA * valueB; //product to iloczyn po angielsku o.O
            addNumbers(product + 50, product); // Można wywoływać funcję z poziomu funcji.
            return product;
            
    }
            
    
    
}
