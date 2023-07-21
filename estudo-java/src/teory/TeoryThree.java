package teory;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class TeoryThree {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("ea");
		list.add("cb");
		list.add("cc");
		list.add("dd");
		list.add("cc");
		System.out.println(list.size());
		list.add(2, "ff");
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		list.removeIf(x -> x.charAt(0) == 'e');
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		System.out.println(list.indexOf("cc"));
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'c').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(1) == 'c').findFirst().orElse(null);
		System.out.println(name);
	}
}
