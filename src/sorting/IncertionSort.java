package sorting;

public class IncertionSort {

    public static void main(String[] args) {
        int array[] = {32,18,12,60,20};
        insertionSort(array);
        for (int x = 0;x<array.length;x++)
        {
            System.out.println(array[x]);
        }
    }


    public static void insertionSort(int array [])
    {
        int temp;
        int j;
        for (int i = 1;i< array.length;i++)
        {
            temp=array[i];
            j=i-1;
            //if want to sort assending and decending change arrow in line number 24
            while (j>=0 && array[j]<temp)
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;

        }

    }
}
