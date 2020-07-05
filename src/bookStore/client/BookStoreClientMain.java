package bookStore.client;

import java.io.IOException;
/**
 * main method
 * @author acmil
 *
 */
public class BookStoreClientMain {
	
	static BookStoreClientUserController userController = new BookStoreClientUserController();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		while(true) {
			boolean loginAndRegisterCheck = true;
				if(loginAndRegisterCheck) {
					loginAndRegisterCheck = userController.startService();
					while(loginAndRegisterCheck) { 
						BookStoreClientMainMenuController main = new BookStoreClientMainMenuController(userController.getBookStoreDto());
						main.process(userController.getBookStoreDto().getUserType());
					}
				} else {
					loginAndRegisterCheck = userController.startService();
				}	
		}
	}
}
