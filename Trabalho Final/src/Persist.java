import java.io.*;

public class Persist {
    public static boolean gravar(Object a, String arquivo) {
        try {
            // Criar um objeto FileOutputStream
            FileOutputStream arq = new FileOutputStream(arquivo);
            // Criar um objeto ObjectOutputStream
            ObjectOutputStream os = new ObjectOutputStream(arq);
            // Gravar o objeto
            os.writeObject(a);
            // Fechar os objetos
            os.close();
            arq.close();
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static Object recuperar(String arquivo) {
        Object obj = null;
        try {
            // Criar um objeto FileInputStream
            FileInputStream arq = new FileInputStream(arquivo);
            // Criar um objeto ObjectInputStream
            ObjectInputStream is = new ObjectInputStream(arq);
            // Ler o objeto
            obj = is.readObject();
            // Fechar os objetos
            is.close();
            arq.close();
        } catch(Exception e) {
            return null;
        }
        return obj;
    }
}
