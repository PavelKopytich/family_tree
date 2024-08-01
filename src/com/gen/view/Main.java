package src.com.gen.view;

import src.com.gen.model.FamilyTree;
import src.com.gen.model.Person;
import src.com.gen.presenter.FamilyTreePresenter;
import src.com.gen.model.FamilyTreeServiceImpl;
import src.com.gen.io.FileHandlerImpl;
import src.com.gen.view.FamilyTreeServiceView;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        FamilyTreeServiceImpl service = new FamilyTreeServiceImpl(familyTree, new FileHandlerImpl());
        FamilyTreeServiceView view = new FamilyTreeServiceView();
        FamilyTreePresenter presenter = new FamilyTreePresenter(service, view);

        view.setPresenter(presenter);
        view.start();
    }
}