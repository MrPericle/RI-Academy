package Esercizi_recap_22_11.MenuGenerico;

public class MainTest {

    public static AddUserHandler addUserHandler = new AddUserHandler();
    public static PrintUsersHandler printUsersHandler = new PrintUsersHandler();
    public static Menu homeMenu = Menu.getInstance();
    public static void main(String[] args) {
        homeMenu.addHandler(addUserHandler);
        homeMenu.addHandler(printUsersHandler);

        homeMenu.handleRequest();
    }
}
