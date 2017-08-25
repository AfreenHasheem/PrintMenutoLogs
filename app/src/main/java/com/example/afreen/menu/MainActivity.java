package com.example.afreen.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView textView1=(TextView) findViewById(R.id.menu_item_1);
        String menu_item_1=textView1.getText().toString();
        Log.d("Main Activity",menu_item_1);

        // Find second menu item TextView and print the text to the logs

        TextView textView2=(TextView) findViewById(R.id.menu_item_2);
        String menu_item_2=textView2.getText().toString();
        Log.d("Main Activity",menu_item_2);

        // Find third menu item TextView and print the text to the logs

        TextView textView3=(TextView) findViewById(R.id.menu_item_3);
        String menu_item_3=textView3.getText().toString();
        Log.d("Main Activity",menu_item_3);

    }
}