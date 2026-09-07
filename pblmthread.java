package ciet;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pblmthread {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"jiraya", "madara", "zoro", "naruto", "hashirama" );
		List<String> result = names.stream()
				.filter(name -> name.length() > 4)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
