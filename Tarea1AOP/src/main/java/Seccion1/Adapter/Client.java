/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion1.Adapter;

/**
 *
 * @author alexo
 */
public class Client {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        Target adapter = new Adapter(oldSystem);
        adapter.request();  // Salida: Request en el sistema antiguo.
    }
}
