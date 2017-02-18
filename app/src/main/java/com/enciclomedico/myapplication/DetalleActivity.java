package com.enciclomedico.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by grupobecm13 on 17/02/2017.
 */

public class DetalleActivity extends AppCompatActivity{
    public static final String EXTRA_TEXTO="net.sgoliver.android.fragments.EXTRA_TEXTO";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        FragmentDetalle detalle =(FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
        detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));
    }
}
