package ObjectOrienteConceptsInheritance;

public class InheritanceElephant extends Elephant{

    protected int feetCount;

    public InheritanceElephant(String colour, double width, double height, int feetCount){

        super(colour,width,height);
        this.feetCount=feetCount;

    }


}
