package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionStringLength {
    String name;

     public FunctionStringLength(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        List<FunctionStringLength> list = new ArrayList<>();
        list.add(new FunctionStringLength("hello"));
        list.add(new FunctionStringLength("world"));
        list.add(new FunctionStringLength("java"));

        Function<FunctionStringLength,Integer> f = (s)->s.getName().length();

        for(FunctionStringLength h :list){
            System.out.println(f.apply(h));
        }

    }
}
