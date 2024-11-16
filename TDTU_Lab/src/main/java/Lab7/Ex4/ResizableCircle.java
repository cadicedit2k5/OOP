/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7.Ex4;

/**
 *
 * @author ADMIN
 */
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle() {
        super();
    }
    
    @Override
    public void resize(int percent) {
        super.radius *= percent / 100.0;
    }
}
