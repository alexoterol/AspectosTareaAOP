/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion1.Singleton;

/**
 *
 * @author alexo
 */
public class Cliente {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();  // Salida: Haciendo algo con la instancia Singleton.
    }
}