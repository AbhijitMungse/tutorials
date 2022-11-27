package interfaceExample;

interface LibraryUser {
	public void registerAccount(int age);

	public void requestBook(String bookType);
}

class KidUser implements LibraryUser {
	int age;
	String bookType;

	@Override
	public void registerAccount(int age) {
		if (age < 12) {
			System.out.println("you have successfully registered under the kids account");
		} else {
			System.out.println("sorry age must be under 12 years to registered as kid account");
		}
	}

	@Override
	public void requestBook(String bookType) {
		if (bookType == "kids") {
			System.out.println("“Book Issued successfully,\r\n" + "please return the book within 10 days”");
		} else {
			System.out.println("“Oops, you are allowed to take only kids books");
		}
	}
}

class AdultUser implements LibraryUser {
	int age;
	String bookType;

	@Override
	public void registerAccount(int age) {
		if (age > 12) {
			System.out.println("you have successfully registered under adult account");
		} else {
			System.out.println("sorry age must be greater than 12 to registered as adult account");
		}
	}

	@Override
	public void requestBook(String bookType) {
		if (bookType == "fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}

public class Interface {
	public static void main(String[] args) {
		KidUser kid=new KidUser();
		AdultUser adult=new AdultUser();
		kid.registerAccount(10);
		kid.requestBook("kids");
		System.out.println("===========================================");
		
		adult.registerAccount(13);
		adult.requestBook("fiction");
		
}
}
