/*
* The purpose of this class is to polymorh the product id, product name, and 
* product price. To supply it to another class then get it back from that class
* to print out for the user in one piece. 
*/
package it151_phase1;
/* 
* @author Angelo Barcelo 
* IT151-1502B-01: Introduction to Java Programming I
* Student ID: 19313797 
* angelobarcelo@hotmail.com
*/
class computeAverageSales
    {
    static private int productId; //Declares variable
    static  private String productName; //Declares variable
    static private double productPrice; //Declares variable
    static private double totalPrice; 
    static private int itemCount;
    
   
    void productIdSet (int productIdToo)//place holder variable
       {
       productId = productIdToo; //Sets variable
       }
    int productIdGet()
        {
        return productId;
        }
    void productNameSet (String productNameToo)//place holder variable
        {
        productName = productNameToo; //Sets variable
        }
    String productNameGet()
        {
        return productName;
        }
    void productPriceSet (double productPriceToo)//place holder variable
        {
        productPrice = productPriceToo;//Sets variable
        }
    double productPriceGet()
        {
        return productPrice;
        }
    void totalPriceSet (double totalPriceToo)//place holder variable
        {
        totalPrice = totalPriceToo; //Sets variable
        }
    double totalPriceGet()
        {
        return totalPrice;
        }
    void itemCountSet (int itemCountToo)//place holder variable
        {
        itemCount = itemCountToo; //Sets variable
        }
    int itemCountGet()
        {
        return itemCount;
        }    
        //Constructs products ordered to new values
    computeAverageSales(int productIdNew, String productNameNew, double productPriceNew, double totalPriceNew, int itemCountNew)
        {
        productId = productIdNew;//Sets private variable #1 to be used out side of class
        productName = productNameNew;//Sets private variable #2 to be used out side of class
        productPrice = productPriceNew;//Sets private variable #3 to be used out side of class
        totalPrice = totalPriceNew;
        itemCount = itemCountNew;
        }
    }
