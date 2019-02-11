package com.voltron.router.demo.mod_java.service;

import android.os.Binder;
import android.util.Log;

public class DemoBinder extends Binder {
    public void sayHello(){
        Log.e("DemoBinder", "sayHello");
    }
}