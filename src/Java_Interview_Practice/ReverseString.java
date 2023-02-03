package Java_Interview_Practice;

public class ReverseString {
 // Write a java program to reverse String? Reverse a string word by word?
  public static void main(String[] args) {

    String str="Hello World asdjahsd asdasd, asdasd";

    str.split(" "); // {Hello,World, asdjahsd,asdasd}

    StringBuffer stringBuffer= new StringBuffer(str);

    System.out.println(stringBuffer.reverse());

  }

}
