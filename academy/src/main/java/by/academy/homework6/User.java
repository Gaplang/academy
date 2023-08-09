package by.academy.homework6;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Closeable, Serializable {
	private String Name;
	private String Surname;
	private int age;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public User(String name, String surname, int age) {
		super();
		Name = name;
		Surname = surname;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Surname == null) ? 0 : Surname.hashCode());
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Surname == null) {
			if (other.Surname != null)
				return false;
		} else if (!Surname.equals(other.Surname))
			return false;
		if (age != other.age)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [Name=" + Name + ", Surname=" + Surname + ", age=" + age + "]";
	}

	public void close() throws IOException {
	}

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Harry", "Poter", 12));
		users.add(new User("Avatar", "Ann", 99));
		users.add(new User("Frodo", "Kolecko", 25));
		users.add(new User("Erich", "Remark", 40));
		users.add(new User("Antonio", "Bonderos", 55));
		users.add(new User("Zhack", "Dark", 55));
		users.add(new User("Anton", "Bond", 23));
		users.add(new User("Onion", "Harmless", 88));
		users.add(new User("Bur", "Bone", 7));
		users.add(new User("Erick", "Daun", 105));

		File pac = new File("users");
		if (!pac.exists()) {
			pac.mkdir();
		}
		File serializableObjectDemoFile = null;
		for (int i = 0; i < users.size(); i++) {
			try {
				serializableObjectDemoFile = new File("users",
						users.get(i).getName() + "_" + users.get(i).getSurname() + ".txt");
				if (!serializableObjectDemoFile.exists()) {
					serializableObjectDemoFile.createNewFile();
				}
				try (ObjectOutputStream os = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(serializableObjectDemoFile)))) {
					os.writeObject(users.get(i));
					os.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
