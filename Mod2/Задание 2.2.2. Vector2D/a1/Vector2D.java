package a1;

class a1 {
    public static void main(String[] args) {
        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();
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
}

