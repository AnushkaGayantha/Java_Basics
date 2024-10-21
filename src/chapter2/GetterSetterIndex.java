package chapter2;

public class GetterSetterIndex{

    public static void main(String args[]){

        GetersSeters Area = new GetersSeters(3,6);

        System.out.println(Area.calculateArea());
        System.out.println(Area.calculatePerimeter());

        double FullArea = Area.calculateArea()*5;
        System.out.println(FullArea);

    }

    public static void GetFullArea(){



    }


}
