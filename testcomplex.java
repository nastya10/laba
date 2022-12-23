public class testcomplex {

    public static void main(String[] args){
        complex Modul = new complex(4, 5, 6, 7);
        double re=14;
        double im = 15;
        double re2=6;
        double im2=7;
        System.out.println("First complex number: "+ re+ "+ i"+ im);
        System.out.println("Module: ");
        Modul.abs(re, im);
        System.out.println("Argument: ");
        Modul.arg(re, im);
        System.out.println("Second complex number: "+ re2+ "+ i"+ im2);
        System.out.println("Module: ");
        Modul.abs(re2, im2);
        System.out.println("Argument: ");
        System.out.println("Sum: ");
        Modul.add(re, im, re2, im2);
        System.out.println("Difference: ");
        Modul.sub(re, im, re2, im2);


    }
}