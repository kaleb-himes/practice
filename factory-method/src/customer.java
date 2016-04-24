
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khimes
 */
public class customer {

    public static void main(String args[]) {

        int cartSize;
        DecimalFormat df = new DecimalFormat("#.##");
        double totalCost = 0.0, immediateCost, savings = 0.0;
        /* 2.99 - 0.79 ( sale price subtracted from original price */
        final double discount = 2.20;
        String itemName;
        product[] cart = new product[21];

        cart[0] = product_factory.createProduct("Diapers");
        cart[1] = product_factory.createProduct("No Bar-code on product");
        cart[2] = product_factory.createProduct("Baby Food");
        cart[3] = product_factory.createProduct("Baby Food");
        cart[4] = product_factory.createProduct("Baby Food");
        cart[5] = product_factory.createProduct("No Bar-code on product");
        cart[6] = product_factory.createProduct("Baby Food");
        cart[7] = product_factory.createProduct("Baby Food");
        cart[8] = product_factory.createProduct("Baby Food");
        cart[9] = product_factory.createProduct("No Bar-code on product");
        cart[10] = product_factory.createProduct("Baby Food");
        cart[11] = product_factory.createProduct("Baby Food");
        cart[12] = product_factory.createProduct("No Bar-code on product");
        cart[13] = product_factory.createProduct("Baby Food");
        cart[14] = product_factory.createProduct("Baby Food");
        cart[15] = product_factory.createProduct("Baby Food");
        cart[16] = product_factory.createProduct("Baby Food");
        cart[17] = product_factory.createProduct("No Bar-code on product");
        cart[18] = product_factory.createProduct("Baby Food");
        cart[19] = product_factory.createProduct("Baby Food");
        cart[20] = product_factory.createProduct("Baby Food");
                
        cartSize = cart.length;

        for (int i = 0; i < cartSize; i++) {
            immediateCost = cart[i].getPrice();
            itemName = cart[i].getProductType();
            
            System.out.println("cart [" + i + "] = " + itemName);
            
            if (itemName.equals("Baby Food - ON SALE!!!")) {
                System.out.println("SAVINGS!!! = " + df.format(discount));
                savings += discount;
            }
            
            System.out.println("Cost for this item is: " +
                                                      df.format(immediateCost));
            totalCost += immediateCost;
        }
        
        System.out.println("\n\nTotal cost of cart is: " +
                                                          df.format(totalCost));
        System.out.println("You saved a total of " + df.format(savings));
    }
}
