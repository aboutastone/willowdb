package data;

import dao.BranchDAO;

import java.util.Collection;
import java.util.Map;

public class Branch {

    private Map<String,Fruit> fruits;

    public void save() {
        BranchDAO.saveBranch(this);
    }

    public void delete() {

    }

    public Collection<Fruit> get(String field) throws Exception {
        throw new Exception();
    }

    public void add(String field, Fruit fruit) {
        fruits.put(field,fruit);
    }

    public void remove(String field, Fruit fruit) {

    }
}
