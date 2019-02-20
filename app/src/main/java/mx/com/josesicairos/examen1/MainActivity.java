package mx.com.josesicairos.examen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTextView1;
    TextView txtTextView2;
    TextView txtTextView3;
    TextView txtTextView4;
    TextView txtTextView5;
    TextView txtTextView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTextView1 = (TextView) findViewById(R.id.textView);
        txtTextView2 = (TextView) findViewById(R.id.textView2);
        txtTextView3 = (TextView) findViewById(R.id.textView3);
        txtTextView4 = (TextView) findViewById(R.id.textView4);
        txtTextView5 = (TextView) findViewById(R.id.textView5);
        txtTextView6 = (TextView) findViewById(R.id.textView6);

        txtTextView1.setText("Alita: Battle Angel");
        txtTextView2.setText("Mujer con ojo saltones, hecha por computadora, busca su origen.");
        txtTextView3.setText("Glass");
        txtTextView4.setText("3 superhumanos se encuentran en un manicomio pero 2 de ellos causan problemas.");
        txtTextView5.setText("The Lego Movie 2: The Second Part");
        txtTextView6.setText("legos, también animados por computadora, se aventuran en una una aventura.");



    }
}
