package Esercizi_recap_22_11.MenuGenerico;

import java.util.ArrayList;

public class MainTest {

    public static ArrayList<String> listaUtenti = new ArrayList<>();

    public static AddUserHandler addUserHandler = new AddUserHandler(listaUtenti);
    public static PrintUsers printUsersHandler = new PrintUsers(listaUtenti);
    public static Menu homeMenu = Menu.getInstance();
    public static void main(String[] args) {
        homeMenu.addHandler(addUserHandler);
        homeMenu.addHandler(printUsersHandler);

        homeMenu.handleRequest();
    }
}
