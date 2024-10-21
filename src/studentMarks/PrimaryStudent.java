package studentMarks;

public class PrimaryStudent extends Stuent {

    protected int PrimaryStudentHeightt;
    protected int Marks;
    protected int NumberOofSubjects;



    PrimaryStudent(int PrimaryStudentHeight, int Markss, int NumberOofSubjectss, String StudentName, int Age, int height){

        super(StudentName, Age, height);
        this.PrimaryStudentHeightt=PrimaryStudentHeight;
        this.Marks=Markss;
        this.NumberOofSubjects=NumberOofSubjectss;

    }

    public void setPrimaryStudentHeightt(){
        this.setPrimaryStudentHeightt();
    }
    public void setMarks(){
        this.setMarks();
    }

    public void setNumberOofSubjects()
    {
        this.setNumberOofSubjects();
    }

    public int getPrimaryStudentHeightt(int primaryStudentHeightt){
        return this.PrimaryStudentHeightt;
    }

    public int getMarks(int Marks){
        return this.PrimaryStudentHeightt;
    }

    public int getNumberOofSubjects(int numberOofSubjects){
        return this.NumberOofSubjects;
    }

    public double calculateAvg()
    {

        double cal = (this.Marks/this.NumberOofSubjects);
        return cal;

    }

}


