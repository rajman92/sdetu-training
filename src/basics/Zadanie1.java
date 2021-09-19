package basics;

public class Zadanie1 {

    public static void main(String[] args){

        // 1. Napisz funkcję, która przyjmuje wartość n, zwraca sumę liczb od 1 do n
        
        System.out.println(suma(4));
        
        System.out.println("\n**************\n");
        
        // 2. Napisz funkcję, która oblicza wartość silni
        
        System.out.println("Silnia: " + silnia(5));
        
        System.out.println("\n**************\n");
        
        // 3. Napisz 3 funkcje, które przyjmują szereg jako parametr i zwracają minimalną, średnią i maksymalną wartość tego szeregu
        
        int[] wartosci = {5, -2, 0, 234, -438, 63};
        
        System.out.println("Wartość minimalna w szeregu wynosi: " + znajdzMin(wartosci));
        
        System.out.println("\n**************\n");
        
        System.out.println("Wartość maksymalna w szeregu wynosi: " + znajdzMax(wartosci));

        System.out.println("\n**************\n");

        System.out.println("Średnią wartością szeregu jest: " + znajdzSr(wartosci));
    }

    public static int suma(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(suma + " + " + i);
            suma = suma + i;
            System.out.println(" = " + suma);
        }
        return suma;
    }
    
    public static int silnia(int x) {
        if (x == 0) {
            return 1;
        }
        System.out.print(x + ", ");
        return x * silnia(x - 1);
    }
    
    public static int znajdzMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
        public static int znajdzMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
        public static int znajdzSr(int[] arr) {
            int sr = 0;
            for (int q = 0; q < arr.length; q++) {
                sr = sr + arr[q];
            }
            System.out.println("Suma: " + sr);
            return (sr/arr.length);
        }
}
