package bmi_basic.android.demo.com.bmi_basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends AppCompatActivity {
    EditText et1;
    EditText et2;
    Button btn;
    TextView tb1;
    TextView tb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        et1 = (EditText)findViewById(R.id.height);
        et2 = (EditText)findViewById(R.id.weight);
        btn = (Button)findViewById(R.id.submit);
        tb1 = (TextView)findViewById(R.id.result);
        tb2 = (TextView)findViewById(R.id.suggest);

    }

    public void onClick(View view) {
        Double h = Double.parseDouble(et1.getText().toString());
        Double w = Double.parseDouble(et2.getText().toString());
        Double t = (h/100)*(h/100);
        double tmp = w/t;
        String r = String.valueOf(tmp);
        tb1.setText("你的BMI值是"+r);

        if(tmp>24){
            tb2.setText("你的BMI超過24，要小心!");
        }
        if(tmp<18.5){
            tb2.setText("你的BMI少於18.5，要多吃!");
        }
        if(tmp>=18.5 && tmp<=24){
            tb2.setText("你的BMI值適中，繼續保持喔~");
        }



        }


        }


