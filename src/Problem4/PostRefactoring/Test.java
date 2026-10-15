package Problem4.PostRefactoring;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] argv){
        TeachingAssistant TA = new TeachingAssistant("Omar");
        Student s = new Student("Younes");

        Registrar r = new Registrar();
        ExamBoard b = new ExamBoard();

        List<Learner> l = new ArrayList<>();
        List<Teacher> t = new ArrayList<>();
        l.add(TA);
        l.add(s);
        t.add(TA);

        r.enrollAll(l,"SE29O");

        b.collectGrades(t,"SE290");




    }
}
