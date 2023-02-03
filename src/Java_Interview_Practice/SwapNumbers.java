package Java_Interview_Practice;

public class SwapNumbers {
  //swap numbers

  public static void main(String[] args) {
    int a = 2;
    int b = 1;
    int temp; // i created this variable

    temp=a; //temp=2
    a=b; // a=1
    b=temp;//b= 2

    System.out.println(a);
    System.out.println(b);
    System.out.println();

    a= a+b;//3 a=3
    b= a-b;//2 b=2
    a= a-b;//1  a=1
    System.out.println("b new number= "+a);
    System.out.println("a new number= "+b);



  }

}
