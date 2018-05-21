package com.oaacelasu.damien.login.presenter;

public interface LoginPresenter {

    void signIn(String username, String password); //Interactor
    void loginSucces();
    void loginError(String error);


}
