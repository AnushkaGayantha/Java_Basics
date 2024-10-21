package Abatraction;

//Abstraction is hide internal details and showing only essential information
abstract class AbstractionAnimal {

    protected int age;
    protected boolean isMale;

    protected AbstractionAnimal(int age, boolean isMale){
        this.age=age;
        this.isMale=isMale;
    }
    //below method implementation in dog class.
    public abstract void animalSound();


}
