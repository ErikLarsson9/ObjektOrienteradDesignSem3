package se.kth.processSale.integration;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemDTOTest {


    @Test
    public void toStringTest() throws Exception {
        ItemDTO item= new ItemDTO("abc", 200, "A piece of cake");
        String itemAsString = item.toString();
        boolean result = itemAsString.equals("Item identifier: " + item.getIdentifier() + ", "
                +"Description: " + item.getItemDescription() + ", "+
                "Price: " + item.getPrice()+ " ");
        boolean expectedResult = true;
        assertEquals("toString method doesn't produce expected string", expectedResult, result);
    }

}