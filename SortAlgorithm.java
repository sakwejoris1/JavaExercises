public class sortAlgorithm
{
    public class void main(String[] args)
{
    int[] array = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
             }
         }

}

}
