package com.example.sarthak.share_and_control_it;

import android.os.AsyncTask;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by sarthak on 2/4/16.
 */
public class Connector extends AsyncTask<String, Void, String> {
    Socket socket;
    DataOutputStream dos;
    String str;
    @Override
    protected String doInBackground(String... params) {
            str= params[0];
            try{
            socket = new Socket("192.168.43.241",1755);

                //top.show();

            }
            catch (Exception e){
            //System.out.println("catch\n");
            e.printStackTrace();
            }
            return null;
    }

    @Override
    protected void onPostExecute(String s) {
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(str);
        }catch (Exception e){}

    }

    @Override
    protected void onPreExecute() {

    }

    @Override
    protected void onProgressUpdate(Void... values) {

    }

//    public DataOutputStream getDos()
//    {
//        return dos;
//    }
}