package com.oaacelasu.damien.login.view;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.oaacelasu.damien.R;
import com.oaacelasu.damien.login.presenter.LoginPresenter;
import com.oaacelasu.damien.login.presenter.LoginPresenterImpl;
import com.oaacelasu.damien.view.ContainerActivity;
import com.oaacelasu.damien.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private TextInputEditText username, password;
    private Button login;
    private ProgressBar progressBarLogin;
    private LoginPresenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (TextInputEditText) findViewById(R.id.username);
        password = (TextInputEditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        progressBarLogin= (ProgressBar) findViewById(R.id.progressBarLogin);

        enableImputs();
        hidePogressBar();
        presenter = new LoginPresenterImpl(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.signIn(username.getText().toString(), password.getText().toString());
            }
        });

    }


    @Override
    public void enableImputs() {
        username.setEnabled(true);
        password.setEnabled(true);
        login.setEnabled(true);

    }

    @Override
    public void disableInputs() {
        username.setEnabled(false);
        password.setEnabled(false);
        login.setEnabled(false);
    }

    @Override
    public void showpogressBar() {
        progressBarLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePogressBar() {
        progressBarLogin.setVisibility(View.GONE);
    }

    @Override
    public void loginError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void goToCreateAcoount() {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    @Override
    public void goToContainerActivity() {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    @Override
    public void goToGithub() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/oaacelasu"));
        startActivity(intent);
    }

    public void goToCreateAccount(View view) {
        this.goToCreateAcoount();
    }

    public void goToGithub(View view) {
        goToGithub();
    }

    public void goToContainerActivity(View view) {
        goToContainerActivity();
    }
}
