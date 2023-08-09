package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) throws IOException {
		File directory = new File("Task4");
		if (!directory.exists()) {
			directory.mkdirs();
		}

		File source = new File("text.txt");

		File result = new File("result_task4.txt");
		if (!result.exists()) {
			result.createNewFile();
		}

		ArrayList<File> files = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			files.add(i, new File(directory, ((i + 1) + ".txt")));

			if (!files.get(i).exists()) {
				files.get(i).createNewFile();
			}
		}

		String string = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
			String stringTemp;
			while ((stringTemp = bufferedReader.readLine()) != null) {
				string = string + stringTemp + "\n";
			}

			System.out.println(string.length());
			System.out.println(string);
			bufferedReader.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			Random random = new Random();
			for (int r = 0; r < files.size(); r++) {
				FileWriter fileWriter = new FileWriter(files.get(r));
				fileWriter.write(string.substring(0, random.nextInt(0, 575)));
				fileWriter.close();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (FileWriter fileWriter = new FileWriter(result)) {

			for (File f : files) {
				FileReader fileReader = new FileReader(f);
				fileWriter.write(f.getName() + " : " + f.length() + "\n");
				fileReader.close();
			}
			System.out.println("File recording completed!");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}