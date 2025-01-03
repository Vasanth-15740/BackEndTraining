package Day5.AditionalProgram;

import Day5.AditionalProgram.Utilities.Container;
import Day5.AditionalProgram.Utilities.Priority;

public class Main {
    public static void main(String[] args) {

        Container<Integer> intContainer = new Container<>(123);
        System.out.println("Integer value: " + intContainer.getItem());


        Container<String> stringContainer = new Container<>("Hello World");
        System.out.println("String value: " + stringContainer.getItem());


        Container<Priority> priorityContainer = new Container<>(Priority.HIGH);
        System.out.println("Priority value: " + priorityContainer.getItem());
    }
}
