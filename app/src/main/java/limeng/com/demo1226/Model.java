package limeng.com.demo1226;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class Model implements Serializable{
    private String name;
    private String sex;

    public Model() {
    }

    public Model(String name, String sex) {

        this.name = name;
        this.sex = sex;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
