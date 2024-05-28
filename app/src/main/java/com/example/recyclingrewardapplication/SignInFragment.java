package com.example.recyclingrewardapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignInFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_fragment);
    }
    public void onClickSignIn(View v){
        Toast.makeText(this, "Your account has been created successfully", Toast.LENGTH_LONG).show();
    }
    public void onBackButtonClick(View view) {
        onBackPressed();
    }
}