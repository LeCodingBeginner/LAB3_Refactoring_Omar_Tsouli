package Problem4.PostRefactoring;

public interface Teacher {
    public void teach(String code);
    public void gradeExams(String code);
}

class Professor implements Teacher,Researcher{
    private String name;
    public Professor(String name){
        this.name = name;
    }

    public void teach(String code ){
        System.out.println(name + " teaches " + code);
    }

    public void gradeExams(String code){
        System.out.println(name + " grades " + code);
    }

    public void publish(String title){
        System.out.println(name + " has published a paper tittled: "+title);
    }
}