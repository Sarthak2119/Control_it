package com.example.sarthak.share_and_control_it;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.DataOutputStream;

/**
 * Created by sarthak on 2/4/16.
 */
public class RemoteControl extends Activity{
    Connector connector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote);
        connector=new Connector();
    }

    public void openGedit(View view)
    {
        try {

            connector.execute("gedit");
        }
        catch (Exception e){e.printStackTrace();}
    }

    public void openFirefox(View view)
    {
        try {
           // connector=new Connector();
            connector.execute("firefox");
        }
        catch (Exception e){e.printStackTrace();}
    }

    public void shutdown(View view)
    {
        try {
//            connector=new Connector();
//            connector.execute("poweroff");
        }
        catch (Exception e){e.printStackTrace();}
    }
}
