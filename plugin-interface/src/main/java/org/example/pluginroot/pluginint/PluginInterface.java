package org.example.pluginroot.pluginint;

public interface PluginInterface {
    void onStart();
    int onRun(String ...args);
    String getName();
}
