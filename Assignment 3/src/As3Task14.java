
public class As3Task14 {

}

class Complex {

    double realPart;
    double imaginaryPart;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex c) {
        Complex f = new Complex();
        f.realPart = realPart + c.realPart;
        f.imaginaryPart = imaginaryPart + c.imaginaryPart;
        return f;
    }

    public Complex subtract(Complex c) {
        Complex f = new Complex();
        f.realPart = Math.abs(realPart - c.realPart);
        f.imaginaryPart = Math.abs(imaginaryPart - c.imaginaryPart);
        return f;
    }

    public Complex multiply(Complex c) {
        Complex f = new Complex();
        f.realPart = (realPart * c.realPart) - (imaginaryPart * c.imaginaryPart);
        f.imaginaryPart = (realPart * c.imaginaryPart) + (imaginaryPart * c.realPart);
        //System.out.println(f.realPart+" "+f.imaginaryPart);
        return f;
    }

    public Complex divide(Complex c) {
        Complex f = new Complex();
        double deno = (c.realPart * c.realPart) + (c.imaginaryPart * c.imaginaryPart);

        double rea = (realPart * c.realPart) + (imaginaryPart * c.imaginaryPart);

        double ima = (c.realPart * imaginaryPart) - (c.imaginaryPart * realPart);

        f.realPart = rea / deno;
        f.imaginaryPart = ima / deno;

        // System.out.println(f.realPart+" "+f.imaginaryPart);
        return f;
    }

    public void setRealPart(double real) {
        this.realPart = real;
    }

    public void setImaginaryPart(double ima) {
        this.imaginaryPart = ima;
    }

    public double getRealPart() {
        return this.realPart;
    }

    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    public String toString() {
        String f = "";
        f += realPart;
        if (imaginaryPart >= 0) {
            f += "+";
        }
        return f + imaginaryPart + "i";
    }
}
