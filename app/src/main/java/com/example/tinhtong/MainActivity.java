package com.example.tinhtong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText hesoa,hesob;
Button btntong;
TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hesoa=findViewById(R.id.hesoa);
        hesob=findViewById(R.id.hesob);
        btntong=findViewById(R.id.btntong);
        kq=findViewById(R.id.txtkq);

        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hsa=Integer.parseInt(hesoa.getText().toString());
                int hsb=Integer.parseInt(hesob.getText().toString());
                int tong=hsa+hsb;
                kq.setText("Tổng:"+tong);

            }
        });
    }
}
