package basics;

public class Zad1 {

    public static void main(String[] args){
        
        int[] wartosci = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Wartość minimalna w szeregu wynosi: " + znajdzMin(wartosci));
        
        System.out.println("\n**************\n");
        
        System.out.println("Wartość maksymalna w szeregu wynosi: " + znajdzMax(wartosci));

        System.out.println("\n**************\n");

        System.out.println("Średnią wartością w szeregu jest: " + znajdzSrd(wartosci));

    }
    
    public static int znajdzMin(int[] szer) {
        
        int min = szer[0];
            for (int i = 0; i < szer.length; i++) {
                if (szer[i] < min) {
            min = szer[i];
            }
        }
        return min;
    }
    
    public static int znajdzMax(int[] szer) {
    int max = szer[0];
    for (int i = 0; i < szer.length; i++) {
        if (szer[i] > max) {
            max = szer[i];
            }
        }
        return max;
    }
    
    public static int znajdzSrd(int[] szer) {
        int srd = 0;
            for (int i = 0; i < szer.length; i++) {
                srd = srd + szer[i];
        }
        return (srd / szer.length);
    }
}
