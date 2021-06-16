
package Part2Example;

import java.io.Serializable;


public class fav_Course implements Serializable{
    String name;
    String code;

    public fav_Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "fav_Course{" + "name=" + name + ", code=" + code + '}';
    }
    
    
}
