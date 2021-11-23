package facade;

import dto.CustomerDTO;
import dto.ProductDTO;

public class RemoteFacade {

    public void makeCustomer(CustomerDTO dto) {
        CustomerDTOAssembler.makeCustomer(dto);
    }

    public void makeProduct(ProductDTO dto) {
        ProductDTOAssembler.makeProduct(dto);
    } // etc.
}