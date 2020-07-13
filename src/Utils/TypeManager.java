package Utils;

import CodeGeneration.ClassSpecification;
import CodeGeneration.FileManager;
import Java.Main;
import Java.SymbolTable.Type;

public class TypeManager {

    public static Type guessType(String type) {
        Type varType = new Type();
        if (type == null)
            varType.setName(null);
        else
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

    public static void convertType2Class(Type type) {
        //TODO pass type & path
        ClassSpecification classSpecification = new ClassSpecification(type.getName(), type.getType(), type.getPath(), "sample", type.getColumns());
        try {
            new FileManager().generateJavaSourceFile(classSpecification);
        } catch (Exception e) {
            System.out.println("error in convert");
        }
    }

    public static void convertDeclaredTypes2Classes() {
        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
            Type type = Main.symbolTable.getDeclaredTypes().get(i);
            convertType2Class(type);
        }
    }
}
