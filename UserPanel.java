package shoppingKartUsingArray;
import java.util.Scanner;

//this class is for User operations
public class UserPanel {
static Scanner sc=new Scanner(System.in);
static void UserOperation()
{
	System.out.println("==========================================");
	while(true)
	{
		System.out.println("press 1. for book product\n"
				+"Press 2. for cancel order\n"+"press 3. for exit\n"
	+"press 4. for go back to the main menu");
		
		System.out.println("=================================");
		System.out.println("Enter your choice");
		int choice;
		choice =sc.nextInt();
		System.out.println("==================================");

		switch(choice) {
		case 1:
			ProductService.bookProduct();
			System.out.println("================================");
			break;
		case 2:
			ProductService.cancelOrder();
			System.out.println("================================");
			break;
		case 3:
			ShoppingKartOperations.AllMenus();
		}
	}
}
}
