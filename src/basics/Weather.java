package basics;

public class Weather {
    
    public static void main(String[] args){
        
        // Program ten będzie nam podpowiadał, w co się ubrać w odniesieniu do pogody (temperatura i stan Słońca).
        int temperatura = 5;
        String sunCondition = "Pochmurno";
        
        if (temperatura > 25) {
            System.out.println("Jest ciepło i przyjemnie. Ubierz krótkie spodenki i podkoszulkę.");
        }
        else if ((temperatura > 15) && (sunCondition == "Słonecznie")) {
            System.out.println("Jest trochę chłodniej. Ubierz koszulę z długim rękawem i jeansy.");
            System.out.println("Załóż czapkę, by osłonić się przed Słońcem.");
        }
        else if ((temperatura > 10) || (sunCondition == "Pochmurno")) {
            System.out.println("Jest chłodny dzień. Ubierz coś cieplejszego");
        }
        else {
            System.out.println("Jest zimno. Ubierz sweter i czapkę.");
        }
        System.out.println("The program is ending...");
        
        
        
    }
    
}
