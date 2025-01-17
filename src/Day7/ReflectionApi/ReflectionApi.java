package Day7.ReflectionApi;
import java.lang.reflect.*;
public class ReflectionApi {
    public static void main(String[] args) {
        try{
        Class c =Class.forName("Day7.ReflectionApi.Person");
            System.out.println("Class Name : "+c.getName());

            Constructor con[] = c.getDeclaredConstructors();
            for (int i = 0; i < con.length; i++) {
                System.out.println(con[i]);
            }

            Field f[] = c.getDeclaredFields();
            for (int i = 0; i < f.length; i++) {
                System.out.println(f[i]);
            }

            Method m[] =c.getDeclaredMethods();
            for (int i = 0; i < m.length ; i++) {
                System.out.println(m[i]);
                if(m[i].getName().contains("Display")){
                    m[i].invoke(c.newInstance(),"hari",21,"CSE7");
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
