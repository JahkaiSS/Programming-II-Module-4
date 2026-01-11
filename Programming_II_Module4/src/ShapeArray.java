public class ShapeArray {

    public static void main(String[] args) {

        
        Shape sphere = new Sphere(30.0);
        Shape cylinder = new Cylinder(9.5, 3.3);
        Shape cone = new Cone(5.5, 6.0);

        
        Shape[] shapeArray = { sphere, cylinder, cone };

        
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
            System.out.println("-------------------------");
        }
    }
}