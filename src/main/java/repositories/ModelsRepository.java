package repositories;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import smartphones.Models;

public interface ModelsRepository extends MongoRepository<Models, String> {
    Models findBy_id(ObjectId _id);
}
