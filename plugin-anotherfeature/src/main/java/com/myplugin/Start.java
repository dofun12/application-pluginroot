package com.myplugin;

import org.example.pluginroot.pluginint.PluginInterface;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Start implements PluginInterface {
    public void onStart() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(now));
    }

    public int onRun(String... args) {
        if(args!=null && args.length>0){
            System.out.println("Esse é diferente... "+args[0]);
        }
        System.out.println("OPA Taca pau");
        return 0;
    }

    public String getName(){
        return "Another Implementation";
    }
}
