package laboop;

public class StudentDatabaseApp {

    public static void main(String[] args){

        
        StudentDatabase stu1 = new StudentDatabase();
        StudentDatabase stu2 = new StudentDatabase();
        StudentDatabase stu3 = new StudentDatabase();
        
        stu1.setImie("Johnny", "Bravo", "92032933547", "777555222", "LA", "California");
        stu2.setImie("Coyote", "Wilde", "82090168791", "444999123", "Łódź", "Łódzkie");
        stu3.setImie("Dick", "Dastardly", "62080458712", "333888321", "Tajne", "XXX");
        
        System.out.println(stu1.getImie());
        
        stu1.enroll("Gym123");
        stu1.enroll("Pool101");
        stu1.enroll("Lollygagging720");
        
        stu1.showCourses();
        stu1.checkBalance();
        stu1.pay(600);
        stu1.pay(1800); // Very nice
        
        System.out.println(stu1.toString());
                        
        stu2.enroll("Tracking360");
        
        stu2.showCourses();
        stu2.checkBalance();
        
        System.out.println(stu2.toString());
        
        stu3.enroll("Aviation180");
        stu3.enroll("Dog-petting147");
        
        System.out.println(stu3.toString());
        
        stu3.showCourses();
        stu3.checkBalance();
        stu3.pay(5.50);
        
//        StudentDatabase acc1 = new StudentDatabase();
        
//        acc1.setImie("Johnny", "Bravo");
//        acc1.setPesel("98765432100");
//        acc1.setNrTelefonu("333-666-999");
//        acc1.setMiasto("Łódź");
//        acc1.setWojewodztwo("łódzkie");
//        acc1.getEmail();

    }

}
