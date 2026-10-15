package Problem4.PreRefactoring;

public interface UniversityMember{
    void enrollInCourse(String code);
    void payTuition(double amount);
    void teach(String code);
    void gradeExam(String code);
    void publishPaper(String title);
}
