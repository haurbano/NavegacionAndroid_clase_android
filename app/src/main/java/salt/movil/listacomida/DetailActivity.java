package salt.movil.listacomida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import salt.movil.listacomida.models.ItemMenu;
import salt.movil.listacomida.utils.Utils;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView txtName, txtPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtName = (TextView) findViewById(R.id.txt_name_detail);
        txtPrice = (TextView) findViewById(R.id.txt_price_detail);
        imageView = (ImageView) findViewById(R.id.ima_detail);

        int position = getIntent().getIntExtra("pos",0);
        showData(position);
    }

    private void showData(int pos){
        ItemMenu itemMenu = Utils.getData().get(pos);
        txtName.setText(itemMenu.getName());
        txtPrice.setText(itemMenu.getPrice());
        Picasso.with(this).load(itemMenu.getPhoto()).into(imageView);
    }
}
