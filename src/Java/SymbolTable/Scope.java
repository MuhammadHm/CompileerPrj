package Java.SymbolTable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private String id;
    private Scope parent;
    private Map<String, ArrayList<Symbol>> symbolMap = new LinkedHashMap<String, ArrayList<Symbol>>();    // String for Symbol name
    private boolean isOpen=false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, ArrayList<Symbol>>getSymbolMap() {
        return symbolMap;
    }

    public void setSymbolMap(Map<String, ArrayList<Symbol>> symbolMap) {
        this.symbolMap = symbolMap;
    }
    public void addSymbol(String name, Symbol symbol) {
        if(this.symbolMap.get(name)==null){
            ArrayList<Symbol> symbols=new ArrayList<>();
            symbols.add(symbol);
            this.symbolMap.put(name,symbols);
        }
        else{
            this.symbolMap.get(name).add(symbol);
        }
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    public boolean isOpen() {
        return isOpen;
    }
}
