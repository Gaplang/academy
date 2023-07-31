package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "Hello there, and welcome to the one and only iMeetzu text random chat. "
				+ "Here we pride ourselves with being the best of the best at what we do!";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer val = map.get(c);
			if (val != null) {
				map.put(c, val + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
