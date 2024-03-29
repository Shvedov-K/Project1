package RestController;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.*;
import smartphones.Models;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/models")
public class ModelsController {
    @Autowired
    private MongoRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Models> getAllModels() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Models getModelById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyModelById(@PathVariable("id") ObjectId id, @Valid @RequestBody Models models) {
        models.set_id(id);
        repository.save(models);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Models createModel(@Valid @RequestBody Models models) {
        models.set_id(ObjectId.get());
        repository.save(models);
        return models;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteModel(@PathVariable ObjectId id) {
        repository.delete(repository.findById(id));
    }
}
