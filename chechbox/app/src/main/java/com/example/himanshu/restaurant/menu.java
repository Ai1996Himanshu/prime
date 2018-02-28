package com.example.himanshu.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2,ed3,ed4;
    TextView t1,t2,t3,t4;
    CheckBox c1,c2,c3,c4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        t1 =(TextView)findViewById(R.id.textView4);
        t2 =(TextView)findViewById(R.id.textView5);
        t3 =(TextView)findViewById(R.id.textView6);
        t4 =(TextView)findViewById(R.id.textView7);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        c2 = (CheckBox)findViewById(R.id.checkBox2);
        c3 = (CheckBox)findViewById(R.id.checkBox3);
        c4 = (CheckBox)findViewById(R.id.checkBox4);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        ed4 = (EditText)findViewById(R.id.editText4);

    }
    public void click(View v)
    {
        Intent i = new Intent(this,order.class);
        



    }
    public void click2(View v)
    {
        ed1.setText("0");
        ed2.setText("0");
        ed3.setText("0");
        ed4.setText("0");
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);


    }
}
