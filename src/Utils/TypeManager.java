package Utils;

import CodeGeneration.ClassSpecification;
import CodeGeneration.FileManager;
import Java.Main;
import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.Map;

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

    public static ArrayList<Type> covertToTypeArray(Type type) {

        Map<String, Type> map = type.getColumns();
        ArrayList<Type> listColumns = new ArrayList<>();
        for (int i = 0; i < type.getColumnsList().size(); i++) {
            Type type1 = new Type();
            type1.addColumn(map.get(type.getColumnsList().get(i)).getName(), null);
            type1.setName(type.getColumnsList().get(i));
            listColumns.add(type1);
        }

        return listColumns;
    }

    public static void convertType2Class(Type type) {
        //TODO pass type & path
        ClassSpecification classSpecification = new ClassSpecification(type.getName(), type.getType(), type.getPath(), Main.packageName, covertToTypeArray(type));
        try {
            new FileManager().generateJavaSourceFile(classSpecification);
            Main.symbolTable.addClassSpecification(classSpecification);
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

//    public static <T> ArrayList<T> flat(Object t){
//
//    }

}
