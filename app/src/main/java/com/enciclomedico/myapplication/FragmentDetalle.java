package com.enciclomedico.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by grupobecm13 on 17/02/2017.
 */

public class FragmentDetalle extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle,container,false);
    }
    public void mostrarDetalle(String texto){
        TextView txtDetalle=(TextView)getView().findViewById(R.id.TxtDetalle);
        txtDetalle.setText(texto);
    }
}
