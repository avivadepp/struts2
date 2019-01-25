package pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @program: struts2
 * @description: 测试hibernate
 * @autor:
 * @rewrite: Aviva Wang
 * @create: 2019-01-25-18
 **/
public class TestHibernate {
    public static void main(String[] args) {

        //hibernate.cfg.xml不放在resources下面的话，无法被定位到
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        Product p = new Product();
        p.setName("iphone7");
        p.setPrice(7000);
        s.save(p);

        //需要在链接中写上数据库名
        //需要先创建product_表，否则会报错
        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
