package studentMarks;

public class MainMethod {
    public static void main(String [] args){

        PrimaryStudent Students = new PrimaryStudent(3,21,7,"Anushka",5,8);
        System.out.println("Primary Student Height is "+Students.NumberOofSubjects);
        //System.out.println(Students.calculateAvg());
        System.out.println(Students.calculateAvg());


    }
}