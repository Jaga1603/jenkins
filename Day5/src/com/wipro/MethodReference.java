package com.wipro;
import java.util.Arrays;
import java.util.List;

interface Printer {
    void printMessage(String message);
}

public class MethodReference {
	public static void main(String[] args) {
		Printer printer = message -> System.out.println(message);

        List<String> messages = Arrays.asList("Hello", "World", "Java", "Method Reference");
        messages.forEach(printer::printMessage);
    }

}
