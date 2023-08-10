package by.academy.control.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {

	public static void main(String[] args) throws IOException {
		String ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String:");
		ch = br.readLine();
		int count = 0, len = 0;
		do {
			try {
				char name[] = ch.toCharArray();
				len = name.length;
				count = 0;
				for (int j = 0; j < len; j++) {
					if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
						count++;
				}
				if (count != 0)
					System.out.print(count + "" + name[0]);
				ch = ch.replace("" + name[0], "");
			} catch (Exception ex) {
			}
		} while (len != 1);
	}

}
/*
 * ----------second version------ public static void main(String[] args) {
 * String str = *
 * " aaaaaaaaaaaaaaaNNNNNNNNNttttttttttOOOOOOOOOnnnnnnnIIIIIIIIooooooo";
 * System.out.println(Arrays.stream(str.trim().split("(?<=(.))(?!\\1)")) .map(x
 * -> x.length() > 1 ? String.format("%d%c", x.length(), x.charAt(0)) : x)
 * .collect(Collectors.joining())); }
 */
