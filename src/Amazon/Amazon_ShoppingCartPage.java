package Amazon;

public class Amazon_ShoppingCartPage{ // Define my products  and  put them in methods, so then I can call them

  /**
   * Q1 Where is the bug?
   * Q2 What's the point of this class and those methods?
   * Q3 How/why would you write a method instead of hard coding ?
   * Q4 How/why make my object global instead of local?
   * Q5 Why I created this method like that in line 16 what else I can achieve without it?
   * Q6 How/Why do I create a constructor and what's the point of creating a constructor?
   * Q7 What is that new keyword and next to it do?
   * Q8 Should I use extend keyword or not?
   * Q9 Void vs Static? How do I know if its static or void type or return type?
   * Q10 It's good to watch and I understand but how do I write the code when I am alone, I can't?
   */

  static Amazon_ShoppingCartItemInfo shoppingCartItemInfo= new Amazon_ShoppingCartItemInfo();

  public static Amazon_ShoppingCartItemInfo getShoppingCartItemInfo() {

    shoppingCartItemInfo.productName= String.valueOf(getSingleProductName()); //set my values but use the get method instead hard code
    shoppingCartItemInfo.productQuantity=getSingleProductQuantity();
    shoppingCartItemInfo.productPrice= getSingleProductPrice();

    return shoppingCartItemInfo ;
  }

  public static Amazon_RecommendedItemInfo getRecommendedCartItemInfo() {

    Amazon_RecommendedItemInfo recommendedItemInfo= new Amazon_RecommendedItemInfo();

    recommendedItemInfo.recommendedItemName="War and Peace"; //set my values but use the get method instead hard code
    recommendedItemInfo.recommendedItemQuantity=2;
    recommendedItemInfo.recommendedPrice="$20";

    System.out.println("Book Name: "+recommendedItemInfo.recommendedItemName);
    System.out.println("Book Price: "+recommendedItemInfo.recommendedItemQuantity);
    System.out.println("Book Quantity: "+recommendedItemInfo.recommendedPrice);

    return recommendedItemInfo;
  }

  public static Amazon_ShoppingCartItemInfo getSingleProductName() {

    String productNameInCart= shoppingCartItemInfo.productName="Roman History";

    System.out.println("Book Name: "+productNameInCart);

    return shoppingCartItemInfo;
  }
  public static String getSingleProductPrice() {

    try{

      shoppingCartItemInfo.productPrice="$20"; // apply exception, changed return type to String in Checkout class

      System.out.println("Book Price: "+shoppingCartItemInfo.productPrice);

      return String.valueOf(shoppingCartItemInfo.productPrice);

    } catch (Exception e) {
      throw new RuntimeException(" Failed to get price");
    }

  }

  public static int getSingleProductQuantity() {

    try {

    shoppingCartItemInfo.productQuantity=2; // set my quantity
                                            // apply exception, change return type to int
    System.out.println("Book Quantity: "+shoppingCartItemInfo.productQuantity);

    return shoppingCartItemInfo.productQuantity; // we use this for casting two different class

    } catch (Exception e) {
      throw new RuntimeException("Failed to get quantity");
    }
  }



}
