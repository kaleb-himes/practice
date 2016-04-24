/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khimes
 */
public class babyFood extends product{

    private double price;

    protected babyFood(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductType() {
        if (this.price < 2.99) {
            return "Baby Food - ON SALE!!!";
        }
        return "Baby Food";
    }

}
