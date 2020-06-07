package com.thegyrfalcon.gryffindor.basics;

/**
 * @Java DataTypes
 * There are 8 Primitive Types
 * Primitive DataTypes
 *      |__ Boolean
 *      |__ Numeric
 *            |__ Integer ( byte, short, int, long )
 *            |__ Floating-Point ( float, double )
 *            |__ Character ( char )
 */
public class DataTypes {

    public static void main(String[] args) {

        System.out.println("************ [Primitive DataTypes] ************");

        System.out.println("[Primitive DataTypes] Boolean");
        boolean bool = true;

        System.out.println("[Primitive DataTypes] Numeric => Integer");

        byte  byteValue  = 10;
        short shortValue = 100;
        int   intValue   = 1000;
        long  longValue  = 10000L; // L is required for values above rage of Integer.

        System.out.println("[Primitive DataTypes] Numeric => Floating-Point");

        System.out.println("[Primitive DataTypes] Numeric => Character");

    }

}
