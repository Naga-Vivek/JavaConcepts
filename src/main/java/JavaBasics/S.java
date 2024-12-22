package JavaBasics;

//Constructor
class sample1{
    int x;
    String y;
    sample1(){
        System.out.println("Default constructor of s1");
    }
    sample1(int x, String y){
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor of s1"+"x: "+x+" ,y: "+y);
    }
}
class sample2 extends sample1{
    int z;
    int w;
    sample2(){
        System.out.println("Default constructor of s2");
    }
    sample2(int x , String y , int z , int w){
        //super(x, y);
        this.z = z;
        this.w = w;
        System.out.println("Parameterized constructor of s2"+"x: "+super.x+" ,y: "+super.y+",z: "+this.z+" ,w: "+this.w);
    }
}
class S{
    public static void main(String args[]){
        //sample2 s2 = new sample2();
        sample2 s21 = new sample2(12,"hii",1,2);
        s21.w=1;
    }
}