package service;

import dto.CustomerDto;
import org.springframework.stereotype.Service;

/**
 * Created by williaz on 10/14/16.
 * mock service
 */
@Service
public class CustomerService {

    public CustomerDto getCustomerById(long id) {
        if(id>500){
            return null; //for testing No found exception
        }

        CustomerDto customerDto = new CustomerDto();
        customerDto.setLastName("Wang");
        customerDto.setFirstName("Bill");
        customerDto.setCustomerType("Retail");
        customerDto.setCustomId(id);

        return customerDto;
    }
    //assign the id
    public CustomerDto save(CustomerDto customerDto){
        customerDto.setCustomId(257);

        return customerDto;
    }

    //update
    public CustomerDto update(long id, CustomerDto customerDto){
        //EMPTY
        customerDto.setCustomId(111);

        return customerDto;
    }

    public void delete(long id){

    }

}
