public class a1 {
    public static void main(String[] args) {

        System.out.printf("%.10f", Geom.segmentLength(0, 0, 1, 0));

        System.out.printf("%.10f", Geom.trianglePerimeter(0, 0, 1, 0, 0, 1));
    }
}



public class Geom {
    public static double segmentLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        double side1 = segmentLength(x1, y1, x2, y2);
        double side2 = segmentLength(x2, y2, x3, y3);
        double side3 = segmentLength(x3, y3, x1, y1);

        return side1 + side2 + side3;
    }

}