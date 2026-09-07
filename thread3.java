package ciet;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
public class thread3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("varma, sulli, psych");
		List<String> result = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}