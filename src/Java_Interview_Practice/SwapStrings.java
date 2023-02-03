package Java_Interview_Practice;

public class SwapStrings {

  //swap strings
  public static void main(String[] args) {
    String x = "Hello" ;
    String y = "Welcome" ;

    x= x+y; //HelloWelcome

    y=x.substring(0,x.length()-y.length()); //x length (12)-y length (7) //Hello
    x=x.substring(y.length()); //y length (5) Welcome

    System.out.println("new x : "+ x);
    System.out.println("new y : "+ y);



  }
}
