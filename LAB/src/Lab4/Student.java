/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade() {
        double s = (mScore*0.4)+(fScore*0.4)+20;
        System.out.print(name+" grade is ");
        if (s>= 80){
            System.out.println("A.");
        }
        else if(s>= 70){
            System.out.println("B.");
        }else if(s>= 60){
            System.out.println("C.");
        }else if(s>= 50){
            System.out.println("D.");
        }else if(s< 50){
            System.out.println("F.");
        }
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "AJ.Bank";
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();
        
    }
}
