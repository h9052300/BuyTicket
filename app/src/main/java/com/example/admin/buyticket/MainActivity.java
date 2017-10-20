package com.example.admin.buyticket;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        TextView txv = (TextView) findViewById(R.id.txv);
        RadioGroup ticketTpye = (RadioGroup) findViewById(R.id.tickeType);
        RadioGroup ticketNunber = (RadioGroup) findViewById(R.id.ticketNumber);

        /*switch (ticketTpye.getCheckedRadioButtonId()) {
            case R.id.adult:
                txv.setText("買全票");
                break;
            case R.id.child:
                txv.setText("買半票");
                break;
            case R.id.senior:
                txv.setText("買敬老票");
                break;
        }*/

        /*int id = ticketTpye.getCheckedRadioButtonId();
        RadioButton select = (RadioButton) findViewById(id);
        txv.setText("買"+select.getText()); //輸出選取項目的文字*/

        RadioButton type = (RadioButton) findViewById(ticketTpye.getCheckedRadioButtonId()); //票種 ; 用findViewById()找出ticketType中被選取的單選鈕
        RadioButton number = (RadioButton) findViewById(ticketNunber.getCheckedRadioButtonId()); //張數
        txv.setText("買" + type.getText() + " " + number.getText()); //以單選鈕的getText()取得其text屬性值
        txv.setTextColor(Color.BLUE);
    }
}
