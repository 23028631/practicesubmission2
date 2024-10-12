/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Laptop acer
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int marks[]={90,78,67,56,80};
        marks[0]=56;
        System.out.println(marks[3]);
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        double ave=sum/marks.length;
        System.out.println("average "+ave);
        for(int mark:marks){
            System.out.println(mark);
        }
    }
}
