package com.anntony.infoandroidprueba_1.Interactors;

import com.anntony.infoandroidprueba_1.Interfaces.MainInteractor;
import com.anntony.infoandroidprueba_1.Interfaces.MainPresenter;
import com.anntony.infoandroidprueba_1.Interfaces.OnNextSentenceListener;
import com.anntony.infoandroidprueba_1.Models.Model;

/**
 * Created by Antonio Facundo on 07/07/2017.
 */

public class MainInteractorImpl implements MainInteractor {

    private MainPresenter presenter;
    private int numberSentence;

    public MainInteractorImpl(MainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void nextSentenceInteractor(String sentenceResult) {

        Model model = Model.getModel();

        numberSentence = (int) ((Math.random()*10) + 1);
        sentenceResult = model.getSentences(numberSentence);

        presenter.setResult(sentenceResult);

    }


}
