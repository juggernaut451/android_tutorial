package com.example.juggernaut.database;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by juggernaut on 14/3/16.
 */
public class Message {

    public static void message (Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
