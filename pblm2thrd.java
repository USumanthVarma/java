package ciet;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pblm2thrd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
				2, 5, 12, 20, 43, 19 
				);
		List<Integer> result = numbers.stream()
				.distinct()
				.filter(n -> n > 10)
				.sorted((a, b) -> b - a)
				.collect(Collectors.toList());
				
		int sum = result.stream()
				.reduce(0, Integer::sum);
		
		System.out.println(result);
		System.out.println("sum = "+ sum);
	}

}
