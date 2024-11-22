package Esercizi_recap_22_11.MenuGenerico;

public class MainTest {

    public static UsersHandler addUserHandler = new AddUserHandler();
    public static UsersHandler printUsersHandler = new PrintUsersHandler();
    public static Menu homeMenu = Menu.getInstance();
    public static void main(String[] args) {
        homeMenu.addHandler(addUserHandler);
        homeMenu.addHandler(printUsersHandler);

        homeMenu.handleRequest();
    }
}
