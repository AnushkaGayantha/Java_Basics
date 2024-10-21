package sorting;

public class BubleSort {
    public static void main(String[] args) {
        int array [] = {23,65,75,34,28,93};

        bubleSortAlgorithm(array);
        for (int x = 0;x<array.length;x++)
        {
            System.out.println(array[x]);
        }
    }

    public static void bubleSortAlgorithm(int[] arry)

    {
        int temp;
        //go through with whole array.
        for (int i = 0; i<arry.length; i++)
        {
            //compare near 2 values
            for (int j=0; j<arry.length-1-i;j++)
            {
                //if want to sort assending and decending change arrow in line number 24
                if (arry[j]<arry[j+1])
                {
                    temp=arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
                //System.out.println(arry[j]);
            }
        }
    }


}
