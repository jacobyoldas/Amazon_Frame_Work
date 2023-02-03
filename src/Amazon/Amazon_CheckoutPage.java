package Amazon;

public class Amazon_CheckoutPage {  // I want to see my products whole info in other to purchase and put them in methods,so I can call them
  /**
   * Note: Make the class order to see it clear
   * Q1 Where is the bug?
   * Q2 How/Why/Where can I put exception(tr-catch)?
   * Q3 What's the point of this class and those methods inside the methods inside the...?
   * Q4 Why I created this method like that in line 17 code?
   * Q5 Void vs Static? How do I know if its static or void type or return type?
   * Q6 It's good to watch and I understand how I write the code when I am alone, I can't?
   */

  public void productsInfo(){ // Shopping Items info methods called here

    Amazon_ShoppingCartItemInfo shoppingCartItemInfo = Amazon_ShoppingCartPage.getShoppingCartItemInfo();


  }

  public static void recommendedInfo(){ // Recommended Items info methods called here

    Amazon_RecommendedItemInfo recommendedCartItemInfo = Amazon_ShoppingCartPage.getRecommendedCartItemInfo();

  }


  public static void singleProductInfo(){ // Single Product info items called here

    String singleProductPrice= Amazon_ShoppingCartPage.getSingleProductPrice();


    if (singleProductPrice.equals("$15")) {
      System.out.println("Correct price");
  } else {
    throw  new RuntimeException("Check out price and the single product price are not matching");
  }
    }
  }


