package salt.movil.listacomida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String informacion = getIntent().getStringExtra("info");

        textView = (TextView) findViewById(R.id.txt_menu_activity);
        textView.setText("Hola "+informacion);

        listView = (ListView) findViewById(R.id.list_items_menu);
    }
}
