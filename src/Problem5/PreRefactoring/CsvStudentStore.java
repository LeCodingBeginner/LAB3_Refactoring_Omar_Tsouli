package Problem5.PreRefactoring;

import java.util.ArrayList;
import java.util.List;

public class CsvStudentStore {
    private String fileName;
    private List<String> l;
    public CsvStudentStore(String fileName){
        this.fileName = fileName; this.l = new ArrayList<>();
    }

    public void append(String cne,String name,String email){
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
