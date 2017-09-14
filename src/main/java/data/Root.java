package data;

import static dao.BranchDAO.loadBranch;
import static dao.BranchDAO.newBranch;

public class Root {

    public Branch load(String name) {
        return loadBranch(name);
    }

    public Branch add(String name) {
        return newBranch(name);
    }
}
