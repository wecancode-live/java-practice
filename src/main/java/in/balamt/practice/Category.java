package in.balamt.practice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable {
    private String name;
    private Classes classes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Category(String name, Classes classes){
        this.name= name;
        this.classes = classes;
    }
    public Category(){}

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[ ");
//        classes.stream().forEach(val -> sb.append(val + " | "));
//        sb.append(" ]");
        return "Category{" +
                "name='" + name + '\'' +
                ", classes=" + classes.toString() +
                '}';
    }
}
