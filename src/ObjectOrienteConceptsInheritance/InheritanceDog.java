package ObjectOrienteConceptsInheritance;

public class InheritanceDog extends InheritenceAnimal {

    private String name;
    private String colour;

    public InheritanceDog(int age, boolean isMale, String name, String colour){
        //supper use for create object for parent class
        super(age,isMale);
        this.name=name;
        this.colour=colour;

    }

    public void setAge(int age){
        super.age=age;
    }

    public int getAge(){
        return super.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String GetName(){
        return  name=name;
    }
}
