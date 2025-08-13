package com.company;

/*
     class Cylinder {
        private int radius;
        private int height;
        private float surfaceArea;
        private float volume;

        public Cylinder(int r, int h) {
            this.radius = r;
            this.height = h;
        }

        public int getRedius() {
            return radius;
        }

//        public void setRedius(int radius) {
//            this.radius = radius;
//        }

        public int getHeight() {
            return height;
        }

        //        public void setHeight(int height) {
//            this.height = height;
//        }
        // PROBLEM 2
        public double Volume() {
            return Math.PI * radius * radius * height;
        }

        public double SurfaceArea() {
            return 2 * Math.PI * radius * height + 2 *Math.PI * radius * radius;
        }
  }

 */
    /*
class Rectangle{
     private int length;
     private int breadth;
     public Rectangle(){
         this.length=4;
         this.breadth=5;
     }
        public Rectangle(int l, int b){
            this.length=l;
            this.breadth=b;
        }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

     */
 class Sphere{
        int radius;
        int area;
        int surfaceArea;

    public Sphere(int radius) {  // constructor
        this.radius = radius;
    }

    public double getRadius() {  // getter
        return radius;
    }

    public double SurfaceArea() { // method
        return 4*Math.PI*radius*radius*radius;
    }

    public double Area() {
        return 4/3*Math.PI*radius*radius;
    }
}

    public class CWH_CH9_PS {
    public static void main(String[] args) {
        // PROBLEM 1
        /*
        Cylinder c = new Cylinder(1, 1);
        // c.setRedius(1);
        System.out.println("radius is " + c.getRedius());
        //c.setHeight(1);
        System.out.println(" height is " + c.getHeight());
        // PROBLEM 2 and 3
        System.out.println("surface area is " + c.SurfaceArea());
        System.out.println("volume is " + c.Volume());

         */

        // PROBLEM 4
        /*
         Rectangle r=new Rectangle(15,25);
       System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        */
        Sphere s=new Sphere(5);
        System.out.println(s.getRadius());
        System.out.println(s.Area());
        System.out.println(s.SurfaceArea());

}
   }

