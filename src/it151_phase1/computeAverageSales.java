/*
* The purpose of this class is to polymorh the product id, product name, and 
* product price. To supply it to another class then get it back from that class
* to print out for the user in one piece. 
*/
package it151_phase1;
/* 
* @author Angelo Barcelo 
* angelobarcelo@hotmail.com
*/
class computeAverageSales
    {
    static private int productId; 
    static  private String productName; 
    static private double productPrice;
    static private double totalPrice; 
    static private int itemCount;
    
   
    void productIdSet (int productIdToo)
    {
       productId = productIdToo; 
    }
    
    int productIdGet()
    {
        return productId;
    }
    
    void productNameSet (String productNameToo)
    {
        productName = productNameToo; 
    }
    
    String productNameGet()
    {
        return productName;
    }
    
    void productPriceSet (double productPriceToo)
    {
        productPrice = productPriceToo;
    }
    
    double productPriceGet()
    {
        return productPrice;
    }
    
    void totalPriceSet (double totalPriceToo)
    {
        totalPrice = totalPriceToo; 
    }
    
    double totalPriceGet()
    {
        return totalPrice;
    }
    
    void itemCountSet (int itemCountToo)
    {
        itemCount = itemCountToo;
    }
    int itemCountGet()
    {
        return itemCount;
    }
    
    //Constructs products ordered to new values
    computeAverageSales(int productIdNew, String productNameNew, double productPriceNew, double totalPriceNew, int itemCountNew)
        {
        productId = productIdNew;
        productName = productNameNew;
        productPrice = productPriceNew;
        totalPrice = totalPriceNew;
        itemCount = itemCountNew;
        }
    }
