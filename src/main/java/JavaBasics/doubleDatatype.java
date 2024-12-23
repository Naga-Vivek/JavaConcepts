package JavaBasics;



public class doubleDatatype {
    public static void main(String args[]){
        float f = 0.5f;
        System.out.println(f);

        double d = 0.1;
        System.out.println(d);

        Double d1 = 0.1;
        Double d2 = 0.2;
        Double d3 = 0.3;
        System.out.println(d1+d2);
        System.out.println(d1);
        System.out.println(d3.compareTo(d1+d2));

        Double n1 = 12345.123459;
        Double n2 = 12345.12345;
        System.out.println(n1.compareTo(n2));
        System.out.println(d3.compareTo(d1+d2));

        Double x = 1.0d;
        System.out.println(x);
        System.out.println("---Double Arithmetic ---");
        Double a1 = 0.8;
        Double a2 = 0.1;
        Double a3 = a1-a2;
        Double a4 = a1+a2;
        Double a5 = a1*a2;
        Double a6 = a1/a2;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);



    }
}
