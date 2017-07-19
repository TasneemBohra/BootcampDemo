package com.myntra.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mNameET;
    private EditText mPriceET;
    private EditText mDescriptionET;
    private Button mGoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameET = (EditText)findViewById(R.id.nameET);
        mPriceET = (EditText)findViewById(R.id.priceET);
        mDescriptionET = (EditText)findViewById(R.id.descriptionET);
        mGoButton = (Button)findViewById(R.id.goButton);

        mGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PdpActivity.class);
                intent.putExtra("price", mPriceET.getText().toString());
                intent.putExtra("name", mNameET.getText().toString());
                intent.putExtra("description", mDescriptionET.getText().toString());
                startActivity(intent);
            }
        });

    }
}
