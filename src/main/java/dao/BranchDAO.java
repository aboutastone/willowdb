package dao;

import data.Branch;

public class BranchDAO {
    public static Branch loadBranch(String name) {
        return new Branch();
    }

    public static Branch newBranch(String name) {
        return new Branch();
    }

    public static Branch saveBranch(Branch branch) {
        return branch;
    }
}
