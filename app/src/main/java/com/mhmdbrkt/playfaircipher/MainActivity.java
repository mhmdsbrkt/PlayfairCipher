package com.mhmdbrkt.playfaircipher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button englishStart = (Button) findViewById(R.id.englishBTN);
        final Button arabicStart = (Button) findViewById(R.id.arabicBTN);
        final Button mixStart = (Button) findViewById(R.id.mixBTN);
        final Button customStart = (Button) findViewById(R.id.customBTN);


        englishStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PlayfairActivity.class);
                i.putExtra("Alphabets", "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
                i.putExtra("col", (6));
                i.putExtra("row", (6));
                i.putExtra("Size", (36));
                i.putExtra("fLetter", 'X');

                startActivity(i);

            }
        });


        arabicStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PlayfairActivity.class);
                i.putExtra("Alphabets", "اأإءآىبپتةثجچحخدذرزسشصضطظعغفڤقكلمنهوؤيئ٠١٢٣٤٥٦٧٨٩");
                i.putExtra("col", (7));
                i.putExtra("row", (7));
                i.putExtra("Size", (49));
                i.putExtra("fLetter", 'ظ');

                startActivity(i);

            }
        });


        mixStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PlayfairActivity.class);
                i.putExtra("Alphabets", "ABCDEFGHIJKLMNOPQRSTUVWXYZابتثجحخدذرزسشصضطظعغفقكلمنهوي0123456789");
                i.putExtra("col", (8));
                i.putExtra("row", (8));
                i.putExtra("Size", (64));
                i.putExtra("fLetter", 'Z');

                startActivity(i);

            }
        });

        customStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CustomActivity.class);
                startActivity(i);

            }
        });
    }
}
