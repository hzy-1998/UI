package com.example.hzy.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.graphics.Color;
import android.widget.TableLayout;

public class Alertdialog1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_alertdialog1);

        customView();

    }

    public void customView(){

        TableLayout loginForm=(TableLayout)getLayoutInflater()

                .inflate(R.layout.activity_alertdialog1,null);

        AlertDialog dialog=new AlertDialog.Builder(this)

               // .setTitle("AndroidApp")

                .setView(loginForm)

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialogInterface, int i) {





                    }





                })

                .setPositiveButton("sign in", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialogInterface, int i) {





                    }

                })

                .create();



        dialog.show();

        dialog.getButton(dialog.BUTTON_POSITIVE).setTextColor(Color.BLUE);

       // dialog.getButton(dialog.BUTTON_NEGATIVE).setTextColor(Color.BLUE);



    }

}


