package edu.uaslp.objetos.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingItemCatalog {

    private final Map<String, ShoppingItem> catalog;

    public ShoppingItemCatalog(){
        catalog = new HashMap<>();
        buildCatalog();
    }

    private void buildCatalog() {
        catalog.put("ABC1000", new ShoppingItem("Escoba", "Articulo de limpieza para barrer", "ABC1000", 12000));
        catalog.put("ABC1001", new ShoppingItem("Recogedor", "Articulo de limpieza para recoger", "ABC1001", 9800));
        catalog.put("ABC1002", new ShoppingItem("Bolsas de basura", "Articulo de limpieza para guardar", "ABC1002", 35000));

        catalog.put("ABC2000", new ShoppingItem("Silla", "Articulo de mobiliario", "ABC2000", 158200));
        catalog.put("ABC2001", new ShoppingItem("Mesa", "Articulo de mobiliario", "ABC2001", 1435200));
        catalog.put("ABC2003", new ShoppingItem("Sala", "Articulo de mobiliario", "ABC2003", 3568100));

        catalog.put("ABC3000", new ShoppingItem("Mantel", "Articulo de adorno", "ABC3000", 34600));

        catalog.put("ABC4000", new ShoppingItem("Televisión", "Articulo de entretenimiento", "ABC4000", 1678200));
        catalog.put("ABC4001", new ShoppingItem("Home Theather", "Articulo de entretenimiento", "ABC4001", 846800));
        catalog.put("ABC4002", new ShoppingItem("Barra de sonido", "Articulo de entretenimiento", "ABC4002", 1125000));
    }

    public ShoppingItem getItem(String code){
        if(catalog.containsKey(code)){
            return catalog.get(code);
        }

        return null;
    }

}