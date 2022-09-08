package com.akshara.teachingapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ImplicitIntentActivity extends AppCompatActivity {

    Button btnCamera, btnDialNumber,btnCreateDocument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        btnCamera = findViewById(R.id.btnCamera);
        btnDialNumber = findViewById(R.id.btnDialNumber);
        btnCreateDocument = findViewById(R.id.btnCreateDocument);


        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CAMERA_BUTTON);
                startActivity(intent);
            }
        });

        btnDialNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tel = "9806583297";
                Uri uri = Uri.parse("tel:9806583297");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

        btnCreateDocument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
                intent.setType("application/pdf");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent,100);
//                if(intent.resolveActivity(getPackageManager()) != null){
//                    startActivityForResult(intent,1);
//                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("PDF", "RequestCode ==> "+ requestCode);
        Log.d("PDF", "resultCode ==> "+ resultCode);
        Log.d("PDF", "data ==> "+ data);

    }
}