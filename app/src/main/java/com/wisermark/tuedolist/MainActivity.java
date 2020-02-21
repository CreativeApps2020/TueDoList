package com.wisermark.tuedolist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout listBreakfast =findViewById(R.id.listBreakfast);

        listBreakfast.setOnTouchListener(new com.wisermark.tuedolist.OnSwipeTouchListener(MainActivity.this){
            public void onSwipeLeft() {
                Toast.makeText(getApplicationContext(), "User swiped left", Toast.LENGTH_SHORT).show();

                Intent listItems = new Intent(getApplicationContext(), ListItems.class);
                startActivity(listItems);

            }
        });
    }

}
