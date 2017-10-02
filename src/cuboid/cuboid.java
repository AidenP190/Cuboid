/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboid;

/**
 *
 * @author aparsons
 */
public class cuboid <T extends Number> {
    
    T height;
    T width;
    T length;

    public cuboid(T height, T width, T length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public cuboid() {
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "cuboid{" + "height=" + height + ", width=" + width + ", length=" + length + '}';
    }
    
    public double getVolume()
            {
                return width.doubleValue()*length.doubleValue()*height.doubleValue();
            }

   
    
    
    
}
