package encapsuation;

public class Dog {

    //Create variable with private
    private String Name;
    private String colour;

    private int age;

    public Dog(String name, String color, int age){

        this.colour=color;
        this.Name=name;
        this.age=age;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getColour(){
        return  this.colour;
    }

    public void setColour(String color){
        this.colour=color;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age)
    {
        if (age<=15)
        {
            this.age = age;
        }
      else {
            System.out.println("Invalid Age");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}


