package com.example.user.find_price;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView simplebox = (TextView) findViewById(R.id.simpleBox);
        simplebox.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view) {
                                             Intent i = new Intent(MainActivity.this,SimpleBox.class);
                                             startActivity(i);
                                         }
                                     }
        );

    }
    /*public void xyz(View view)
    {
        Intent i = new Intent(MainActivity.this,SimpleBox.class);
        startActivity(i);
    }*/
}
