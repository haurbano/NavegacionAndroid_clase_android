package salt.movil.listacomida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_menu);
        button.setOnClickListener(this);

        editText = (EditText) findViewById(R.id.edit_texto_trans);
    }

    @Override
    public void onClick(View v) {
        String texto = editText.getText().toString();

        Intent intentToMenu = new Intent(this,MenuActivity.class);
        intentToMenu.putExtra("info",texto);
        startActivity(intentToMenu);
    }
}
