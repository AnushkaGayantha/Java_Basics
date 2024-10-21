package encapsuation;

public class Index {

    public static void main(String[]args){
        //Create Objects
        Dog  D1 = new Dog("Tom","Black",10);
        Bird b1 = new Bird("Categor1","Blue",3);

        b1.colour="Black";

        b1.setNumberOfEgg(10);
        D1.setAge(20);
        //If dog class variables are private cant access for it, cant change the variable.
        System.out.println(D1.toString());
        System.out.println(b1.toString());


        if(D1.getAge()<=5)
        {
            System.out.println("Correct");
        }
    }
}
