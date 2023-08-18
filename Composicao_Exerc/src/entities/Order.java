package entities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment = new Date();

    private OrderStatus status;
    private Client client;
   private List<OrderItem> item = new ArrayList<>();

    public OrderStatus getStatus() {
        return status;
    }

    public Order(Client client, OrderStatus status) {
        this.client = client;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void addItem(OrderItem x){
        item.add(x);
    }
    public void removeItem(OrderItem x) {
        item.remove(x);
    }

    public Client getClient() {
        return client;
    }

    public Double total(){
        double total = 0.0;
        for (OrderItem c : item){
            total+=c.subTotal();
        }
        return total;
    }

    public String toString(){
      StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf2.format(moment));
        sb.append("\nOrder status: " + status);
      sb.append("\nClient: " + client.getName());
      sb.append(" (" + sdf1.format(client.getBirthDate()));
      sb.append(") - " + client.getEmail() + "\n");
      sb.append("Order items: \n");
      for (OrderItem c : item){
          sb.append(c);
      }
      return sb.toString();
    }

}
