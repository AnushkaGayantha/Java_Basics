package chapter2;

public class Car {

    private int engineCapacity;
    private int doorCount;
    private String colour;

    //Constructor
    public Car (int engineCapacity, int doorCount, String colour){

        //defining new object atributes.

        this.engineCapacity=engineCapacity;
        this.doorCount=doorCount;
        this.colour=colour;


    }
    //Can get the value from already created object.
    public int getEngineCapacity()
    {
        return this.engineCapacity;
    }
    //If already created object if we need to manupilate we can use setters
    public void setEngineCapacity(int engineCapacity)
    {
        this.engineCapacity=engineCapacity;

    }

}





