public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
  boolean sorted = false;
  for(int j = 0; j<data.length-1 && sorted == false; j++){
  sorted = true;
  for (int i = 0; i < data.length - j-1; i++)
  if (data[i] > data[i + 1]){
  sorted = false;
  int temp = data[i];
  data[i] = data[i + 1];
  data[i+1] = temp;
  }
  }}

 public static void selectionSort(int[] data){
   int temp = 0;
   for (int i = 0; i <data.length; i++){
     int min = i;
     for (int j = i; j<data.length; j++){
       if (data[j]<data[min]){
         min = j;
       }
     }
     temp = data[min];
     data[min]= data[i];
     data[i] = temp;
   }
  }



  public static void insertionSort(int[] data){
 {
for (int i = 1; i < data.length; ++i) {
int key = data[i];
int j = i - 1;
while (j >= 0 && data[j] > key) {
data[j + 1] = data[j];
j = j - 1;
}
data[j + 1] = key;
    }
  }
}

}
