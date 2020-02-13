package com.wisermark.tuedolist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int duration = Toast.LENGTH_SHORT;
    String empty ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout list2 =findViewById(R.id.list2);

        list2.setOnTouchListener(new com.wisermark.tuedolist.OnSwipeTouchListener(MainActivity.this){
            public void onSwipeLeft() {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, empty, duration);
                toast.setText("user swiped left");
                toast.show();

                Intent listItems = new Intent(getApplicationContext(), ListItems.class);
                startActivity(listItems);

            }
        });
    }

    public void changeTueDoListName(View view){
        TextView list1 =findViewById(R.id.nameOfList1);
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, empty, duration);

        EditText userInput =findViewById(R.id.userInput);
        String insertedText =userInput.getText().toString();

        if( insertedText != "" ){
            list1.setText(insertedText);
            toast.setText("New TueDo List added!");
            toast.show();
        }

    }
}
