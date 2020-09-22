package com.myplugin;

import org.example.pluginroot.pluginint.PluginInterface;

public class Start implements PluginInterface {
    public void onStart() {
        System.out.println("Iniciando o meu plugin");
    }

    public int onRun(String... args) {
        System.out.println("Rodando...");
        return 0;
    }

    public String getName(){
        return "Plugin Implementation";
    }
}
