package chapter2;

class GetersSeters {

    private double length;
    private double width;

    public void Rectangle()
    {
        length = 0;
        width = 0;
    }

    public GetersSeters(double length, double width){
        this.length = length; //can be set this way
        this.width=width;
        //setWidth(width); //or can be set this way. these are only different here to demo alternative options
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double calculatePerimeter()
    {
        return (2 * length) + (2 * width);
    }

    public double calculateArea()
    {
        return length * width;
    }
}
