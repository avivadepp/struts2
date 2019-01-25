package pojo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import pojo.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @program: struts2
 * @description: ProductAction用于控制
 * @autor:
 * @rewrite: Aviva Wang
 * @create: 2019-01-24-41
 **/
/*public class pojo.ProductAction {
    private pojo.Product product;

    public String show() {
        product = new pojo.Product();
        product.setName("iphone7");
        return "show";
    }

    public String add(){
        System.out.println("product.name:"+product.getName());
        return "show";
    }

    public pojo.Product getProduct() {
        return product;
    }

    public void setProduct(pojo.Product product) {
        this.product = product;
    }
}*/

public class ProductAction extends ActionSupport {
    private Product product;

    public String show() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();

        System.out.println("request:\t" + request);
        System.out.println("response:\t" + response);

        product = new Product();
        product.setName("iphone7");
        return "show";
    }

    public String add() {
        Map m = ActionContext.getContext().getSession();
        m.put("name", product.getName());
        return "show";
    }

    // public void validate(){
    // if ( product.getName().length() == 0 ){
    // addFieldError( "product.name", "name can't be empty" );
    // }
    // }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}