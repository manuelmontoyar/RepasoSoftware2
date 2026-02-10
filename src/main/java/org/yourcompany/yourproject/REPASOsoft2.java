/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author Manuel
 */
public class REPASOsoft2 {

    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario("1", "Pepe", "pepe@gmail.com","mañana");
        System.out.println(bibliotecario.darTurno());

        Socio socio = new Socio("1","Juan", "juan@gmail.com", 5);
        System.out.println("Socio creado exitosamente");
    }
}
