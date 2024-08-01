package src.com.gen.io;

import src.com.gen.model.FamilyTree;

public interface FileHandler {
    void save(FamilyTree<?> familyTree, String fileName);
    FamilyTree<?> load(String fileName);
}