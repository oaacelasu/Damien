package com.oaacelasu.damien;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.oaacelasu.damien.view.ContainerActivity;
import com.oaacelasu.damien.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToGithub(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/oaacelasu"));
        startActivity(intent);

    }

    public void goToCreateAcoount(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goToContainerActivity(View view) {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
