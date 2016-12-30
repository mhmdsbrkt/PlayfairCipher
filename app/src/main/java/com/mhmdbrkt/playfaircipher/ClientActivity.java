package com.mhmdbrkt.playfaircipher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        final EditText editTextAddress = (EditText) findViewById(R.id.addressEditText);
        final EditText  editTextPort = (EditText) findViewById(R.id.portEditText);
        final Button buttonConnect = (Button) findViewById(R.id.connectButton);
        final Button  startBTN = (Button) findViewById(R.id.clearButton);
        final TextView response = (TextView) findViewById(R.id.responseTextView);

        buttonConnect.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Client myClient = new Client(editTextAddress.getText().toString(), Integer.parseInt(editTextPort.getText().toString()), response);
                myClient.execute();
            }
        });

        startBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                response.setText("");
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
