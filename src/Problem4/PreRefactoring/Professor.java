package Problem4.PreRefactoring;

public class Professor implements UniversityMember{
    public final String name;
    public Professor(String name){
        this.name = name;
    }
    public void enrollInCourse(String code) {
        System.out.println(name + " enrolls in " + code);
    }
    public void payTuition(double amount) {
        throw new UnsupportedOperationException("Professors don't pay tuition.");
    }
    public void teach(String code) {
        System.out.println(name+ " is teaching " + code);
    }
    public void gradeExam(String code) {
        System.out.println("The exam(s) is(are) being graded for course " + code);
    }
    public void publishPaper(String title) {
        System.out.println(name + " has published his paper: " + title);
    }
}
