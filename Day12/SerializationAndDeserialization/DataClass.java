package Day12.SerializationAndDeserialization;

import java.io.Serializable;

public class DataClass implements Serializable {
    int id ;
    String name;

    int getid(){
        return id;
    }
    String getName(){
        return name;
    }
    void setid(int id){
        this.id=id;
    }
    void setName(String name){
        this.name= name;
    }
}
