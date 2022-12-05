/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_SOAL_1;

/**
 *
 * @author rizal
 */
public class Penyanyi{
    public static void main(String[] args) {
        Pop pop = new Pop("Black Pink", "How You Like That");
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        Dangdut dangdut = new Dangdut();
        dangdut.singer("Ayu Ting Ting");
        dangdut.song("Kopi Dangdut");
        dangdut.cetakLabel();
    }
}
