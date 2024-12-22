package Java8;

import javax.script.*;
import java.io.*;

public class NashornDemo{
    public static void main(String args[]){
        System.out.println("Java version: " + System.getProperty("java.version"));
        try{
        ScriptEngineManager mgr = new ScriptEngineManager();
        //ScriptEngine engine = mgr.getEngineByName("JavaScript");
        //engine.eval("print('Hello')");
        
        ScriptEngine engine = mgr.getEngineByName("nashorn");
        engine.eval(new FileReader("abc.js"));

        Invocable inv = (Invocable) engine;
        inv.invokeFunction("abc");
        inv.invokeFunction("add",10,20);
        String result = (String) inv.invokeFunction("greet","Rajiv","Singh");
        System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}