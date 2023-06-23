package by.academy.homework3;

import java.util.Objects;
import java.util.Scanner;

public class User {
	String name;
	int age;
	double money;
	String phone;
	String email;
	String dataofBirth;

	Validator dataValidator;
	Validator phoneValidator;
	Validator emailValidator;

	public User(String name, int age, double money, String phone, String email, String dataofBirth,
			Validator dataValidator, Validator phoneValidator, Validator emailValidator) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
		this.phone = phone;
		this.email = email;
		this.dataofBirth = dataofBirth;
		this.dataValidator = dataValidator;
		this.phoneValidator = phoneValidator;
		this.emailValidator = emailValidator;
	}

	public String toString() {
		return "User [dateOfBirth=" + dataofBirth + ", phone=" + phone + ", email=" + email + ", dateValidator="
				+ dataValidator + ", phoneValidator=" + phoneValidator + ", emailValidator=" + emailValidator + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setDateBirdh(String dateBirth) {
		if (dataValidator.validate(dateBirth)) {
			this.dataofBirth = dateBirth;
		} else {
			System.out.println("Invalid date format. Please enter in the format dd/MM/yyyy or dd-MM-yyyy.");
		}
	}

	public int hashCode() {
		return Objects.hash(dataofBirth, dataValidator, email, emailValidator, phone, phoneValidator);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dataofBirth, other.dataofBirth) && Objects.equals(dataValidator, other.dataValidator)
				&& Objects.equals(email, other.email) && Objects.equals(emailValidator, other.emailValidator)
				&& Objects.equals(phone, other.phone) && Objects.equals(phoneValidator, other.phoneValidator);
	}

	public void setPhone(String phone) {
		if (phoneValidator.validate(phone)) {
			this.phone = phone;
		} else {
			System.out.println("Invalid phone number.");
		}
	}

	public void setEmail(String email) {
		if (emailValidator.validate(email)) {
			this.email = email;
		} else {
			System.out.println("Invalid email address. Please enter a valid email address.");
		}
	}

	public void enterUserDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter date of birth: ");
		setDateBirdh(scan.nextLine());
		System.out.print("Enter Belarus phone number: ");
		setPhone(scan.nextLine());
		System.out.print("Enter email address: ");
		setEmail(scan.nextLine());
	}
}
