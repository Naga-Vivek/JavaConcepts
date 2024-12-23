package JavaBasics;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalDemo {
    public static void main(String[] args) {
        Double d1 = 0.8;
        Double d2 = 0.6;

        System.out.println("---Big Decimal constructor with val String parameter ---");
        BigDecimal b1 = new BigDecimal("0.8");
        BigDecimal b2 = new BigDecimal("0.6");
        BigDecimal b3 = b1.subtract(b2);
        BigDecimal b4 = b1.add(b2);
        BigDecimal b5 = b1.multiply(b2);
        BigDecimal b6 = b1.divide(b2, RoundingMode.HALF_EVEN);

        System.out.println("val1: "+b1);
        System.out.println("val2: "+b2);
        System.out.println("sub : "+b3);
        System.out.println("add : "+b4);
        System.out.println("mul : "+b5);
        System.out.println("div : "+b6);

        System.out.println("---Big Decimal constructor with double parameter ---");
        BigDecimal c1 = new BigDecimal(d1);
        BigDecimal c2 = new BigDecimal(d2);
        BigDecimal c3 = c1.subtract(c2);
        BigDecimal c4 = c1.add(c2);
        BigDecimal c5 = c1.multiply(c2);
        BigDecimal c6 = c1.divide(c2, RoundingMode.HALF_EVEN);
        System.out.println("val1: "+c1);
        System.out.println("val2: "+c2);
        System.out.println("sub : "+c3);
        System.out.println("add : "+c4);
        System.out.println("mul : "+c5);
        System.out.println("div : "+c6);

        System.out.println("---Big Decimal valueOf a double ---");
        BigDecimal e1 = BigDecimal.valueOf(d1);
        BigDecimal e2 = BigDecimal.valueOf(d2);
        BigDecimal e3 = e1.subtract(e2);
        BigDecimal e4 = e1.add(e2);
        BigDecimal e5 = e1.multiply(e2);
        BigDecimal e6 = e1.divide(e2, RoundingMode.HALF_EVEN);
        System.out.println("val1: "+e1);
        System.out.println("val2: "+e2);
        System.out.println("sub : "+e3);
        System.out.println("add : "+e4);
        System.out.println("mul : "+e5);
        System.out.println("div : "+e6);

        System.out.println("We see it is better to use constructor with string val parameter or valueOf method with parameter as double constant");
        System.out.println("Don't use double or float constant directly with BigDecimal constructor");

        BigDecimal a1 = BigDecimal.valueOf(55.124); // scale - 3
        BigDecimal a2 = BigDecimal.valueOf(12.8); // scale - 1
        BigDecimal a3 = a1.subtract(a2);
        System.out.println(a3);// takes large scale - 3

        BigDecimal a4 = BigDecimal.valueOf(2.351).setScale(2,RoundingMode.HALF_EVEN);
        System.out.println(a4);
        // precision - total no of digits including integer and fraction part
        // scale - no of digits in fraction part
        // BigDecimal is immutable
        BigDecimal a5 = a1.divide(a2,4,RoundingMode.HALF_EVEN);
        System.out.println(a5);
    }
}
