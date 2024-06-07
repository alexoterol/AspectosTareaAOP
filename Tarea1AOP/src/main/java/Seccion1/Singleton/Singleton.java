/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion1.Singleton;

/**
 *
 * @author alexo
 */
public class Singleton  {
    // La única instancia de la clase.
    private static Singleton uniqueInstance;

    // Constructor privado para evitar instanciación directa.
    private Singleton() { }

    // Método sincronizado para obtener la única instancia de la clase.
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Otros métodos útiles de la clase.
    public void doSomething() {
        System.out.println("Haciendo algo con la instancia Singleton.");
    }
}