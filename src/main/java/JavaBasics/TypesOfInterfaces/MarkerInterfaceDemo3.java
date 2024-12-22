package JavaBasics.TypesOfInterfaces;

import java.io.*;

class Product implements Serializable{//marker interface
    int id;
    String name;
    double price;
    Category category;
    Product(int id, String name, double price , Category category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
class Category implements Serializable{
    int catId;
    String catName;
    Category(int catId, String catName){
        this.catId = catId;
        this.catName = catName;
    }
}
public class MarkerInterfaceDemo3 {
    public static void main(String[] args) {
        Category c = new Category(101, "Electronics");
        Product p = new Product(1, "Laptop", 45000, c);
        System.out.println("Before Serialization\nProduct:  "+p.id+" "+p.name+" "+p.price);
        System.out.println("Category: "+c.catId+" "+c.catName);
        
        String filePath = System.getProperty("user.dir")+"\\product.ser";
        System.out.println("\nSerialization into Java Native Serialization format(binary format in .ser file)");
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            //product.ser is the file where object is serialized , it is created in the project folder
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
            fos.close();
            System.out.println("Object is serialized  and stored in product.ser file\n");
        } catch (IOException e) {
            System.out.println("IOException is caught");
            e.printStackTrace();
        }
        //Deserialization
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Product p1 = (Product) ois.readObject();
            Category c1 = p1.category;
            ois.close();
            fis.close();
            System.out.println("After Deserialization\nProduct: "+p1.id+" "+p1.name+" "+p1.price);
            System.out.println("Category: "+c1.catId+" "+c1.catName);
        } catch (java.io.IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
