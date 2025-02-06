/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.util.*;
public class lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number : ");
        int num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            if(i%5==0){
                System.out.print("/");
            }
            else
            {
                System.out.print("|");
            }
        }
    }
}
