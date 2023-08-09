package by.academy.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws NoSuchMethodException {
		User user = new User("Max", "Stierlitz", 26, 29, 8, 1997, "vaninIvan", "111911Ivan", "stierlitz@gmail.com");
		user.showInfo();

		Class<User> userClass = User.class;
		try {
			System.out.println(userClass.getMethod("showInfo"));
			System.out.println(Arrays.toString(userClass.getMethods()));

			System.out.println(userClass.getField("email"));
			System.out.println(Arrays.toString(userClass.getFields()));

			System.out.println(userClass.getDeclaredMethod("showInfo"));
			System.out.println(Arrays.toString(userClass.getDeclaredMethods()));

			System.out.println(userClass.getDeclaredField("email"));
			System.out.println(Arrays.toString(userClass.getDeclaredFields()));

			Field userFirstName = userClass.getSuperclass().getDeclaredField("firstName");
			userFirstName.setAccessible(true);
			userFirstName.set(user, "Max");

			Field userSecondName = userClass.getSuperclass().getDeclaredField("secondName");
			userSecondName.setAccessible(true);
			userSecondName.set(user, "Stierlitz");

			Field userAge = userClass.getSuperclass().getDeclaredField("age");
			userAge.setAccessible(true);
			userAge.set(user, 0);

			Field userDataOfBirth = userClass.getSuperclass().getDeclaredField("dateOfBirth");
			userDataOfBirth.setAccessible(true);
			userDataOfBirth.set(user, LocalDate.now());

			Field userEmail = userClass.getDeclaredField("email");
			userEmail.setAccessible(true);
			userEmail.set(user, "istierlitz@gmail.com");

			Method toString = userClass.getDeclaredMethod("toString");
			toString.invoke(user);

		} catch (SecurityException | NoSuchMethodException | NoSuchFieldException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			System.out.println(e.getMessage());

		}
	}

}