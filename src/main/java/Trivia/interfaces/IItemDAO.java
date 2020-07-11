package Trivia.interfaces;

import Trivia.entities.Item;

import java.util.List;

public interface IItemDAO {
    Item createItem(Item item);
    List<Item> getItems();
//    void deleteItem(Integer itemID);
    Item editItem(Integer itemID, Item item);
}
