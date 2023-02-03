package Java_Interview_Practice;

public class ArrayRandomValues {



  // Create an array of size 5, assign some random values from 1 to 10?
  //Create a method that prints array  like "2 3 4 8 19"
  //Create a method that prints the sum of array
 // Create a method that prints max element of arrays
  public static void main(String[] args) {

    int [] arrayList= new int[5];

    for (int i = 0; i <arrayList.length ; i++) {
      arrayList[i] =  (int) (Math.random()*10+1);
    }

    randomValues(arrayList);
    System.out.println();
    sumOfArray(arrayList);

  }

  private static void sumOfArray(int[] array) {
    int sum=0;

    for (int i = 0; i < array.length ; i++) {
      sum = sum+array[i];

    }System.out.println("Sum of the arrays: "+ sum);

  }

  public static void randomValues(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+ " ");
    }
  }







}
