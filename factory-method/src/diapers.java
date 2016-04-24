/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khimes
 */
public class diapers extends product{

    private double price;

    protected diapers(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductType() {
        return "Diapers";
    }

}

