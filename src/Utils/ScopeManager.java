package Utils;

import Java.Main;
import Java.SymbolTable.Scope;

import java.util.ArrayList;

public class ScopeManager {
    static ArrayList<Scope> scopes = Main.symbolTable.getScopes();
    static int id = 1;

    public static Scope getLastOpened() {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).isOpen()) {
                return scopes.get(i);
            }
        }
        return null;
    }

    public static void createOpenedScope() {
        System.out.println("create scope");
        Scope scope = new Scope();

        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).isOpen()) {
                scope.setParent(scopes.get(i));
                scope.setOpen(true);
                scope.setId(Integer.toString(id));
                break;
            }
        }
        ++id;

        Main.symbolTable.addScope(scope);
    }

    public static void closeLastOpened() {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).isOpen()) {
                scopes.get(i).setOpen(false);
                break;
            }
        }
    }
    public static Scope getScopeById(String id){

        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            if(Main.symbolTable.getScopes().get(i).getId()==id){
                return Main.symbolTable.getScopes().get(i);
            }
        }
        return null;
    }

}
