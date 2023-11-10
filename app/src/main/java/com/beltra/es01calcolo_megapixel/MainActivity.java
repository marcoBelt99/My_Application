package com.beltra.es01calcolo_megapixel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /** TODO: 1)
     *  Nel codice Java, i riferimenti agli elementi grafici vengono dichiarati come attributi
     *  privati della classe MainActivity */
    private EditText editAltezza, editLarghezza;
    private TextView txtRisultato;


    /** TODO: 2)
     *  Dentro l'onCreate() viene eseguito il metodo setContentView() per caricare l'interfaccia grafica
     *  descritta nel file di layout activity_main.xml
     *  Il riferimento al layout è indicato con il nome del file preceduto dalla notazione
     *  R.layout
     *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** TODO: 3)
         * Recupero i collegamenti con le componenti grafiche dichiarate nel layout.
         * Il metodo findViewById() cerca l'oggetto graifico il cui nome, indicato nel parametro, è
         * preceduto dalla notazione R.id
         * */
        editAltezza = (EditText) findViewById(R.id.editAltezza);
        editLarghezza = (EditText) findViewById(R.id.editLarghezza);
        txtRisultato = (TextView) findViewById(R.id.txtRisultato);

    }

    /** TODO: 4)
     *  Metodo che si scatena quando viene premuto il bottone
     *  Il risultato viene visualizzato nell'etichetta txtRisultato */
    public void calcolaRisultato(View view) {
        int altezza, larghezza, mp;

        /** TODO: 5)
         *  I valori inseriti dall'utente li leggo usando getText().toString() */
        altezza = Integer.parseInt(editAltezza.getText().toString());
        larghezza = Integer.parseInt(editLarghezza.getText().toString());

        /** TODO: 6)
         *  Il risultato è visualizzato nell'etichetta txtRisultato, utilizzando il
         *  metodo setText() */

        mp = (altezza * larghezza) / 1000000;
        txtRisultato.setText("" + mp + " Mp");
    }
}