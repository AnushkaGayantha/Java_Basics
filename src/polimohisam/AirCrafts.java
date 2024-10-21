package polimohisam;

public class AirCrafts  extends Vehicle{

    //Method overriding is change the parent fun in child class.
    @Override
    public void movement (){
        System.out.println("Air craft is flaying ");
    }

    //OverLoading
    public String FlyingType(int RunwayLength)
    {
        return "Plane Take Off ";
    }

    public void FlyingType(String FlayingLow)
    {
        System.out.println(FlayingLow);
    }

}
