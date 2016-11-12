package salt.movil.listacomida.utils;

import java.util.ArrayList;
import java.util.List;

import salt.movil.listacomida.models.ItemMenu;

/**
 * Created by Hamilton Urbano on 12/11/2016.
 */

public class Utils {

    private static List<ItemMenu> data;

    public static List<ItemMenu> getData(){
        if (data==null){
            data = new ArrayList<>();

            ItemMenu itemMenu1 = new ItemMenu();
            itemMenu1.setName("hamburguesa");
            itemMenu1.setPrice("$7000");
            itemMenu1.setPhoto("http://www.elcolombiano.com/documents/10157/0/580x383/0c9/580d365/none/11101/CBLU/image_content_26295584_20160621152304.jpg");

            ItemMenu itemMenu2 = new ItemMenu();
            itemMenu2.setName("Empanada");
            itemMenu2.setPrice("$3500");
            itemMenu2.setPhoto("https://http2.mlstatic.com/empanadas-de-hojaldre-con-lechona-S_449321-MCO20756482995_062016-M.jpg");

            data.add(itemMenu1);
            data.add(itemMenu2);
        }

        return data;
    }

}
