package com.example.ssltest;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1,btn2;
    EditText editText;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context =this;
        setPointer();
    }

    private void setPointer() {
        btn = findViewById(R.id.btn);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        editText =findViewById(R.id.edittext);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             new asyc(context).execute();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(editText.getText().toString().equals("p1nn1n6h4ck3d")) {
                   Toast.makeText(context, "You are right!!", Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(context, "Try again", Toast.LENGTH_SHORT).show();
               }
           }
       });

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               new AlertDialog.Builder(context)
                       .setTitle("Hint")
                       .setMessage("The goal in this challenge is to intercept the traffic that are encrypted with ssl and uses pinning. \n" +
                               "Hint: Make it use your own certificate.")

                       // Specifying a listener allows you to take an action before dismissing the dialog.
                       // The dialog is automatically dismissed when a dialog button is clicked.
                       .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                           public void onClick(DialogInterface dialog, int which) {

                           }
                       })
                       .setIcon(android.R.drawable.ic_menu_help)
                       .show();
           }
       });

    }
}
