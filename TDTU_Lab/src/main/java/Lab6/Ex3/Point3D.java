/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.Ex3;

/**
 *
 * @author ADMIN
 */
public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] { super.getX(), super.getY(), this.z };
    }
    
    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    
    @Override
    public String toString() {
        return "Point3D [x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + "]";
    }
}
