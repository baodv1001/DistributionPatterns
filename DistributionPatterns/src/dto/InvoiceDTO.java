package dto;

import java.io.Serializable;

public class InvoiceDTO implements Serializable {
    public CustomerDTO customer;
    public ProductDTO[] cart;
    public String salesTax;
}
