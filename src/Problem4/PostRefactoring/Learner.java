package Problem4.PostRefactoring;

public interface Learner {
    public void enroll(String code);
    public void payTuition(double amount);
}

class Student implements Learner{
    private String name;
    public Student(String name){
        this.name = name;
    }

    public void enroll(String code){
        System.out.println(name + " is now enrolled in " + code);
    }

    public void payTuition(double amount){
        System.out.println(name + " pays " + amount + " MAD");
    }
}

class TeachingAssistant implements Learner,Teacher{
    private String name;
    public TeachingAssistant(String name){
        this.name = name;
    }

    public void enroll(String code){
        System.out.println(name + " is now enrolled in " + code);
    }

    public void payTuition(double amount){
        System.out.println(name + " pays " + amount + " MAD");
    }

    public void teach(String code){
        System.out.println(name + "teaches " + code);
    }

    public void gradeExams(String code){
        System.out.println(name + " grades " + code);
    }
}