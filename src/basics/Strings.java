package basics;

public class Strings {

    public static void main(String[] args){

        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "The Lord of The Rings";
        
        if (bookTitle.contains(wordChoice)) { // Wyrażenie to zwraca boolean (true/false)
            System.out.println("The book does contain the word " + wordChoice + ".");
        }
        
        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")) { // Igroruje wielkość znaków
            System.out.println("The browser is Chrome.");
        }
        
        String firstName = "Piotr";
        String lastName = "Raj";
        String PESEL = "92032906654";
                
        // Print the initials + last 4 digits of PESEL
        
        System.out.println("There are " + PESEL.length() + " digits in your PESEL number.");
            
        System.out.print(firstName.substring(0, 1) + ". ");
        System.out.print(lastName.substring(0, 3) + ": ");
        System.out.print(PESEL.substring(PESEL.length() - 4) + "\n");
        
        
    }
        
}
