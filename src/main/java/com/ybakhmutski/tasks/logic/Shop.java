package com.ybakhmutski.tasks.logic;

import com.ybakhmutski.tasks.model.Customer;
import com.ybakhmutski.tasks.model.RentUnit;
import com.ybakhmutski.tasks.model.SportEquipment;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * Created by Yury_Bakhmutski on 4/8/2017.
 */
public class Shop {
    private final static Logger LOGGER = Logger.getLogger(Shop.class);
    private static final int ALLOWED_QUANTITY = 3;
    private Map<SportEquipment, Integer> goods;
    private List<Customer> customers;

    public void Shop() {
        goods = new DataReader().readFromFile();
    }

    private SportEquipment findSportEquipment(String name) {
        for (Map.Entry<SportEquipment, Integer> entry : goods.entrySet()) {
            if (entry.getKey().equals(name) && entry.getValue() != 0) {
                return entry.getKey();
            }
        }
        return null;
    }

    public boolean rentSportEquioment(String customerName, String title, int quantity) {
        if (quantity > ALLOWED_QUANTITY) {
            quantity = 3;
            //TODO warn message
        }
        SportEquipment sportEquipment = findSportEquipment(title);
        if (sportEquipment == null) {
            //TODO info message
            return false;
        }
        Customer customer = findCustomer(customerName);
        RentUnit customerRentUnit = customer.getRentUnit();
        for (int i = 0; i < quantity; i++) {
            customerRentUnit.addUnit(sportEquipment);
        }
        return true;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomer(Customer customer) {
        return customers.add(customer);
    }

    public boolean removeCustomer(Customer customer) {
        return customers.remove(customer);
    }

}
