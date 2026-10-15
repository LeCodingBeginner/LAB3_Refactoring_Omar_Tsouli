package Problem4.PostRefactoring;

import java.util.List;

public class Registrar {
    public void enrollAll(List<Learner> learners, String code){
        for (Learner l : learners){
            if (l != null){
                l.enroll(code);
            }
        }
    }

}
