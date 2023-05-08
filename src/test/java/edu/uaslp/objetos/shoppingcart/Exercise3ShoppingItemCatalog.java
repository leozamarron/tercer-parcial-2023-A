package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Exercise3ShoppingItemCatalog {



    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        ShoppingItem expectedItem = new ShoppingItem("Escoba", "Articulo de limpieza para barrer", "ABC1000", 12000);
        ShoppingItem actualItem = ShoppingItemCatalog.getItem("ABC1000");

        assertEquals(expectedItem.getName(), actualItem.getName());
        assertEquals(expectedItem.getDescription(), actualItem.getDescription());
        assertEquals(expectedItem.getCode(), actualItem.getCode());
        assertEquals(expectedItem.getUnitCostInCents(), actualItem.getUnitCostInCents());
    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        ShoppingItem actualItem = ShoppingItemCatalog.getItem("NonexistentItemCode");

        assertNull(actualItem);

    }
}