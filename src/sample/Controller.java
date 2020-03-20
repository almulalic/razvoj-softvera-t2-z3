package sample;

import java.awt.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.lang.String;
import java.lang.Character.*;

public class Controller {

    public TextField unos;
    public Label output;

    public String KapitalizirajNajvecuRijec(String recenica) {

        String[] arrString = recenica.split(" ");

        int najvecaDuzina=0,index=0;

        for (int i=0;i<arrString.length;i++) {
            if(arrString[i].length() > najvecaDuzina) {
                najvecaDuzina = arrString[i].length();
                index=i;
            }
        }

        arrString[index] = arrString[index].toUpperCase();

        return String.join(" ",arrString);
    }

    public void FiltrirajString() {
        output.setText(KapitalizirajNajvecuRijec(unos.getText()));
    }
}
