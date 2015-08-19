/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it151_phase1;

/*
 * @author Angelo Barcelo 
 * angelobarcelo@hotmail.com
 */
public class computeShippingCharges
{
    private Double shippingCost; 
    
    void shippingCostSet (double shippingCostToo)
    {
        shippingCost = shippingCostToo;
    }
    double shippingCostGet()
    {
        return shippingCost;
    }
    
    computeShippingCharges(double shippingCostNew)
    {
        shippingCost = shippingCostNew *1.50;
    }
}
