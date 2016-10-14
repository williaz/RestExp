package service;

import dto.CustomerDto;
import org.springframework.stereotype.Service;

/**
 * Created by williaz on 10/14/16.
 */
@Service
public class CustomerService {
    public CustomerDto getCustomerById(long id) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setLastName("Wang");
        customerDto.setFirstName("Bill");
        customerDto.setCustomerType("Retail");
        customerDto.setCustomId(id);

        return customerDto;
    }
}
