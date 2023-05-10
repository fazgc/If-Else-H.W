public class CircleChildAbs extends ShapeParentAbs {

    void draw(){
        System.out.println("drawing circle");
    }

    public static void main(String[] args) {

        ShapeParentAbs shapeParentAbs = new CircleChildAbs();
        shapeParentAbs.draw();
    }
}
