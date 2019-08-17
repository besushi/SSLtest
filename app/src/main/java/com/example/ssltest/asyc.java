package com.example.ssltest;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class asyc extends AsyncTask<Void,Void,Void> {

    Context context;

    public asyc(Context context){
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }


    @Override
    protected Void doInBackground(Void... voids) {
        String url = "https://cywar.hackerusa.com/p1nn1n6h4ck3d";



        try {
            HttpsURLConnection client = (HttpsURLConnection) new
                    URL(url).openConnection();



            client.setRequestMethod("GET");


            Log.e("CODE", String.valueOf(client.getResponseCode()));

        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



           return null;
        }



    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
