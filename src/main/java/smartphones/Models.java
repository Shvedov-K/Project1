package smartphones;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class Models {
    @Id
    public ObjectId _id;

    public  String  companyName;
    public String modelName;

    //Constructors

    public Models() {
    }

    public Models(ObjectId _id, String companyName, String modelName) {
        this._id = _id;
        this.companyName = companyName;
        this.modelName = modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String get_id() {
        return _id.toString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}