package JavaBasics.TypesOfInterfaces;

class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class MarkerInterfaceDemo implements Cloneable {  //marker interface
    int a = 10;
    String b = "Hello";
    Pair p = new Pair(12,18);
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //shallow copy
        return super.clone();
    }

    public static void main(String[] args) {
        MarkerInterfaceDemo obj = new MarkerInterfaceDemo();
        System.out.println("Example of Cloneable Interface - Shallow Copy");
        System.out.println("Before Cloning: " + obj.a + " " + obj.b + " "+obj.p + " " +obj.p.x + " " + obj.p.y);
        try {
            MarkerInterfaceDemo obj1 = (MarkerInterfaceDemo) obj.clone();
            System.out.println("After Cloning: " + obj1.a + " " + obj1.b + " "+obj1.p + " " +obj1.p.x + " " + obj1.p.y);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
