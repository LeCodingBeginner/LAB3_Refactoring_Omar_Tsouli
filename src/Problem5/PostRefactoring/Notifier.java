package Problem5.PostRefactoring;

public interface Notifier {
    void notify (String to,String message);
}

class EmailNotifier implements Notifier{
    private String email;

    public EmailNotifier(String email){
        this.email = email;
    }

    public void notify(String email,String message){
        System.out.println("[Email to " + email + " ]" + message);
    }
}

class SmsNotifier implements Notifier{
    private String phoneNumer;

    public SmsNotifier(String phoneNumer){
        this.phoneNumer = phoneNumer;
    }

    public void notify(String phoneNumer,String message){
        System.out.println("[SMS to " + phoneNumer + " ]" + message);
    }
}