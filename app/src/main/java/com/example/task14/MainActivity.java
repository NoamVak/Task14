package com.example.task14;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
AlertDialog.Builder adb;
LinearLayout lL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lL=(LinearLayout)findViewById(R.id.lL);

    }

    public void onlyMessage(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("Alert 1");
        adb.setMessage("Hello");

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void Msg_And_Img(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("Alert 2");
        adb.setMessage("Hello");
        adb.setIcon(R.drawable.icon);

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void msg_with_btn_AndImg(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("Alert 3");
        adb.setMessage("Hello");
        adb.setIcon(R.drawable.icon);
        adb.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void colorChanger1(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("Alert 3");
        adb.setMessage("Color Changer");
        adb.setPositiveButton("Rndm color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                lL.setBackgroundColor(color);
            }
        });
        adb.setNeutralButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void colorChanger2(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("Alert 3");
        adb.setMessage("Color Changer");
        adb.setPositiveButton("Rndm color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                lL.setBackgroundColor(color);
            }
        });
        adb.setNeutralButton("Bck to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                lL.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad=adb.create();
        ad.show();

    }
}