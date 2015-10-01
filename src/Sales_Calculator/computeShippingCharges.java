/*
 * This class calculates to include the sales tax. 
 */
package Sales_Calculator;

/*
 * @author Angelo Barcelo 
 * angelobarcelo@hotmail.com
 */
public class computeShippingCharges
{
    private double shippingCost; 
    
    
    //The access modifiers or getter and setter 
    computeShippingCharges(double shippingCostNew)
    {
        shippingCost = shippingCostNew *1.50;
    }
    double shippingCostGet()
    { 
        return shippingCost;
    }
    
    //The actual calculation happens here
   // computeShippingCharges(double shippingCostNew)
   // {
   //     shippingCost = shippingCostNew *1.50;
   // }
}
