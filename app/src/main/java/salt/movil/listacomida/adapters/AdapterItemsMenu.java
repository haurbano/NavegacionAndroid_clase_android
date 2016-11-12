package salt.movil.listacomida.adapters;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import salt.movil.listacomida.R;
import salt.movil.listacomida.models.ItemMenu;

/**
 * Created by Hamilton Urbano on 12/11/2016.
 */

public class AdapterItemsMenu extends BaseAdapter {

    List<ItemMenu> data;
    Context context;

    public AdapterItemsMenu(List<ItemMenu> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.template_item_menu,null);

        TextView txtName = (TextView) v.findViewById(R.id.txt_name_item_menu);
        TextView txtPrice = (TextView) v.findViewById(R.id.txt_precio_item_menu);
        ImageView imageView = (ImageView) v.findViewById(R.id.image_item_menu);

        /*ItemMenu itemMenu = data.get(position);
        String name = itemMenu.getName();
        txtName.setText(name);*/

        txtName.setText(data.get(position).getName());
        txtPrice.setText(data.get(position).getPrice());

        Picasso.with(context)
                .load(data.get(position).getPhoto())
                .into(imageView);


        return v;
    }
}
