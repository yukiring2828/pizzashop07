package pizzashop;

import java.util.Date;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String title;
     
    @Persistent
    private String price;
     
    @Persistent
    private String comment;
    
    @Persistent
    private String topping;
    
    @Persistent
    private String delivery;
     
    @Persistent
    private Date datetime;
 
    public LinkData(String title, String price, String comment, Date datetime, String topping,String delivery) {
        super();
        this.title = title;
        this.price = price;
        this.comment = comment;
        this.datetime = datetime;
        this.topping = topping;
        this.delivery =delivery;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getPrice() {
        return price;
    }
 
    public void setPrice(String price){
        this.price = price;  
        		}
 
    public String getComment() {
        return comment;
    }
 
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public String getTopping() {
        return topping;
    }
 
    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    public String getDelivery() {
        return delivery;
    }
 
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
 
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}