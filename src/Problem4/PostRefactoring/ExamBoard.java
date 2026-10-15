package Problem4.PostRefactoring;

import java.util.List;

public class ExamBoard {

    public void collectGrades(List<Teacher> teachers, String code){
            for (Teacher t : teachers){
                if (t != null){
                    t.gradeExams(code);
                }
            }
    }

}
