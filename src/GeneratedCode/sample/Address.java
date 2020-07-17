package GeneratedCode.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Address {
    //Attributes
    public String city;
    public String street;
    public ArrayList<Address> data;
    public ArrayList<String> joinPredicates = new ArrayList<>();

    //Methods
    public Address(){}

    public ArrayList<Address> getData() {
            return data;
    }

    public void setData(ArrayList<Address> data) {
        this.data = data;
    }

    public void loadData(ArrayList<String> city,ArrayList<String> street) {

         for (var city0 : city) {
         for (var street1 : street) {
        if(){
                Address Address0 = new Address();
                Address0.city = city0;
                Address0.street = street1;
                data.add(Address0);
        }
        }
        }
    }

}