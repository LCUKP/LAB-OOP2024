/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.util.*;
public class lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num");
        int odd=0,even=0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            if (num%2 == 0){
                even += 1;
            }
            else {
                odd += 1;
            }
        }
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}
