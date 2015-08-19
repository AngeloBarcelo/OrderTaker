/*
 * The purpose of this class it to get the product id, product name, and 
 * product price fron from the user. Give it back to the other class. Then have  
// * the other class supply the values to print it out as an order confirmation in 
 * one piece for the user.
 */
package it151_phase1;

import javax.swing.JOptionPane;
/* 
* @author Angelo Barcelo 
* IT151-1502B-01: Introduction to Java Programming I
* Student ID: 19313797 
* angelobarcelo@hotmail.com
*/
public class IT151_Phase1
    {
    public static void main(String[] args)
        { 
        String getUserName1 = "" ; //Declares the variable and set it to blank
        int productIdNew = 0 ; //Declares the variable and set it to zero 
        String productIdNew1 = "" ;//Place holder variable for data validation
        String productNameNew = ""; //Declares the variable and set it to blank 
        double productPriceNew = 0; //Declares the variable and set it to zero 
        double totalPriceNew = 0;//Declares the variable and set it to zero
        int itemCountNew = 0;//Declares the variable and set it to zero
        String answer = "";//Place holder variable for data validation
        double avgSales = 0;//Declares the variable and set it to zero
        double shippingCostNew = 0;//Declares the variable and set it to zero
        int objectcount = 0;//Declares the variable for obect counter
        computeAverageSales[] computeAverageSales = new computeAverageSales[100];
        
        //Sentinal value anything but "No" will start the loop over and allow for new item to be added to order 
        while (!"no".equals(answer = JOptionPane.showInputDialog("Would you like to add to your cart?" +
               "\nType no if you don't want to add anything to your cart" +
               "\nIf you enter anything else but no I will assume you want to add something to your cart")))
            {
            while (getUserName1.isEmpty())//Data validation loop forces user to enter text, can't leave blank
                {
                getUserName1 = JOptionPane.showInputDialog("Please enter your name");//Gets user name
                }
            
            productIdNew1= ""; //After first loop I couldn't figure out how to clear this variable so I created this work around to clear it
            
            while (productIdNew1.isEmpty())//Data validation loop forces user to enter text, can't leave blank
                {
                productIdNew1 = (JOptionPane.showInputDialog("Enter your product ID number\n(No spaces please)"));
                }
            
            productIdNew = Integer.parseInt(productIdNew1);//Parses string into integer and assignes variable
            
            while (productIdNew < 1 || productIdNew > 100)//Data validation loop forces productId to be greater than 1 or less than 1000
                {
                productIdNew = Integer.parseInt(JOptionPane.showInputDialog("Enter your product ID\n(It must be between 1-100)"));
                }
    
            productNameNew = JOptionPane.showInputDialog("Enter the product name");
            //Declares the variable "productName" and displays prompt for user to enter the "productName"*/ 
        
            productPriceNew = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the product" +
                                                                             "\n(Only numbers please)" +
                                                                             "\nIf you enter anything else I will die! I don't want to die"));
            //Declares the variable "productPrice" and displays prompt for user to enter the "productPrice"//
        
            itemCountNew++;//Increase item counter
            totalPriceNew = totalPriceNew + productPriceNew;//Adds whatever was just added to the total price variable
            avgSales = totalPriceNew/itemCountNew;//figures out the average sales
            shippingCostNew = itemCountNew;//Shipping cost is based on number if items so they are set to the same number
            
            //Shows the item confirmation before adding it to the cart. If No is hit program ends
            int qa = JOptionPane.showConfirmDialog(null,"Would like me to add the "+ objectcount + 
                                                        " object umm I mean item to your cart:" +
                                                        "\nProduct ID: " + productIdNew + 
                                                        "\nProduct Name: "+ productNameNew + 
                                                        "\nProduct Price: " + productPriceNew);
            if (qa !=JOptionPane.YES_OPTION)System.exit(0); objectcount++;  
            
                  
            //Compute Average Sales constructor.
            computeAverageSales[objectcount] = new computeAverageSales(productIdNew,productNameNew,productPriceNew,totalPriceNew,itemCountNew);
            }  
        //Get user name constructor.
        getUserName getUserName2 = new getUserName(getUserName1); 
       
        //Shipping cost constructor. This way, how I came to calculate shipping cost is hidden
        computeShippingCharges computeShippingCharges1 = new computeShippingCharges(shippingCostNew);
            
        //Shows order confirmation message with eight variables and provides y/n to place order. Can see the obect count, item count, average sales, shipping cost, and total including shipping and item totals    
        JOptionPane.showConfirmDialog(null,"To confirm, " + getUserName2.userNameGet()+
                                          " the " + objectcount + " object I mean item (I keep forgetting to speak human) you placed in your cart was:\n\nProduct ID: " + computeAverageSales[objectcount].productIdGet() +
                                          "\nProduct Name: " + computeAverageSales[objectcount].productNameGet() + 
                                          "\nProduct product Price: $" + computeAverageSales[objectcount].productPriceGet() + 
                                          "\n\nSo adding everything in your cart up. You have: " +
                                          "\nA total of items of: " + computeAverageSales[objectcount].itemCountGet() + 
                                          "\nThe average cost of items in your cart is: $" + (computeAverageSales[objectcount].totalPriceGet()/ computeAverageSales[objectcount].itemCountGet() )+
                                          "\nTotal shipping cost: $" + computeShippingCharges1.shippingCostGet()+
                                          "\nThis brings the grand total : $" + (computeAverageSales[objectcount].totalPriceGet()+ computeShippingCharges1.shippingCostGet())+
                                          "\n\nIs this correct?");
                    
        if (avgSales>200) 
            {//If user approves of order and average sale is over $200 
            JOptionPane.showMessageDialog(null, "Thank you for being one of our best customers!");
            }
        else         
            {//If user approves of order and If under average sales in under $200 
            JOptionPane.showMessageDialog(null, "Have a nice day!");
            }
        }
    }
    


          
      
    
    


    


