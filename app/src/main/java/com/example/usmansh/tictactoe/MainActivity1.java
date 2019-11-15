package com.example.usmansh.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends Activity {

    Button play1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        play1 = (Button)findViewById(R.id.play1);


        play1.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                Intent intt = new Intent (play1.getContext(),MainActivity2.class);
                startActivity(intt);

            }
        });
    }
}
