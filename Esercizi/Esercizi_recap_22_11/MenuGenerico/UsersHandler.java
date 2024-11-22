package Esercizi_recap_22_11.MenuGenerico;

import java.util.ArrayList;

public abstract class UsersHandler implements IMenuHandler {

    protected static ArrayList<String> userList = new ArrayList<>();

    public abstract void handle();

    
    public abstract String printInfo();

    

}
