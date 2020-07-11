package Trivia.data;

import Trivia.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import Trivia.interfaces.IItemDAO;
import Trivia.interfaces.IItemRepo;

import java.util.List;

@Component
public class ItemDAO implements IItemDAO {
    @Autowired
    private IItemRepo repo;


    @Override
    public Item createItem(Item item) {
        return repo.save(item);
    }

    @Override
    public List<Item> getItems() {
        return repo.findAll();
    }

//    @Override
//    public void deleteItem(Integer itemID) {
//    }

    @Override
    public Item editItem(Integer itemID, Item item) {
        return repo.save(item);
    }
}
