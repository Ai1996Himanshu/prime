package com.example.himanshu.primeno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText ed;
    TextView t;
    int i, m, n, flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        ed = (EditText) findViewById(R.id.editText);
        t = (TextView) findViewById(R.id.textView);

    }

    public void prime(View V) {
        String r = ed.getText().toString();
        n = Integer.parseInt(r);
        int i;
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                t.setText("Number is not prime");
                break;
            }
            else
                continue;
        }
        if(i>Math.sqrt(n))
            t.setText("Number is prime");

    }
}
