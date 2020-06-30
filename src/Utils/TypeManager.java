package Utils;

import Java.SymbolTable.Type;

public class TypeManager {

    public static Type guessType(String type) {
        Type varType = new Type();
        switch (type) {
            case Type.STRING_CONST:
                varType.setName(Type.STRING_CONST);
                break;
            case Type.NUMBER_CONST:
                varType.setName(Type.NUMBER_CONST);
                break;
            case Type.BOOLEAN_CONST:
                varType.setName(Type.BOOLEAN_CONST);
                break;
            default:
                varType.setName(type);
        }
        return varType;
    }
}
