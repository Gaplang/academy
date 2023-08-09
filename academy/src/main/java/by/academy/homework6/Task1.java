package by.academy.homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws IOException {

		File file = new File("task1.txt");
		if (!file.exists()) {
			file.createNewFile();

		}

		try (FileWriter fos = new FileWriter(file); Scanner scanner = new Scanner(System.in)) {
			System.out.println("Write word /stop/ when u finished writing");

			while (scanner.hasNextLine()) {
				String string = scanner.nextLine();
				if (string.equals("stop")) {
					System.out.println("File recording completed!");
					break;

				} else {
					fos.write(string + "\r\n");
				}

			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}