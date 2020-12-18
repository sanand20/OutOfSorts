public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp = 0;
      for (int j = 0; j <data.length-1; j++){
        for (int i = 0; i<data.length-1; i++){
        if (data[i]>data[i+1]){
          temp = data[i+1];
          data[i+1]=data[i];
          data[i]= temp;
        }
      }
   }
 }

 public static void selectionSort(int[] data){
   int temp = 0;
   for (int i = 0; i <data.length-1; i++){
     int min = i;
     for (int j = i; j<data.length-1; j++){
       if (data[j+1]<data[j]){
         min = j+1;
       }
     }
     temp = data[min];
     data[min]= data[i];
     data[i] = temp;
   }
  }

}
