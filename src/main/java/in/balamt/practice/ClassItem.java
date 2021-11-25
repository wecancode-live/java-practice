package in.balamt.practice;

import java.io.Serializable;
import java.util.List;

public class ClassItem implements Serializable {

    private String root;
    private List<Category> categories;

    public ClassItem(String root, List<Category> categories){
        this.root = root;
        this.categories = categories;
    }

    public ClassItem(){

    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "ClassList{" +
                "root='" + root + '\'' +
                ", categories=" + categories.toString() +
                '}';
    }
}

