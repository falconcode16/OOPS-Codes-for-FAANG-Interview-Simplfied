public class PassByValue_PassByReference {
    public static void main(String[] args) {

        // Pass by Value
        int a = 1000;
        int b;
        System.out.println(a);
        b = a;
        System.out.println(b);
        b = 2000;
        System.out.println(b);
        System.out.println(a);

        // Pass by Reference

        animal an = new animal(); // when the new object is created, the instance variables in the animal class,
        an.name = "Dog"; // will have seperate memory allocated in the heap.
        an.age = 4;
        an.weight = 15f;
        System.out.println(an.name);
        System.out.println(an.age);
        System.out.println(an.weight);
        // 1st Reference
        animal b; // one object can have many references
        b = an;
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.weight);

        b.name = "cat";
        b.age = 4;
        b.weight = 10f;

        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.weight);

        System.out.println(an.name);
        System.out.println(an.age);
        System.out.println(an.weight);

        // 2nd Reference
        animal c;
        c = an;

        c.name = "pig";
        c.age = 8;
        c.weight = 5;
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.weight);

        System.out.println(an.name);
        System.out.println(an.age);
        System.out.println(an.weight);

    }

}

class animal {

    String name;
    int age;
    float weight;

}
