package com.example.task14;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author		Noam Vaknin <noamvak765@gmail.com>
 * @version	1.6 (current version number of program) - I don't know exac what to do here
 * @since		21/8/2016 (the date of the package the class was added)
 *
 */

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    LinearLayout lL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lL=(LinearLayout)findViewById(R.id.lL);

    }



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String choice=item.getTitle().toString();
        if(choice.equals("Credit Activity")){
            Intent res=new Intent(this,CreditAct.class);
            startActivity(res);
        }

        return true;
    }

    /**
     * Only message. - opens an Alert Dialogue with a message
     *
     * @param view the view
     */
    public void onlyMessage(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("Alert 1");
        adb.setMessage("Hello");

        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * Msg and img. - opens an Alert Dialogue with a message and an Image
     *
     * @param view the view
     */
    public void Msg_And_Img(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("Alert 2");
        adb.setMessage("Hello");
        adb.setIcon(R.drawable.icon);

        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * Msg with btn and img. -  opens an Alert Dialogue with message button and Image
     *
     * @param view the view
     */
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

    /**
     * Color changer 1. - opens an Alert Dialogue with a button that change the screen to a random color
     *
     * @param view the view
     */
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

    /**
     * Color changer 2.- opens an Alert Dialogue with 3 buttons. one exits the Alert Dialogue
     * second resets the screen color back to white
     * third changes the screen to a random color
     *
     * @param view the view
     */
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