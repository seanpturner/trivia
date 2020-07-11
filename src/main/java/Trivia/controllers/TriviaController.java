package Trivia.controllers;

import Trivia.entities.Trivia;
import Trivia.interfaces.ITriviaServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/trivia")
public class TriviaController {
    @Autowired
    private ITriviaServices questionServices;

    @CrossOrigin(origins="*")
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation("Posts a new trivia")
    public ResponseEntity<Trivia> createQuestion(@RequestBody Trivia trivia) {
        return new ResponseEntity<>(questionServices.createQuestion(trivia), HttpStatus.CREATED);
    }

    @CrossOrigin(origins="*")
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation("Gets all Questions")
    public ResponseEntity<List<Trivia>>getQuestions() {
        return new ResponseEntity<>(questionServices.getQuestions(), HttpStatus.OK);
    }

    @CrossOrigin(origins="*")
    @RequestMapping(value = "/{ID}", method = RequestMethod.PUT)
    @ApiOperation("Updates a trivia by ID")
    public ResponseEntity<Trivia>updateQuestion(@PathVariable Integer ID, @RequestBody Trivia trivia) {
        return new ResponseEntity<>(questionServices.editQuestion(ID, trivia), HttpStatus.OK);
    }

}





