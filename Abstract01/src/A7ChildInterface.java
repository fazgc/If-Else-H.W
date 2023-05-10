public class A7ChildInterface implements DrawableParentInterface , ShowableParentInterface {   //child class multipal inheritance via interface
    //normal method
    public void show() {
        System.out.println("hello");}

        public void draw() {
            System.out.println("welcome");
        }

        public static void main(String[] args){
            A7ChildInterface a7ChildInterface = new A7ChildInterface();
            a7ChildInterface.show();
            a7ChildInterface.draw();
        }
    }