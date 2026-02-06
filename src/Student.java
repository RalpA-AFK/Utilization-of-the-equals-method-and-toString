import javax.print.attribute.standard.MediaSize;

public class Student {

    private String name;
    private double gpa;
    private String id;

    public Student(){
        name = null;
        gpa = 0.0;
        id = null;
    }

    public Student(String name,double gpa, String id){
        this.name = name;
        this.gpa = gpa;
        this.id = id;

    }
    public String getName(){return name;}
    public double getGpa(){return gpa;}
    public String getId(){return id;}

    public void setName(String name) {this.name = name;}
    public void setGpa(double gpa){this.gpa = gpa;}
    public void setId(String id){this.id = id;}

    public String toString(){
        return "Student:" + name + "\nId:" + id + "\nGPA:" + gpa + "\n";
    }
    public boolean equals(Object otherStudent){
        if(otherStudent == null){return false;}
        else if(this.getClass() != otherStudent.getClass()){return false;}
        Student otherStudentCasted = (Student) otherStudent;
        return this.id.equals(otherStudentCasted.id);
    }
}
