package com.anntony.infoandroidprueba_1.Models;

/**
 * Created by Antonio Facundo on 07/07/2017.
 */

public class Model {

    private static Model myModel = getModel();

    private static Model getMyModel;

    public static Model getModel (){
        getMyModel = new Model();
        return getMyModel;
    }

    String sentences;

    public String getSentences(int i){
        switch (i){
            case 1:
                return "Frase 1";

            case 2:
                return "Frase 2";

            case 3:
                return "Frase 3";

            case 4:
                return "Frase 4";

            case 5:
                return "Frase 5";

            case 6:
                return "Frase 6";

            case 7:
                return "Frase 7";

            case 8:
                return "Frase 8";

            case 9:
                return "Frase 9";

            case 10:
                return "Frase 10";

            default:
                return "Esto no debería aparecer nunca.";
        }
    }


}
