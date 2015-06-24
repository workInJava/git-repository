package test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class TestRunable {

	/*
	 * public static void main(String[] args) { Run r = new Run(); // Thread t =
	 * new Thread(r); // t.start(); r.start(); try { Thread.sleep(10000); }
	 * catch (InterruptedException e){ r.interrupt(); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * // static class Run implements Runnable{ static class Run extends Thread
	 * { boolean flag = true; public void run(){ while(flag) {
	 * System.out.println("11111111111111111" + new Date()); for(int
	 * i=0;i<50;i++){ System.out.println(i); } try { sleep(1000); }
	 * catch(InterruptedException e) { flag = false; } } }
	 * 
	 * }
	 */

	/*
	 * public static boolean test (String s,(String a, String b) ->
	 * b.compareTo(a)){ return f; }
	 */

	public static void main(String[] args) {

		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		Function<String, String> toInteger = String::valueOf;
		Function<String, String> backToString = toInteger.andThen(toInteger);
		System.out.println(backToString.apply("123")); // "123"

	}
}
