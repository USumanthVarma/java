package ciet;
import java.util.Arrays;
import java.util.List;

public class thredn {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0)
				.toList();
		System.out.println("Even numbers: ");
		System.out.println(evenNumbers);
		}

}
