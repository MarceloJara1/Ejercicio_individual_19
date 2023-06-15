package com.example.ejercicioindividual7;

public class PasswordPresenter implements ContractPresenter {
    private ContractView view;

    public PasswordPresenter(ContractView view) {
        this.view = view;
    }

    @Override
    public void validarNivelContrasena(String password) {
        if (password.length()<5){
            view.mostrarNivelContrasena("Debil", android.R.color.holo_red_light);
        } else if (password.equals(password.toLowerCase())) {
            view.mostrarNivelContrasena("Regular", android.R.color.holo_orange_light);
        }else {
            view.mostrarNivelContrasena("Fuerte", android.R.color.holo_green_light);
        }
    }
}
