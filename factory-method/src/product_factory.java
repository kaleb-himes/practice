/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khimes
 */
public class product_factory {

    public static product createProduct(String what) {
        
        switch (what) {
            case "Diapers":
                return new diapers(40.99);
            case "Baby Food":
                return new babyFood(2.99);
            default:
                return new babyFood(0.79);
        }
    }
}
