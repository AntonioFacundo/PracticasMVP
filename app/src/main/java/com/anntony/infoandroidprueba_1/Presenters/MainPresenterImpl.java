package com.anntony.infoandroidprueba_1.Presenters;

import android.view.View;

import com.anntony.infoandroidprueba_1.Interactors.MainInteractorImpl;
import com.anntony.infoandroidprueba_1.Interfaces.MainInteractor;
import com.anntony.infoandroidprueba_1.Interfaces.MainPresenter;
import com.anntony.infoandroidprueba_1.Interfaces.MainView;
import com.anntony.infoandroidprueba_1.Interfaces.OnNextSentenceListener;


public class MainPresenterImpl implements MainPresenter, OnNextSentenceListener {

    private MainView view;
    private MainInteractor interactor;

    public MainPresenterImpl(MainView view) {
        this.view = view;
        interactor = new MainInteractorImpl(this);
    }

    @Override
    public void nextSentence(String sentence) {

        interactor.nextSentenceInteractor(sentence);

    }

    @Override
    public void next() {

    }

    @Override
    public void setResult(String sentence) {
        view.nextSentence(sentence);
    }

    @Override
    public void showsnackbar(String name) {
        if(view != null)
            view.showSnackbar((View) view, name);
    }




}
