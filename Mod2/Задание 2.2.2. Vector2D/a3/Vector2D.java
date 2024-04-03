package a3;

class a3 {
    public static void main(String[] args) {
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(5.0, 7.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(1.5);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(2);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}

public class Vector2D {
    public double vX;
    public double vY;
    public static int count = 0;

    public Vector2D() {
        this.vX = 1.0;
        this.vY = 1.0;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D vector) {
        this.vX = vector.vX;
        this.vY = vector.vY;
        count++;
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

    public void normalized(){
        double len = length();
        if (len != 0){
            this.vX /= len;
            this.vY /= len;
        }
    }

    public double dotProduct(Vector2D v){
        return this.vX * v.vX + this.vY * v.vY;
    }
}

