package Problem5.PostRefactoring;

import Problem5.PreRefactoring.CsvStudentStore;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    public boolean exists(String cne);
    void save(String cne,String name,String email);
}

class CsvStudentRepository implements StudentRepository{
    private String filename;
    private List<String> l;
    public CsvStudentRepository(String filename){
        this.filename = filename;this.l = new ArrayList<>();
    }

    public void save(String cne,String name,String email){
        StringBuilder s = new StringBuilder();
        s.append(cne).append(",").append("name").append(",").append(email);
        l.add(s.toString());

    }

    public boolean exists(String cne){
        for (String s : l){
            if (s!=null){
                if (s.split(",")[0].equals(cne)){
                    return true;
                }
            }
        }
        return false;
    }

}
