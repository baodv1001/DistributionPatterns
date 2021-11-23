package facade;

import domain.Customer;
import domain.Domain;
import dto.CustomerDTO;

class CustomerDTOAssembler {
    public static CustomerDTO makeCustomerDTO(Customer c) {
        CustomerDTO result = new CustomerDTO();
        result.name = c.getName();
        result.phone = c.getPhone();
        result.address = c.getAddress();
        return result;
    }

    public static void updateCustomer(CustomerDTO dto) {
        Customer target = null;
        for (Customer c : Domain.customers) {
            if (dto.name.equals(c.getName())) {
                target = c;
                break;
            }
        }
        if (target != null) {
            target.setAddress(dto.address);
            target.setPhone(dto.phone);
        }
    }

    public static void makeCustomer(CustomerDTO dto) {
        Customer result = new Customer(dto.name, dto.phone, dto.address);
        Domain.customers.add(result);
    }
}
