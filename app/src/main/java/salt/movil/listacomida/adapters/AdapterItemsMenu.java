package salt.movil.listacomida.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import salt.movil.listacomida.R;
import salt.movil.listacomida.models.ItemMenu;

/**
 * Created by Hamilton Urbano on 12/11/2016.
 */

public class AdapterItemsMenu extends BaseAdapter {

    List<ItemMenu> data;
    Context context;

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
        return null;
    }
}
