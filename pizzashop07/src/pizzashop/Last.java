package pizzashop;

import java.util.Date;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Last {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String title;
     
    @Persistent
    private int count;
    
    @Persistent
    private String topping;
    
    @Persistent
    private String delivery;
    
    @Persistent
    private String side;
     
     
     
     
    @Persistent
    private Date datetime;
 
    public Last(String title,  int count, String topping,String side, Date datetime,String delivery) {
        super();
        this.title = title;
        this.count = count;
        this.topping = topping;
        this.side=side;
        this.datetime = datetime;
        this.delivery=delivery;
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
    

    public String getSide() {
        return side;
    }
 
    public void setSide(String side) {
        this.side = side;
    }
 
    public String getDelivery() {
        return delivery;
    }
 
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
 
    public int getCount() {
        return count;
    }
 
    public void setCount(int count) {
        this.count = count;
    }

    public String getTopping() {
        return topping;
    }
 
    public void setTopping(String topping) {
        this.topping = topping;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}