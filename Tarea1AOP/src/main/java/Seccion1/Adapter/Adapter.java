/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion1.Adapter;


/**
 *
 * @author alexo
 */

public class Adapter implements Target {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void request() {
        oldSystem.specificRequest();
    }
}

// +------------------+           +------------------+
// |     Target       |           |    Client        |
// +------------------+           +------------------+
// | + request()      |<----------| - target: Target |
// +------------------+           +------------------+
//         ^
//         |
//         |
// +------------------+
// |    Adapter       |
// +------------------+
// | - adaptee: OldSystem |
// | + request()      |
// +------------------+
//         ^
//         |
//         |
// +------------------+
// |    OldSystem     |
// +------------------+
// | + specificRequest()|
// +------------------+

