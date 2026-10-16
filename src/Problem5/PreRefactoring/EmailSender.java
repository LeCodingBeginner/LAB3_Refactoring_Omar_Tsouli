package Problem5.PreRefactoring;

public class EmailSender {
    private String email;

    public EmailSender(String email){
        this.email = email;
    }

    public void send(String email,String message){
        System.out.println("[Email to " + email + " ]" + message);
    }
}

