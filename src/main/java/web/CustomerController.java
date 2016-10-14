package web;

import dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import service.CustomerService;

import java.net.URI;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

/**
 * Created by williaz on 10/14/16.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //Create
    @RequestMapping(method = RequestMethod.POST, consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE},
            produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto, UriComponentsBuilder ucb){
        CustomerDto customer = customerService.save(customerDto);

        HttpHeaders headers = new HttpHeaders();
        URI locationUri = ucb.path("/customers/").path(String.valueOf(customer.getCustomId())).build().toUri();
        headers.setLocation(locationUri);

        ResponseEntity<CustomerDto> responseEntity =
                new ResponseEntity<CustomerDto>(customerDto, headers, HttpStatus.CREATED);

        return responseEntity;

    }

    //Retrieve
    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
            produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public CustomerDto getCustomerById(@PathVariable long id){
        CustomerDto customer = customerService.getCustomerById(id);
        if (customer == null){

        }

       return customer;
    }

    //Update
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE},
            produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public CustomerDto updateCustomerById(@PathVariable long id, @RequestBody CustomerDto customerDto){
        CustomerDto customer = customerService.getCustomerById(id);
        if (customer == null){

        }

        customer = customerService.update(id, customerDto);

        return customer;

    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable long id){
        CustomerDto customer = customerService.getCustomerById(id);
        if (customer == null){

        }
        customerService.delete(id);
    }





}
