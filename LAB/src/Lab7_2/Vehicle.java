/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_2;

public abstract class Vehicle implements Dieselable {
    protected double fuel;

    public Vehicle() {
        this.fuel = 0.0;
    }
    
    public Vehicle(double fuel) {
        this.fuel = fuel;
    }
    
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    
    public double getFuel(){
        return fuel;
    }
    
    public void addFuel(double fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
        } else {
            System.out.println("Fuel is emtry.");
        }
    }

   

    public abstract void honk();
}
