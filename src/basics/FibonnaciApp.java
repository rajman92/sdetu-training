package basics;

public class FibonnaciApp {

    public static void main(String[] args){

        // Ciąg Fibonacciego określany jest sumą dwóch poprzednich numerów w ciągu
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = fib(1) + fib(0) = 1 + 0 = 1
        // fib(3) = fib(2) + fib(1) = 1 + 1 = 2
        // fib(4) = fib(3) + fib(2) = 2 + 1 = 3
        // fib(5) = fib(4) + fib(3) = 3 + 2 = 5

        System.out.println(fib(5));
        
        // factorial number (silnia)
        // 1! = 1 * 1
        // 2! = 2 * 1
        // 3! = 3 * 2 * 1
        // 4! = 4 * 3 * 2 * 1
        
        System.out.println(silnia(5));    
    }

    public static int fib(int n) {
        
        if ( n == 0 ) {
            return 0;
        }
        else if ( n == 1 ) {
            return 1;
        }
        return ((fib(n-1)) + (fib(n-2))); // recursion ( Rekurencja, zwana także rekursją – odwoływanie się np. funkcji lub definicji do samej siebie. )
    }
    
    
    public static int silnia(int x) {
        
            if ( x == 0) {
                return 1;
            }
            return (x * silnia(x - 1));
            
    }
}

