package edu.uaslp.objetos.shoppingcart;

import java.util.*;
import java.util.HashMap;


public class ShoppingCart {
    private final Map<String, Integer> items = new HashMap<>();
    private final ShoppingItemCatalog catalog;

    public ShoppingCart(ShoppingItemCatalog catalog) {
        this.catalog = catalog;
    }

    public void add(String itemId) {
        if (items.containsKey(itemId)) {
            items.put(itemId, items.get(itemId) + 1);
        } else {
            items.put(itemId, 1);
        }
    }

    public int getTotalCostInCents() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String itemId = entry.getKey();
            int quantity = entry.getValue();
            ShoppingItem item = catalog.getItem(itemId);
            total += item.getUnitCostInCents() * quantity;
        }
        return total;
    }

    public int getDistinctItemsCount() {
        return items.size();
    }

    public int getTotalItemsCount() {
        int total = 0;
        for (int quantity : items.values()) {
            total += quantity;
        }
        return total;
    }

    public List<ShoppingItem> getItems() {
        List<ShoppingItem> itemList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String itemId = entry.getKey();
            int quantity = entry.getValue();
            for (int i = 0; i < quantity; i++) {
                itemList.add(catalog.getItem(itemId));
            }
        }
        return itemList;
    }

    public Collection<ShoppingItem> getDistinctItems() {
        Set<ShoppingItem> itemSet = new HashSet<>();
        for (String itemId : items.keySet()) {
            itemSet.add(catalog.getItem(itemId));
        }
        return itemSet;
    }
}