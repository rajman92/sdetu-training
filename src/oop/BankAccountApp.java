package oop;

public class BankAccountApp {

    public static void main(String[] args){

        // Tworzenie nowego konta bankowego >> myśl o tworzeniu nowej instancji obiektu
        
        BankAccount acc1 = new BankAccount(); // tworzymy obiekt z klasy BankAccount
        acc1.accountNumber = "0123456789";
//        acc1.routingNumber = "123333"; // nawet nie możemy zmienić, ponieważ routingNumber został oznaczony jako final   
        
        // acc1.name = "Johnny Bravo"; // zmieniliśmy name na private, więc już z tego poziomu nie możemy zmienić, czy nadać imienia "klientowi"
        // With Encapsulation : public API methods
        acc1.setName("Johnny Bravo");
        System.out.println(acc1.getName());
        acc1.setPesel("92032900000");
        System.out.println(acc1.getPesel());
        
        acc1.balance = 10000;
        acc1.setRate();
        acc1.increaseRate();
                
        acc1.deposit(1000);
        acc1.deposit(1500);
        acc1.deposit(3000);
        acc1.withdraw(2000);
        
        // Polymophism through overriding
        System.out.println(acc1.toString());
        
        // Polymophism through overloading
        BankAccount acc2 = new BankAccount("Bieżący Rachunek");
        acc2.accountNumber = "9876543120";
        
        
        BankAccount acc3 = new BankAccount("Rachunek Oszczędnościowy", 5000);
        acc3.accountNumber = "123654789";
        acc3.checkBalance();

        
        /*
        System.out.println(acc1.routingNumber);
        
        // Demo dziedziczenie
        
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Wilde Koyote";
        cd1.accountType = "Konto Inwestycyjne";
        System.out.println(cd1.toString());
        cd1.compound();
        
        */
    }

}
