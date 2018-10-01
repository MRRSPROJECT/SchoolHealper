package com.example.mrrs.schoolhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    TextView tvEmail, tvPassword, tvForgotPassword, tvChangePassword ;
    Button btnLogin;
    EditText edtYouremail, edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Anhxa();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String email = edtYouremail.getText().toString().trim();
                edtYouremail.setText(email);
                edtYouremail.setText("");

                final String password = edtPassword.getText().toString().trim();
                edtPassword.setText(password);
                edtPassword.setText("");

                Toast.makeText(Login.this, "Messenger: " + email + " và " +     password, Toast.LENGTH_SHORT).show();
            }
        });

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "Vừa nhấn nút forgot password" , Toast.LENGTH_SHORT).show();
            }
        });

        tvChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "Vừa nhấn nút Change password" , Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void Anhxa() {
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvPassword = (TextView) findViewById(R.id.tvPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        edtYouremail = (EditText) findViewById(R.id.edtYouremail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
        tvChangePassword = (TextView) findViewById(R.id.tvChangePassword);

    }
}
