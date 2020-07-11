package Trivia.controllers;

import Trivia.entities.Item;
import Trivia.interfaces.IItemServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/trivia")
public class ItemController {
    @Autowired
    private IItemServices itemServices;

    @CrossOrigin(origins="http://localhost:8080")
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation("Posts a new question")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemServices.createItem(item), HttpStatus.CREATED);
    }

    @CrossOrigin(origins="*")
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation("Gets all Questions")
    public ResponseEntity<List<Item>>getItems() {
        return new ResponseEntity<>(itemServices.getItems(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{ID}", method = RequestMethod.PUT)
    @ApiOperation("Updates a question by ID")
    public ResponseEntity<Item>updateItem(@PathVariable Integer ID, @RequestBody Item item) {
        return new ResponseEntity<>(itemServices.editItem(ID, item), HttpStatus.OK);
    }

}





