package arays;

public class min {

    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};

        //Initialize max with first element of array.
        int min = arr[0];

        //Loop through the array
        for (int i = 0; i < arr.length; i++)
        {
            //Compare elements of array with max
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Lowest element present in given array: " + min);
    }
}
