/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

public class Plane extends Vehicle {    
    public void showPlaneInfo() {
        System.out.print("Plane detail is, ");
        System.out.println("Fuel is "+ getFuel() +" litre and Top Speed is "+ getTopSpeed() +" m/s.");
    }
    public void setPlaneInfo(int s, String t) {
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly() {
        if ((getFuel() - 200) >= 0 ){
            setFuel(getFuel() - 200);
            System.out.println("Fly.");
        } else {
            System.out.println("Please add fuel.");
        }
    }
}
