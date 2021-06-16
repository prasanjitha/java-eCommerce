package com.example.e_commerce;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerce.buyer.buyerHome;
import com.example.e_commerce.store.storeHome;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button =findViewById(R.id.button);
        button1 =findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openStore();

            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openBuyer();
            }
        });

    }
    public void openLogin(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openStore(){
        Intent intent=new Intent(this, storeHome.class);
        startActivity(intent);
    }
    public void openBuyer(){
        Intent intent=new Intent(this, buyerHome.class);
        startActivity(intent);
    }
}
