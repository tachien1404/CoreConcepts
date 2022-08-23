/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi1;

import java.util.Scanner;


public class Bai1a {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int i;
      if(n%2 == 0){
           i = 2;
    }else{
          i=1;
      }
      int sum= 0;
      for(;i<=n;i+=2){
          sum+=i;
      }
      
        System.out.println("tong: " +sum);
    }
    
    }
    

