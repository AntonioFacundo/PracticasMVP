package com.anntony.infoandroidprueba_1.Views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.anntony.infoandroidprueba_1.Interfaces.MainPresenter;
import com.anntony.infoandroidprueba_1.Interfaces.MainView;
import com.anntony.infoandroidprueba_1.Presenters.MainPresenterImpl;
import com.anntony.infoandroidprueba_1.R;

public class MainActivity extends AppCompatActivity  implements MainView{

    //Crear el objeto con la interfaz
    private MainPresenter presenter;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Inicializar el presenter con la implementación
        presenter = new MainPresenterImpl(this);

        textView = (TextView) findViewById(R.id.sentenceText);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cuando se preciona un boton se manda a llamar un metodo del presentador
                presenter.nextSentence("Esto no deberia aparecer");
            }
        });
    }


    @Override
    public void showSnackbar(View view, String name) {
        Snackbar.make(view, name, Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();
    }


    @Override
    public void nextSentence(String sentence) {
        textView.setText(sentence);
    }


}
