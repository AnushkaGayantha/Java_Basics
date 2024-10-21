package polimohisam;

public class Index {

    public static void main(String[] args) {
        Vehicle v1 = new Cars();
        Vehicle v2 = new Ship();
        Vehicle v3 = new AirCrafts();
        AirCrafts v4 = new AirCrafts();

        v1.movement();
        v2.movement();
        v3.movement();

        //OveLoading Fun calling
        System.out.println(v4.FlyingType(6));
        v4.FlyingType("Too High ");
    }
}
