package com.akshara.teachingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.akshara.teachingapp.model.Category;
import com.akshara.teachingapp.model.Product;

public class MainActivity extends AppCompatActivity implements Product.CartInterface {

    private Button btnLogin;
    private TextView tvSignup, tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSignup = findViewById(R.id.tvSignup);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Category cat = new Category();
        cat.setName("Mobile");
        cat.setDescription("This is some description");


        Product macbook =  new Product(
                "Apple Macbook",
                "https://techsathi.com/wp-content/uploads/2021/10/MacBook-Pro-2021-Price-in-Nepal.jpg",
                2000.50,
                1899.50,
                cat
        );

        macbook.setName("Apple Iphone");

        Log.d("sugam", macbook.name);
        Log.d("sugam", String.valueOf(macbook.getPrice()));
        Log.d("sugam", ""+macbook.getDiscounted_price());
        Log.d("sugam", ""+macbook.getCategory().getName());

    }

    @Override
    public void addToCart() {

    }

    @Override
    public void removeFromCart() {

    }
}