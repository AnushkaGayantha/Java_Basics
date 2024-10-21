package encapsuation;

public class Bird {

    public String birdCategory;
    public String colour;
    private int numberOfEgg;

    public Bird(String birdCategory, String colour, int numberOfEgg){
        this.birdCategory=birdCategory;
        this.colour=colour;
        this.numberOfEgg=numberOfEgg;

    }

    public void setBirdCategory(String birdCategory){
        this.birdCategory=birdCategory;
    }

    public void setColour (String colourr)
    {
        this.colour=colourr;
    }
    public void setNumberOfEgg (int numberOfEgg)
    {
        if (numberOfEgg<=5)
        {
            this.numberOfEgg= numberOfEgg;
        }
        else
        {
            System.out.println("Invalid Egg Count ");
        }

    }

    public String getBirdCategory()
    {
        return getBirdCategory();
    }

    public String getColour()
    {
        return getColour();
    }

    public int getNumberOfEgg()
    {
        return getNumberOfEgg();
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdCategory='" + birdCategory + '\'' +
                ", colour='" + colour + '\'' +
                ", numberOfEgg=" + numberOfEgg +
                '}';
    }
}
