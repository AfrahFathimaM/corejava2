package afrahCollections;
import java.util.HashSet;
import java.util.Set;

public class setOperationss {

		public static void main(String [] args) { 
	Set<Integer> s1=new HashSet<>();
	Set<Integer> s2=new HashSet<>();
	Set<Integer> s3=new HashSet<>();

	s1.add(2);
	s1.add(3);
	s1.add(4);
	s2.add(1);
	s2.add(3);
	s2.add(5);
	s3.add(2);
	s3.add(4);
	s3.add(6);
	 
	Set<Integer> difference=new HashSet<>(s1);
	difference.removeAll(s2);

	Set<Integer> intersection=new HashSet<>(s1);
	intersection.retainAll(s2);

	Set<Integer> union=new HashSet<>(s1);
	union.addAll(s3);

	System.out.println("set1 is ="+s1);
	System.out.println("set2 is ="+s2);
	System.out.println("set3 is ="+s3);

	System.out.println("intersection operation :" +intersection);
	System.out.println("difference operation :" +difference);
	System.out.println("union operation :" +union);
		}
	}


