//Author - Rohit Patil
//LinkedIn - https://www.linkedin.com/in/rohit-patil-06a5261b6/


import BaseJava.largest;

// Codes of Both Compile-Time Polmorphism and Runtime Polymorphism

public class Main {

    public static void main(String[] args) {
        // Compile time Polymorphism -- Method Overloading

        mathh m1 = new mathh();

        int x = m1.add(2, 3);
        int y = m1.add(2, 3, 4);
        String z = m1.add("Mercedes ", "Greatness");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Run time Polymorphism -- Method Overriding

        animal a1 = new animal();
        animal a2 = new cat();

        // a1.sound();
        // a2.sound();

        cat c1 = new cat();
        // c1.sound();
    }
}

class animal {

    public void sound() {

        System.out.println("Animal sound");
    }
}

class cat extends animal {
    @Override
    public void sound() {

        System.out.println("Cat making sound");
    }

    public void eats() {

        System.out.println("Cat eats");
    }
}

class mathh {

    public int add(int a, int b) {

        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {

        return a + b;
    }
}
