package basics;

public class Days {
    
    public static void main(String[] args){
        
        // Użycie innych części kodu w zależności od wartości.
        
        String dzienTygodnia = "Wtorek";
        
        switch (dzienTygodnia) {
            case "Poniedziałek" : 
                System.out.println("Dziś jest Poniedziałek :<");
                break;
            case "Wtorek" : 
                System.out.println("Dziś jest Wtorek.");
                break;
            case "Środa" : 
                System.out.println("Dziś jest Środa :)");
                break;
            case "Czwartek" : 
                System.out.println("Dziś jest Czwartek.");
                break;
            case "Piątek" : 
                System.out.println("Dziś jest Piątek.");
                break;
            }
        
        
    }
    
}
