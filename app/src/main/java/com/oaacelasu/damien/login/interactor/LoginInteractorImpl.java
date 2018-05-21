package com.oaacelasu.damien.login.interactor;

import com.oaacelasu.damien.login.presenter.LoginPresenter;
import com.oaacelasu.damien.login.repository.LoginRepository;
import com.oaacelasu.damien.login.repository.LoginRepositoryImpl;

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter presenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);
    }

    @Override
    public void signIn(String username, String password) {
        repository.signIn(username, password);
    }
}
