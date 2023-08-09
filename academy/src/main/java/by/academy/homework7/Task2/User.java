package by.academy.homework7.Task2;

import java.util.Objects;

public class User extends Person {
	private String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String firstName, String lastName, int age, int day, int month, int year, String login, String password,
			String email) {
		super(firstName, lastName, age, day, month, year);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public void showInfo() {
		System.out.println("User info: \n" + "first name: " + getFirstName() + "\n" + "last name: " + getLastName()
				+ "\n" + "age: " + getAge() + "\n" + "date of birth: " + getDataOfBirth() + "\n" + "email: " + email);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(email, login, password);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + "]";
	}

}
