package basics;

public class SalaryCalculator {
    
    public static void main(String[] args){
        
        // Stworzenie zmiennej decydującej o karierze
        
        // Declare a variable
        String kariera;
        System.out.println("Program is starting...");
        
        // Defined a variable
        kariera = "Software Developer";
        System.out.println("Moim zawodem jest: " + kariera + ".");
        
        // Declare & Define
        int godzinyTygodniowo = 40;
        int tygodnieRocznie = 50;
        double stawka = 42.50;
        
        double wynagrodzenie = godzinyTygodniowo * tygodnieRocznie * stawka;
        System.out.println("Moje roczne wynagrodzenie jako: " + kariera + ", przy stawce: " + stawka + "PLN na godzinę, wynosi: " + wynagrodzenie + "PLN.");
        
        // Roczne wynagrodznie
        // stawka * godzinyTygodniowo * tygodnieRocznie
    }
    
}
