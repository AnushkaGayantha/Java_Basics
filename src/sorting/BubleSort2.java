package sorting;

public class BubleSort2 {

    public static void main(String[] args) {
        int arry [] = {4,12,1,9,50,41,2};
        bublesort(arry);
        for (int x = 0;x<arry.length;x++)
        {
            System.out.println(arry[x]);
        }
    }


    public static void bublesort(int[] arry)
    {
        int temp;
        for (int i=0; i<arry.length;i++)
        {
            for (int j=0;j< arry.length-1-i;j++)
            {
                if (arry[j]>arry[j+1])
                {
                    temp=arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
        }
    }
}


// for (int i = 0; i<arry.length; i++)
//        {
//        //compare near 2 values
//        for (int j=0; j<arry.length-1-i;j++)
//        {
//        //if want to sort assending and decending change arrow in line number 24
//        if (arry[j]<arry[j+1])
//        {
//        temp=arry[j];
//        arry[j] = arry[j+1];
//        arry[j+1] = temp;
//        }
//        //System.out.println(arry[j]);
//        }
