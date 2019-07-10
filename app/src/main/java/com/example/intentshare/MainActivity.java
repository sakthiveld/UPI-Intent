package com.example.intentshare;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    String UPI = "upi://pay?pa=raj2red@okicici&pn="+" "+"&am=200";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(UPI));
                Intent chooser = Intent.createChooser(intent, "Pay with...");
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
                {
                    startActivityForResult(chooser, 1, null);
                }
                /*upi://pay?pa=raj2red@okicici&pn=Rajiv Reddy&am=200&aid=uGICAgIDIoNv6Wg*/
            }
        });
    }
}
