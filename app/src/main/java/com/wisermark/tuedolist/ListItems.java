package com.wisermark.tuedolist;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
    }

    public void addListItem(View view) {

        EditText userInput = findViewById(R.id.userInputListItem);
        String userItem =  userInput.getText().toString();

        if( !userItem.isEmpty()){
            LinearLayout layout1 =findViewById(R.id.layoutForListItem1);
            int visibility = layout1.getVisibility();

            if( visibility == View.INVISIBLE ){
                TextView item = findViewById(R.id.listItem1);
                item.setText( userItem );
                layout1.setVisibility(View.VISIBLE);
            } else {
                LinearLayout layout2 =findViewById(R.id.layoutForListItem2);
                visibility = layout2.getVisibility();
                if( visibility == View.INVISIBLE ){
                    TextView item = findViewById(R.id.listItem2);
                    item.setText( userItem );
                    layout2.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "Sorry can't add more items!", Toast.LENGTH_SHORT).show();
                }
            }
            userInput.setText("");
        } else {
            Toast.makeText(getApplicationContext(), "Did you forget to insert an item?", Toast.LENGTH_SHORT).show();
        }

    }

    public void hideItem(View view) {
        View v = ((View)view.getParent());
        v.setVisibility(View.INVISIBLE);
    }

}
