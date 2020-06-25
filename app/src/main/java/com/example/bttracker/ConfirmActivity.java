package com.example.bttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {

  TextView accessData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
   // find the ID of the TextView on the layout
        accessData = (TextView)findViewById(R.id.textView2);

        // Extract the extras from Intent
        Bundle transferredData = getIntent().getExtras();
        // Extract data with the key "BT_data"
        String s = transferredData.getString("BT_data");
        // create the confirmation message
        String txt = "Your input body temperature is " + s;
        // show the confirmation message in the TextView
        accessData.setText(txt);
    }

    public void backToHome(View view) {
        Intent backHome = new Intent(this,MainActivity.class);
        startActivity(backHome);
    }
}
