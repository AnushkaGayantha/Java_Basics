package polimohisam;

public class Ship extends Vehicle{

    //Method overriding is change the parent fun in child class.
    @Override
    public void movement () {
        System.out.println("Ship is moving ");
    }

}
