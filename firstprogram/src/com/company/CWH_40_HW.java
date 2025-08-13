package com.company;
class circle{
   private int r;
    private float area;
    private float perimeter;
    public void setRadius(int n){
        r=n;
    }
    public int getRadius(){
        return r;
    }
    public void setArea(){
        // this.area=3.14f*r*r;
        area=3.14f*r*r;
    }
    public float getArea(){
        return area;
    }
    public void setPerimeter(){
         perimeter=2*3.14f*r;
    }
    public float getPerimeter(){
        return perimeter;
    }
}
public class CWH_40_HW {
    public static void main(String[] args) {
        circle c=new circle();
        c.setRadius(5);
        System.out.println("radius is "+c.getRadius());
        c.setArea();
        System.out.println("area is "+c.getArea());
        c.setPerimeter();
        System.out.println("perimeter is "+c.getPerimeter());

    }
}
