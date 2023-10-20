import java.util.Scanner;
public class Main {
    class coorditanes {
        double x;
        double y;

        public coorditanes(double x, double y) { // this method has constructor to get coordinates
            this.x = x;
            this.y = y;
        }
        double distance(coorditanes points) {
            return Math.sqrt(Math.pow(this.x - points.x, 2) + Math.pow(this.y - points.y, 2));
            // calculating distance between the 2 points that user has added.
        }
    }
    class Triangle{ // class for triangles
        coorditanes[] vertices;

        Triangle(coorditanes[] vertices) { // this method has constructor for vertices of triangle
            this.vertices = vertices;
        }


    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);



    }
}






















