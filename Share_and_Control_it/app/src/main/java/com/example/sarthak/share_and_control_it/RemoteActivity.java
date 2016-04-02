package com.example.sarthak.share_and_control_it;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class RemoteActivity extends Activity {

    Button shutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_remote);
        //    shutButton = (Button)findViewById(R.id.shut);
        //  con = new Connection("ds");
        //con.start();
    }

    public void mouse(View view) {
        Intent in = new Intent(this, MouseActivity.class);
        startActivity(in);
    }

    public void poweroff(View view) {
        MainActivity.ps.println("P");
    }

    public void logoff(View view) {
        MainActivity.ps.println("L");
    }

    public void setting(View view) {
          Intent in=new Intent(this,Settings.class);
         startActivity(in);

    }
}
