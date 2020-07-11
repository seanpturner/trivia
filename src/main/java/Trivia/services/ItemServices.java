package Trivia.services;

import Trivia.interfaces.IItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Trivia.entities.Item;
import Trivia.interfaces.IItemServices;

import java.util.List;

@Service
public class ItemServices implements IItemServices {

    @Autowired
    private IItemDAO itemDAO;

    @Override
    public Item createItem(Item item) {
        return itemDAO.createItem(item);
    }

    @Override
    public List<Item> getItems() {
        return itemDAO.getItems();
    }

//    @Override
//    public void deleteItem(Integer itemID) {
//        itemDAO.deleteItem(itemID);
//    }

    @Override
    public Item editItem(Integer itemID, Item item) {
        return itemDAO.editItem(itemID, item);
    }
}


