package salt.movil.listacomida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String informacion = getIntent().getStringExtra("info");

        textView = (TextView) findViewById(R.id.txt_menu_activity);
        textView.setText(informacion);
    }
}
