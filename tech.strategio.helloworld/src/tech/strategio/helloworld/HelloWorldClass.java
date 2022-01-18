package tech.strategio.helloworld;

//	Java OPP
// tetxtual representation how an object will look like in memory
// Whatever we write in class is in actual the property of the object
// If you want anything that should belong to class make it static

class Product {
//		Attributes
	int product_id;
	String name;
	int price;
	Product(){
		System.out.println(">>Product Object Constructed")
	}
//	Methods/Behaviors
//	To write data in Product Object we have in the Method
	void setProductDetails(int product_id, String name, int price){
		this.product_id;
		this.name;
		this.price;
	}

}
// Behavior details -> to read data from Product Object
	void showProductDetails(){
	System.out.println("---Product ID: "+productID+"-----");
	System.out.println("Name:\t"+name);
	System.out.println("Price:\t"+price);
	System.out.println("Price:\t"+price);
}

public class HelloWorldClass {
// Main is executed by JVM when my program will run
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello World");
//		Create ab Object : Product
		Product product = new Product();
//		Product is not object it is a reference variable which holds the Hashcode of the obehct  in heixcal notation
		System.out.println("product is: "+product);
//		Writing data in Object
		product.setProductDetails(101,"Iphone",1000);
	}

