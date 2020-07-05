package bookStore.client;

import java.io.IOException;

import bookStore.server.BookStoreServerMain;
import bookStore.util.ClientUiUtil;
import bookStore.util.CommandType;

/**
 * main method
 * @author acmil
 *
 */
public class BookStoreClientMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		startService();
	}

	//start service
	static void startService() throws IOException, ClassNotFoundException{
		BookStoreServerMain serverStart = new BookStoreServerMain();
		serverStart.initialize(CommandType.LOGIN);
		ClientUiUtil.systemOut(serverStart.getMessage());
		BookStoreClientUserController controller = new BookStoreClientUserController();
		controller.process();
	}
}
