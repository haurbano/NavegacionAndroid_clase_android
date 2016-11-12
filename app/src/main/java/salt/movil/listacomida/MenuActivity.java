package salt.movil.listacomida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import salt.movil.listacomida.adapters.AdapterItemsMenu;
import salt.movil.listacomida.models.ItemMenu;
import salt.movil.listacomida.utils.Utils;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

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

        AdapterItemsMenu adapter = new AdapterItemsMenu(Utils.getData(),this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("pos",position);
        startActivity(intent);
    }
}
