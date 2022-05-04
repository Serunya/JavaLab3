package task_two;

public class Complex {
    private double x;
    private double y;
    public double x(){ return x;}
    public double y(){ return y;}
    private Complex(){}
    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    };

    public Complex add(double int2){
        double x = this.x + int2;
        return new Complex(x,this.y);
    }

    public Complex sub(double int2){
        double x = this.x - int2;
        return new Complex(x,this.y);
    }

    public Complex add(Complex int2){
        double x = this.x + int2.x;
        double y = this.y + int2.y;
        return new Complex(x,y);
    }

    public Complex sub(Complex int2){
        double x = this.x - int2.x;
        double y = this.y - int2.y;
        return new Complex(x,y);
    }
    public Complex mul(Complex int2){
        double x = this.x * int2.x - this.y * int2.y;
        double y = this.x * int2.y + int2.x * this.y;
        return new Complex(x,y);
    }
    public Complex div(Complex int2){
        double x = (this.x * int2.x + this.y * int2.y)/(int2.x * int2.x + int2.y * int2.y * int2.y);
        double y = (int2.x * this.y - this.x * int2.y)/(int2.x * int2.x + int2.y * int2.y * int2.y);
        return new Complex(x,y);
    }

    public boolean comp(Complex int2){
        boolean valid = this.x == int2.x;
        boolean imaginary = this.y == int2.y;
        if(valid & imaginary){
            return true;
        }
        return false;
    }

    public Complex pair(){
        double y = this.y * -1;
        return new Complex(this.x,y);
    }

    public double valid(){
        return this.x;
    }

    public double imaginary(){
        return this.y;
    }

    public String algebraic(){
        return this.x + " + ( i * " + this.y + " )";
    }

    public String triganometric(){
        double r = Math.sqrt(this.x * this.x + this.y * this.y);
        double ui = Math.atan(this.y/this.x);
        return r + "(cos(" + ui + ") + i * (sin(" + ui + "))";
    }

    public static Complex sin(Complex int1) {
        return new Complex(Math.sin(int1.x) * Math.cosh(int1.y), Math.cos(int1.x) * Math.sinh(int1.y));
    }

    public static Complex cos(Complex int1) {
        return new Complex(Math.cos(int1.x) * Math.cosh(int1.y), -Math.sin(int1.x) * Math.sinh(int1.y));
    }

    public static Complex tan(Complex int1) {
        return sin(int1).div(cos(int1));
    }

    public static Complex atan(Complex int1) {
        return cos(int1).div(sin(int1));
    }

    public static Complex ch(Complex int1) {
        return new Complex(Math.cosh(int1.x) * Math.cos(int1.y), Math.sinh(int1.x) * Math.sin(int1.y));
    }

    public static Complex sh(Complex int1) {
        return new Complex(Math.sinh(int1.x) * Math.cos(int1.y), Math.cosh(int1.x) * Math.sin(int1.y));
    }

    public static Complex th(Complex int1) {
        return sh(int1).div(ch(int1));
    }
    public static Complex cth(Complex int1) {
        return ch(int1).div(sh(int1));
    }



}

