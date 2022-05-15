//package itssachin.assignments2;
// Write a program to create a class named shape. In this class we have three sub classes circle,
// triangle and square each class has two member function named draw () and erase (). Create these using polymorphism concepts.

public abstract class Shape {
    void draw() {
        System.out.println("Drawing Shape: (-_-) ");
    }
    abstract void draw(int side);
    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            void draw(int side) {
                System.out.println("Drawing shape...");
            }
        };
        shape.draw();

        Circle c = new Circle();
        c.draw(5);
        c.erase();

        Triangle tri = new Triangle() {
            @Override
            void draw(int side) {
                System.out.println();
            }
        };
        tri.draw(10, 3);

        Square sq = new Square();
        sq.draw(7);
        sq.erase();
    }
}

class Circle extends Shape {
        void draw(int r) {
            System.out.println ("Drawing Circle of radius =  "+r);
        }
        void erase() {
            System.out.println ("Circle erasing...");
        }
}

abstract class Triangle extends Shape {
        void draw(int side1, int side2) {   // Method Overloading
            System.out.println("Drawing Triangle of side1 = "+side1+" and side2= "+side2);
        }
}

class Square extends Shape {
        @Override
        void draw(int side) {               // Method Overriding
            System.out.println ("Drawing Square with side= "+side);
        }
        void erase() {
            System.out.println ("Square erasing..");
        }
}

