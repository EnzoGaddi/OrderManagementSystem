
import java.util.Scanner;
public class Order
{
        private String orderId;
        private String customerName;
        private String productName;
        private int quantity;

    public Order(String orderId, String customerName, String productName, int quantity)
    {
        this.orderId;
        this.customerName;
        this.productName;
        this.quantity;
    }

    public void setOrderId(String OdrId) {
        orderId = OdrId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setCustomerName(String Cn) {
        customerName = Cn;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setProductName(String Pn)
    {
        productName = Pn;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setQuantity(int Quan)
    {
        quantity = Quan;
    }

    public int getQuantity()
    {
        return quantity;
    }
}

