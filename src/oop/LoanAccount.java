package oop;

public class LoanAccount implements IRate {

    @Override
    public void setRate() {
        System.out.println("Stopa oprocentowania");
    }

    @Override
    public void increaseRate() {
        System.out.println("Tempo wzrostu");
    }
    
    public void setTerm(int term) {
        System.out.println("Ustawianie okresu na: " + term + " lat.");
    }

    public void setAmortSchedule() {
        System.out.println("Harmonogram amortyzacji");
    }

}
