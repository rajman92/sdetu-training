package oop;

public class BankAccount implements IRate {

    // Define variables - definicja zmiennych
    String accountNumber;
    
    // static >> należy do KLASY, a nie do instancji obiektu
    // final >> stała nie zmienna (często występuje w postaci static final)
    private static final String routingNumber = "012345";   // numer rozliczeniowy // private static final - jest dostępne jedynie jeśli użyjemy go w innej metodzie
    
    // Zmienne Instancji
    private String name;
    private String pesel;
    String accountType;
    double balance = 0;
    
    // Definicje konstruktorów - unikalne metody
        // 1. Służą do definiowania / ustawiania / inicjowania właściwości obiektu,
        // 2. Konstruktory są domyślnie wywoływane podczas tworzenia instancji / automatycznie
        // 3. Nazywają się tak samo jak class'a
        // 4. Nie posiadają typów zwrotnych / void, string, double...
    
    BankAccount() { // to jest nasz konstruktor
        System.out.println("NOWE KONTO POMYŚLNIE STWORZONE");
    }
    // Overloading: wywoływanie metody z taką samą nazwą, ale z różnymi argumentami
    BankAccount(String accountType) {
        System.out.println("NOWE KONTO: " + accountType);
    }
    BankAccount(String accountType, double initDeposit) { // inicjacja depozytu
        // initDeposit, accoutType, Msg >> wszystkie zmienne należą do jednego lokalnego bloku
        System.out.println("NOWE KONTO: " + accountType);
        System.out.println("WPŁATA INICJALNA: " + initDeposit + " PLN");
        String Msg = null;
        if (initDeposit < 1000) {
            Msg = "BŁĄD: Inicjalny deposyt musi wynosić minimum 1000PLN";
        } else {
            Msg = "Dziękujemy za dokonanie inicjalnej wpłaty w wysokości: " + initDeposit + " PLN";
        }
        System.out.println(Msg);
        balance = balance + initDeposit;
    }
    
    // Getters / Setters
    
    // Chcemy pozwolić użytkownikowi na ustawienie/nadanie imienia/nazwy
    public void setName (String name) {
        this.name = "Mr. " + name;
    }
    public String getName () {
        return name;
    }
    
    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = "PESEL: " + pesel;
    }
    
    // Metody interfejsu
    public void setRate() {
        System.out.println("USTAWIANIE STOPY OPROCENTOWANIA");
    }
    public void increaseRate(){
        System.out.println("TEMPO WZROSTU OPROCENTOWANIA");
    }
    
    
    
    // Zdefiniowane metody - funkcje są nazywane metodami
    
    /*
    Tak więc zmienne lokalne są zdefiniowane w blokach, zdefiniowane w metodach, zdefiniowane w instrukcjach, zdefiniowane w pętlach.
    Istnieją tylko w tym bloku, a następnie w kolejnych blokach, ale nie w niczym powyżej lub po prostu w blokach.
    */
    
    // public - dostępne w projekcie, 
    // default - dostępne w pakunku, 
    // private - dostępne jedynie z poziomu klasy, 
    // protected - działa jak default, tylko jest dodatkowo dostepne przez dziedziczenie
    
    // Zmienne dostępne są jedynie w bloku w którym je zdefiniowano, np. gdybyśmy chcieli w void deposit odnieść się do initDeposit, będzie on zwyczajnie niedostępny
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("DEPOZYT");
        // System.out.println(initDeposit);
    }
    
    void withdraw(double amount) {
        balance = balance - amount;
        showActivity("WYPŁATA");
    }
    
    // private - can only be called from within the class
    private void showActivity(String activity) {
        System.out.println("TWOJA OSTATNIA TRANSAKCJA: " + activity);
        System.out.println("NOWY STAN KONTA WYNOSI: " + balance + " PLN");
        
    }
    
    void checkBalance() {
        System.out.println("Stan konta wynosi: " + balance + " PLN");
    }
    
    void getStatus() {
        
    }

    @Override
    public String toString() {
        return "[ IMIE i NAZWISKO: " + name + ". NUMER KONTA: " + accountNumber + ". NUMER ROZLICZENIOWY: " + routingNumber + ". STAN KONTA: " + balance + " PLN ]";
    }

}
