package org.example.pluginroot.master;

import org.example.pluginroot.pluginint.PluginInterface;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public Main(){
        loadPlugin(new File("E:\\projetos\\application-pluginroot\\plugin-anotherfeature\\target\\plugin-anotherfeature-1.0-SNAPSHOT.jar"), "xxxx");
        loadPlugin(new File("E:\\projetos\\application-pluginroot\\plugin-implementation\\target\\plugin-implementation-1.0-SNAPSHOT.jar"), "yyyyy");

    }

    private void loadPlugin(File myPluginJar,String... args){
        try {
            URLClassLoader child = new URLClassLoader(
                    new URL[] {myPluginJar.toURI().toURL()},
                    this.getClass().getClassLoader()
            );
            Class classToLoad = Class.forName("com.myplugin.Start", true, child);
            Constructor<PluginInterface> constructor  = classToLoad.getConstructor();
            PluginInterface servico = constructor.newInstance();
            System.out.println("# "+servico.getName()+" # ");
            servico.onStart();
            servico.onRun(args);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String... args){
        new Main();
    }
}
