/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int EdadJuan, EdadAlberto,EdadAna,EdadMama;
        EdadJuan = entrada.nextInt();
        
        EdadAlberto = (2 * EdadJuan)/3;
        EdadAna = (4 * EdadJuan)/3;
        EdadMama = EdadJuan + EdadAlberto + EdadAna;
        
        System.out.println("LA EDAD DE JUAN ES: " + EdadJuan);
        System.out.println("LA EDAD DE ALBERTO ES: " + EdadAlberto);
        System.out.println("LA EDAD DE ANA ES: " + EdadAna);
        System.out.println("LA EDAD DE LA MAMÁ: " + EdadMama);
    }
}
