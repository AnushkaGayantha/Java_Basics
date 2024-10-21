package constrctor;

public class animal {


    protected int legCount;
    protected char colour;
    protected int birthYear;

    public animal(int birthYear, int legCount) {
    }


    public void animals (int legCount, char colour, int birthYear){
        this.legCount=legCount;
        this.colour=colour;
        this.birthYear=birthYear;

    }

    public int getLegCount() {
        return legCount;
    }

    public char getColour() {

        return colour;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setColour(char colour){
        this.colour = colour;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}
