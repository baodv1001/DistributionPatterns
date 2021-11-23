package facade;

import domain.Invoice;
import dto.InvoiceDTO;
import dto.ProductDTO;

public class InvoiceDTOAssembler {
    public InvoiceDTO makeInvoiceDTO(Invoice inv) {
              InvoiceDTO result = new InvoiceDTO();
              result.customer =
                 CustomerDTOAssembler.makeCustomerDTO(inv.getCustomer());
              result.cart = (ProductDTO[]) inv.getCart().toArray();
              return result;
           }

    public void updateInvoice(InvoiceDTO dto) {

    }

    public void makeInvoice(InvoiceDTO dto) {

    }
}
