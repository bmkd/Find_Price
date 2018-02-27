package com.example.user.find_price;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.find_price.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SimpleBox extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplebox);
      /*  Button btn_calculate=(Button) findViewById(R.id.btn_calculate);
       btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et=(EditText) findViewById(R.id.Length);
                double length= Double.parseDouble(et.getText().toString());
                EditText et1=(EditText) findViewById(R.id.Width);
                double width= Double.parseDouble(et1.getText().toString());
                EditText et2=(EditText) findViewById(R.id.Height);
                double height= Double.parseDouble(et2.getText().toString());
                EditText et3=(EditText) findViewById(R.id.cubefeet);
                double Cf= Double.parseDouble(et3.getText().toString());
                TextView totalPrice = (TextView) findViewById(R.id.total_price);
                double price=((length*width+height*width+height*length)*(Cf))/864;
                NumberFormat numberFormat;
                numberFormat = new DecimalFormat("0.000");

                totalPrice.setText((""+numberFormat.format(price)));
            }
        });*/
    }


    public void calculatePrice(View view)
    {
        EditText et=(EditText) findViewById(R.id.Length);
        double length= Double.parseDouble(et.getText().toString());
        EditText et1=(EditText) findViewById(R.id.Width);
        double width= Double.parseDouble(et1.getText().toString());
        EditText et2=(EditText) findViewById(R.id.Height);
        double height= Double.parseDouble(et2.getText().toString());
        EditText et3=(EditText) findViewById(R.id.cubefeet);
        double Cf= Double.parseDouble(et3.getText().toString());
        TextView totalPrice = (TextView) findViewById(R.id.total_price);
        double price=((length*width+height*width+height*length)*(Cf))/864;
        NumberFormat numberFormat;
        numberFormat = new DecimalFormat("0.00");

        totalPrice.setText(""+numberFormat.format(price)+" ₹");
    }


}
