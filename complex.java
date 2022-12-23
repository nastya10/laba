
public class complex {

    public double re, im, re2, im2;// поля для хранения действительной и мнимой части числа


    public complex() {//конструктор по умолчанию

    }

    public complex(double re, double im, double re2, double im2) {
        this.re = re;
        this.im = im;
        this.re2 = re2;
        this.im2 = im2;


    }

    public void abs(double re, double im) {
        double c = Math.sqrt(re * re + im * im);
        System.out.println(c);
    }

    public void arg(double re, double im) {
        double d = Math.atan2(re, im);
        System.out.println(d);
    }

    public void add(double re, double im, double re2, double im2) {
        double RE = re + re2;
        double IM = im + im2;
        System.out.println(RE + "+ i" + IM);
    }

    public void sub(double re, double im, double re2, double im2) {
        double RE = re - re2;
        double IM = im - im2;
        if (IM < 0) {
            System.out.println(RE + "- i" + IM*(-1));
        } else {
            System.out.println(RE + "+ i" + IM);
        }
    }
}