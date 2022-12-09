package shoppingKartUsingArray;
import java.util.Scanner;

//this class is for main menu
public class ShoppingKartOperations {
static Scanner sc=new Scanner(System.in);


//this method is listed all menus
static void AllMenus()
{
	int choice;
	//ProductService productService=new ProductService();
	
System.out.println("~~Welcome to the shopping kart~~");

	while(true) {
		System.out.println("=============================================");
		System.out.println("Press 1. for Admin panel\n"+"Press 2. for User panel\n"+"Press 3. for Quit");
		

		System.out.println("============================================");
		choice = sc.nextInt();
		System.out.println("============================================");

		switch (choice) {
		case 1:
			AdminPanel.adminOperation();
			System.out.println("============================================");
			break;
		case 2:
			UserPanel.UserOperation();
			System.out.println("============================================");
			break;

		case 3:System.exit(0);
		}
	}
}
}