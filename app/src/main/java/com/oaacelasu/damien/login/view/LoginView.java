package com.oaacelasu.damien.login.view;

public interface LoginView {

    void enableImputs();
    void disableInputs();

    void showpogressBar();
    void hidePogressBar();

    void loginError(String Error);

    void goToCreateAcoount();
    void goToContainerActivity();
    void goToGithub();

}
