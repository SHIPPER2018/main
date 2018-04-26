package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ShipperOrCarrierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipper_or_carrier);

        ImageButton shipperButton = (ImageButton) findViewById(R.id.shipperButton);
        shipperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentIsAShipper = new Intent(ShipperOrCarrierActivity.this , ShippCat.class);
                startActivity(intentIsAShipper);
            }

        });

        ImageButton carrierButton = (ImageButton) findViewById(R.id.carrierButton);
        carrierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentIsACarrier = new Intent(ShipperOrCarrierActivity.this , CarrLogSignIn.class);
                startActivity(intentIsACarrier);
            }

        });
    }
}
