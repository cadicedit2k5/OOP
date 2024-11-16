/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;


/**
 *
 * @author ADMIN
 */
public class Exercise2 {
    public static class ImageLoader {
        private static ImageLoader instance = null;
        
        private ImageLoader() {
        }
        
        public static ImageLoader getInstance() {
            if (instance == null) {
                instance = new ImageLoader();
            }
            return instance;
        }
        
        public String loadImage() {
            return "Loaded successfully.";
        }
        
    }
    
    public static void main(String[] args) {
        ImageLoader instance = ImageLoader.getInstance();
        System.out.println(instance.loadImage());
    }
}
