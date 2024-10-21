package polimohisam;

public class Cars extends Vehicle{

    //Method overriding is change the parent fun in child class.
    @Override
    public void movement () {
        System.out.println("Car is moving ");
    }
}
