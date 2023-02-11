package Amazon;


import static Amazon.Amazon_CheckoutPage.singleProductInfo;

public class Amazon_BuyPage { // Purchase my products, so all I need to call the methods name
  /**
   * Q1 What does this project help me to understand?
   * Q3 What's the point of this class and those methods?
   * Q4 IDU, how can I get better? (Gotta ST)
   * Q5 Who can work and improve work on my(this) project as QA?
   *
   */


  public static void main(String[] args) {

    singleProductInfo();

//     I want to call a non-static method?

    Amazon_CheckoutPage purchase = new Amazon_CheckoutPage();

    purchase.productsInfo();
    purchase.productsInfo();
    purchase.productsInfo();


  }




}
