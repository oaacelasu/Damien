package com.oaacelasu.damien.login.presenter;

import com.oaacelasu.damien.login.interactor.LoginInteractor;
import com.oaacelasu.damien.login.interactor.LoginInteractorImpl;
import com.oaacelasu.damien.login.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String username, String password) {
        loginView.disableInputs();
        loginView.showpogressBar();
        interactor.signIn(username, password);
    }

    @Override
    public void loginSucces() {
        loginView.goToContainerActivity();

        loginView.hidePogressBar();
    }

    @Override
    public void loginError(String error) {
        loginView.enableImputs();
        loginView.hidePogressBar();
        loginView.loginError(error);

    }
}
