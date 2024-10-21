package ObjectOrienteConceptsInheritance;

public class Elephant {

    protected String colour;
    protected double height;
    protected double width;

    protected Elephant(String colour, double height, double width){
        this.colour=colour;
        this.height=height;
        this.width=width;

    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public void setHeight(double height)

    {
            this.height = height;
    }

    public void setWidth(double width)
    {
        this.width=width;
    }

    public String getColour(){
        return this.colour;
    }

    public double getWidth(){
        return this.width;

    }

    public double getHeight(){
        return this.height;
    }
}
