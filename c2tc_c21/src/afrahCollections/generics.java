package afrahCollections;
import java.util.ArrayList;
public class generics {
public static void main(String [] args) {
	ArrayList <String> var=new ArrayList<String>();
			var.add("adding values for string type");
			for(String str:var) {
				System.out.println(str);
			}
}
}
