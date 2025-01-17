package Day12.Extenalizable;

import java.io.*;

public class ExtensibleCheck {
    public static void main(String[] args) {
        try {

            ExternalSerializable es = new ExternalSerializable(42);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/BackEndTraining/demo-serialization.ser"))) {
                oos.writeObject(es);
            }

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/BackEndTraining/demo-serialization.ser"))) {
                ExternalSerializable deserializedEs = (ExternalSerializable) ois.readObject();
                System.out.println("Deserialized ID: " + deserializedEs.getId());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
