package in.balamt.practice;

import java.io.Serializable;
import java.util.List;

public class Classes implements Serializable {
    private List<String> classname;

    public Classes(List<String> classnames){
        this.classname = classnames;
    }

    public Classes() {}

    public List<String> getClassname() {
        return classname;
    }

    public void setClassname(List<String> classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classnames=" + classname +
                '}';
    }
}
