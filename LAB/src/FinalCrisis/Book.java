/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalCrisis;

import java.io.Serializable;

/**
 *
 * @author dtac6
 */
public class Book implements Serializable{
    private String name;
    private double price;
    private String type;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Book(){
        this("", 0, "");
    }

    public Book(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
}
