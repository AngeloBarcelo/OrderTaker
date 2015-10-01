/*
* The purpose of this class is to polymorh the product id, product name, and 
* product price. So that all the info can be printed out for the user in one 
* piece. 
*/
package Sales_Calculator;
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
    
    //The access modifiers or getters and setters for all the variables 
    //listed above. 
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
    
    //Constructor for the each of the items ordered
    computeAverageSales(int productIdNew, String productNameNew, double productPriceNew, double totalPriceNew, int itemCountNew)
    {
        productId = productIdNew;
        productName = productNameNew;
        productPrice = productPriceNew;
        totalPrice = totalPriceNew;
        itemCount = itemCountNew;
    }
}
