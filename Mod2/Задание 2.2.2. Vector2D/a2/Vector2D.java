package a2;

class a2 {
    public static void main(String[] args) {
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(1.0, 3.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(2);
        vC.print();
    }
}

public class Vector2D {
    public double vX;
    public double vY;

    public Vector2D() {
        this.vX = 1.0;
        this.vY = 1.0;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vector) {
        this.vX = vector.vX;
        this.vY = vector.vY;
    }


    public void print() {
        System.out.printf("(%.2f, %.2f)\n", vX, vY);
    }

    public double length(){
        return Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v){
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double numb){
        this.vX *= numb;
        this.vY *= numb;
    }
}

