package laboop;

public class StudentDatabase {

   // Zmienne
    
    private String imie;
    private String nazwisko;
    private static int id = 1000;
    private String stuId;
    private String pesel;
    private String email;
    private String nrTelefonu;
    private String miasto;
    private String wojewodztwo;
    private String kursy = "";
    private static final int kosztKursu = 800;
    private double balance = 0;
    
    
    // Kursy
    
    //String[] kursy = {"Informatyka" + "Matematyka" + "Fizyka" + "Biologia" + "J. Polski" + "J. Angielski" + "Zabobony i Czary"};
    
//    String[] kurs = new String[9];
//    
//    kurs[0] = "Informatyka";
//    kurs[1] = "Matematyka";
//    kurs[2] = "J. Polski";
//    kurs[3] = "J. Angielski";
//    kurs[4] = "J. Hiszpański";
//    kurs[5] = "Fizyka";
//    kurs[6] = "Biologia";
//    kurs[7] = "Marketing";
//    kurs[8] = "Zarządzanie";
//    kurs[8] = "Zabobony i Czary";
//    
    
    // Konstruktor
    
    StudentDatabase() {
        System.out.println("~~~~~~~~~~NOWE KONTO ZOSTAŁO POMYŚLNIE UTWORZONE...");
        System.out.println("~~~~~~~~~~WOAH MAMMA");
        System.out.println("~~~~~~~~~~WITAMY NA NASZEJ UCZELNI :) ");
        System.out.println("~~~~~~~~~~PROSIMY O PODANIE NASTĘPUJĄCYCH DANYCH:");
        System.out.println("~~~~~~~~~~IMIĘ, NAZWISKO, NUMER PESEL, NUMER TELEFONU KONTAKTOWEGO, MIASTO ZAMIESZKANIA ORAZ WOJEWÓDZTWO.\n");
    }
    
//    StudentDatabase() {
//        
//    }
    
    // Metody
    
    public void enroll(String kurs) {
        this.kursy = this.kursy + " " + kurs;
        balance = balance + kosztKursu;
    }
    
    public void pay(double kwota) {
        balance = balance - kwota;
            System.out.println("Dziękujemy za dokonanie wpłaty, w wysokości: " + kwota + " PLN");
        if (balance == 0) {
            System.out.println("Twoje kursy zostały w całości opłacone, dziękujemy.");
        }
        else{
            System.out.println("Pozostała kwota do zapłaty: " + balance + " PLN \n");
        }
    }
    
    void checkBalance() {
        System.out.println("Twoje saldo wynosi: " + balance + " PLN.");
    }
    
    void showCourses() {
        System.out.println(kursy);
    }
    
    // Settery + Gettery
    
    public String getImie() {
        return imie + " " + nazwisko;
    }
    public void setImie(String imie, String nazwisko, String pesel, String nrTelefonu, String miasto, String wojewodztwo) {
        id++;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.nrTelefonu = nrTelefonu;
        setStuId();
        this.miasto = miasto;
        this.wojewodztwo = wojewodztwo;
        this.email = nazwisko.toLowerCase() + "." + imie.toLowerCase() + id + "@student.pl";
        System.out.println("Twój adres E-mail: " + email);
        showActivity("REJESTRACJA\n");
        //System.out.println(toString);
    }
    
    private void setStuId() {
        int max = 9000;
        int min = 1000;
        int losowanko = (int) (Math.random() * (max - min));
        losowanko = losowanko + min;
        // System.out.println(losowanko);
        stuId = id + "" + losowanko + pesel.substring(7);
        System.out.println("Twój indywidualny numer ID: " + getStuId());
    }
    public String getStuId() {
        return stuId;
    }
        
    private void showActivity(String activity) {
        System.out.println("~~~~~~~~~~TWOJA OSTATNIA CZYNNOŚĆ: " + activity);
        
    }
    
    public void getEmail() {
        System.out.println("~~~~~~~~~~TWÓJ ADRES E-MAIL: " + email);
    }

    public String getPesel() {
        return pesel;
    }
    
    public String getNrTelefonu() {
        return nrTelefonu;
    }
    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = "Numer Telefonu: " + nrTelefonu;
    }

    public String getMiasto() {
        return miasto;
    }
    public void setMiasto(String miasto) {
        this.miasto = "Miasto: " + miasto;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }
    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = "Województwo: " + wojewodztwo;
    }
    
        
    @Override
    public String toString(){
        return "[ IMIĘ i NAZWISKO: " + getImie() + " ]\n[ ADRES E-MAIL: " + email + " ]\n[ NUMER ID: " + getStuId() + " ]\n[ TWOJE KURSY: " + kursy + " ]\n[ TWOJE SALDO: " + balance + " PLN ]\n"  ;
    }

    /**
     * @return the stuId
     */
    
}
