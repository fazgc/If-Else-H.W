public class A6ChildInterface implements PrintableParentInterface {

    public void print(){
        System.out.println("hello");
    }
    public static void main(String[] args){           //main methode
        A6ChildInterface a6ChildInterface = new A6ChildInterface();
        a6ChildInterface.print();// calling method print
    }
}
