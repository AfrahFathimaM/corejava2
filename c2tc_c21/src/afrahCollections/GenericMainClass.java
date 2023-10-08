package afrahCollections;

public class GenericMainClass {
	public static void main(String [] args) {
genericClass <String> obj=new genericClass<String>();//creating generic object for string type
obj.set("ello");
System.out.println(obj.get());
genericClass <Integer> obj2=new genericClass<Integer>();
obj2.set(45);
System.out.println(obj2.get());

}
}