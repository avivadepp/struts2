/**
 * @program: struts2
 * @description: Model层创建一个简单的Product类用于存放数据
 * @autor:
 * @rewrite: Aviva Wang
 * @create: 2019-01-24-40
 **/
public class Product {
    int id;
    String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
