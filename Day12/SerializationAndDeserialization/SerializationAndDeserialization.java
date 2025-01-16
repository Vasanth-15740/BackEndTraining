package Day12.SerializationAndDeserialization;

import java.io.*;

public class SerializationAndDeserialization {

    public void serialization() {
        ObjectOutputStream os = null;
        try {
            DataClass ds = new DataClass();
            ds.setid(10);
            ds.setName("Vasanth");
            os = new ObjectOutputStream(new FileOutputStream("D:/BackEndTraining/demo-serialization.ser"));
            os.writeObject(ds);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

   public void Deserialization(){
       ObjectInputStream is =null;
       try{
           is = new ObjectInputStream(new FileInputStream("D:/BackEndTraining/demo-serialization.ser"));
           DataClass ds = (DataClass) is.readObject();
           System.out.println(ds.getid());
           System.out.println(ds.getName());
       } catch (IOException | ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
       finally {
           try{
               if(is!=null){
                   is.close();
               }
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
   }
    public static void main(String[] args) {
        SerializationAndDeserialization s = new SerializationAndDeserialization();
        s.serialization();
        s.Deserialization();
    }
}

