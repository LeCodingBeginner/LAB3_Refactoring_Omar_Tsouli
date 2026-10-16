package Problem5.PostRefactoring;

public class EnrollmentService {
    private final StudentRepository s;
    private final Notifier not;
    public EnrollmentService(StudentRepository s , Notifier not){
        this.s = s;
        this.not = not;
    }

    public void enroll(String cne,String name,String email){
        if (cne == null || cne.isBlank()) throw new IllegalArgumentException("CNE is required");
        if (s.exists(cne)) throw new IllegalStateException("Already enrolled: " + cne);
        s.save(cne, name, email);
        not.notify(email, " Welcome " + name + ", you are enrolled.");
    }

    public static void main(String[] argv){
        CsvStudentRepository s = new CsvStudentRepository("filename.csv");
        SmsNotifier n = new SmsNotifier("0612345678");

        EnrollmentService e = new EnrollmentService(s,n);

        e.enroll("22885676","LOUGNIDI Younes","younes@lougnidi.com");

        e.enroll("22885676","LOUGNIDI Younes","younes@lougnidi.com");
    }


}
