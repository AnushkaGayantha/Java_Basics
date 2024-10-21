package studentMarks;

public class Stuent {

    protected String StudentName;
    protected  int Age;
    protected  int height;

    public Stuent(String StudentName, int Age, int height){
        this.StudentName=StudentName;
        this.Age=Age;
        this.height=height;

    }

    public void setStudentName(String StudentName){
     this.StudentName=StudentName;
    }

    public void setAge(int age){
        this.Age=age;

    }

    public void setHeight(int heightt){
        this.height=heightt;
    }

    public String getStudentName()
    {
        return this.StudentName;
    }

    public int getAge()
    {
        return this.Age;
    }

    public int getHeight()
    {
        return this.height;
    }

}
