package basics;

public class Cities {

    public static void main(String[] args){
        
        // Declare and define an array (implicitly - bezwarunkowo, bez zastrzeżeń)
        // Zadeklarowanie i zdefiniowanie szyku/szeregu/tablicy
        String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
        
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        
        // Declare and define an array (only size)
        String[] states = new String[5];
        
        states[0] = "California";
        states[1] = "Ohio";
        states[2] = "New Jersey";
        states[3] = "Texas";
        states[4] = "Utah";
        
        System.out.println(states[0]);
        
        // Declare the array
        String[] countries;
        
        // Define the array
        countries = new String[3];
        
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "Poland";
        
        System.out.println(countries[2]);
        
        System.out.println("\n**************\n");
        
        // Do Loop: pierw tworzymy pętle, dopiero później warunki testowe
        
        int i = 0;
        
        do{
            System.out.println("STATE: " + states[i]);
            i = i + 1;
        } while (i < 5);
        
        System.out.println("\n**************\n");

        // While Loop: pierw tworzymy warunki testu, dopiero później samą pętlę
        
        int n = 0;
        
        boolean stateFound = false; // Standardowo boolean zwraca "true", ale z racji, że ustawiliśmy szukany parametr jako "false", musimy w pętli dodać "!" żeby zwróciło "false" 

        while (!stateFound) {
            String state = states[n];
            System.out.println(state);
            if (state == "Texas") {
                System.out.println("STATE FOUND!!");
                stateFound = true;
            }
            n++;
        }
        
        System.out.println("\n**************\n");
        
        // For Loop: najlepsza struktura do iteracji po pętli
        
        for (int x = 0; x < 5; x++) {
            System.out.println(states[x]);
        }


    }

}
