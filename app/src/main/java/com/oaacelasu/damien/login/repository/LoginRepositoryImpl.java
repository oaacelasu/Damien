package com.oaacelasu.damien.login.repository;

import com.oaacelasu.damien.login.presenter.LoginPresenter;

public class LoginRepositoryImpl implements LoginRepository {

    LoginPresenter presenter;


    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }


    @Override
    public void signIn(String username, String password) {
        boolean succes = false;
        if (succes){
            presenter.loginSucces();
        }else{
            presenter.loginError("Ocurrió un error");
        }

    }
}
