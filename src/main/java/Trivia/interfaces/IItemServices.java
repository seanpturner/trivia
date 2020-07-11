package Trivia.interfaces;

import org.springframework.stereotype.Component;
import Trivia.entities.Item;
import java.util.List;

@Component
public interface IItemServices {
    Item createItem(Item item);
    List<Item> getItems();
//    void deleteItem(Integer itemID);
    Item editItem(Integer itemID, Item item);
}
