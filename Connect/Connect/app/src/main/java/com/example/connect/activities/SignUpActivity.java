package com.example.connect.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.connect.R;
import com.example.connect.utilities.Constants;
import com.example.connect.utilities.PreferenceManager;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class SignUpActivity extends AppCompatActivity {

    private EditText inputFirstName, inputLastName, inputEmail, inputPassword, inputConfirmPassword;
    private MaterialButton buttonSignUp;
    private ProgressBar signUpProgressBar;
    private PreferenceManager preferenceManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        preferenceManager = new PreferenceManager(getApplicationContext());

        findViewById(R.id.imageBack).setOnClickListener(view -> onBackPressed());
        findViewById(R.id.textSignIn).setOnClickListener(view -> onBackPressed());

        inputFirstName = findViewById(R.id.inputFirstName);
        inputLastName = findViewById(R.id.inputLastName);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmPassword = findViewById(R.id.inputConfirmPassword);
        buttonSignUp = findViewById(R.id.buttonSignUp);
        signUpProgressBar = findViewById(R.id.signUpProgressBar);

        buttonSignUp.setOnClickListener(view -> {
            if (inputFirstName.getText().toString().trim().isEmpty()){
                Toast.makeText(com.example.connect.activities.SignUpActivity.this,"Enter First Name", Toast.LENGTH_SHORT).show();
            }else if(inputLastName.getText().toString().trim().isEmpty()){
                Toast.makeText(com.example.connect.activities.SignUpActivity.this,"Enter Last Name", Toast.LENGTH_SHORT).show();
            }else if(inputEmail.getText().toString().trim().isEmpty()){
                Toast.makeText(com.example.connect.activities.SignUpActivity.this,"Enter Email Address", Toast.LENGTH_SHORT).show();
            }else if(!Patterns.EMAIL_ADDRESS.matcher(inputEmail.getText().toString()).matches()){
                Toast.makeText(com.example.connect.activities.SignUpActivity.this,"Enter Valid Email Address", Toast.LENGTH_SHORT).show();
            }else if(inputPassword.getText().toString().trim().isEmpty()){
                Toast.makeText(com.example.connect.activities.SignUpActivity.this,"Enter Password", Toast.LENGTH_SHORT).show();
            }else if(inputConfirmPassword.getText().toString().trim().isEmpty()){
                Toast.makeText(com.example.connect.activities.SignUpActivity.this,"Confirm Your Password", Toast.LENGTH_SHORT).show();
            }else if(!inputPassword.getText().toString().equals(inputConfirmPassword.getText().toString())){
                Toast.makeText(com.example.connect.activities.SignUpActivity.this,"Password is not matching", Toast.LENGTH_SHORT).show();
            }else{
                signup();
            }
        });
    }

    private void signup(){
        buttonSignUp.setVisibility(View.INVISIBLE);
        signUpProgressBar.setVisibility(View.VISIBLE);

        FirebaseFirestore database = FirebaseFirestore.getInstance();
        HashMap<String,Object> user = new HashMap<>();
        user.put(Constants.KEY_FIRST_NAME, inputFirstName.getText().toString());
        user.put(Constants.KEY_LAST_NAME,inputLastName.getText().toString());
        user.put(Constants.KEY_EMAIL,inputEmail.getText().toString());
        user.put(Constants.KEY_PASSWORD,inputPassword.getText().toString());

        database.collection(Constants.KEY_COLLECTION_USERS)
                .add(user)
                .addOnSuccessListener(documentReference -> {
                    preferenceManager.putBoolean(Constants.KEY_IS_SIGNED_IN, true);
                    preferenceManager.putString(Constants.KEY_USER_ID, documentReference.getId());
                    preferenceManager.putString(Constants.KEY_FIRST_NAME, inputFirstName.getText().toString());
                    preferenceManager.putString(Constants.KEY_LAST_NAME, inputLastName.getText().toString());
                    preferenceManager.putString(Constants.KEY_EMAIL, inputEmail.getText().toString());
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                })
                .addOnFailureListener(e -> {
                    signUpProgressBar.setVisibility(View.INVISIBLE);
                    buttonSignUp.setVisibility(View.VISIBLE);
                    Toast.makeText(com.example.connect.activities.SignUpActivity.this, "Error: " +e.getMessage(), Toast.LENGTH_SHORT).show();
                });

    }

}