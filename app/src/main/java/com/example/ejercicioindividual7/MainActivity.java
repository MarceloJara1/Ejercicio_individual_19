package com.example.ejercicioindividual7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ejercicioindividual7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ContractView {
    private ActivityMainBinding binding;
    private ContractPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presenter = new PasswordPresenter(this);
        binding.btnComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = binding.textField.getEditText().getText().toString();
                presenter.validarNivelContrasena(password);
            }
        });
    }

    @Override
    public void mostrarNivelContrasena(String strengthLevel, int colorResId) {
        binding.txtColor.setText(strengthLevel);
        binding.txtColor.setTextColor(getResources().getColor(colorResId));
    }

}