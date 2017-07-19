package com.myntra.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PdpActivity extends AppCompatActivity {

    private TextView mNameTV, mPriceTV, mDescriptionTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdp);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        String price = getIntent().getStringExtra("price");

        Log.d("checkName", name);
        Log.d("checkPrice", price);
        Log.d("checkDesc", description);

        mNameTV = (TextView)findViewById(R.id.nameTV);
        mPriceTV = (TextView)findViewById(R.id.priceTV);
        mDescriptionTV = (TextView)findViewById(R.id.descriptionTV);

        mNameTV.setText(name);
        mDescriptionTV.setText(description);
        mPriceTV.setText(price);

    }
}
