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

    //Methods
    public Address(){}

    public ArrayList<Address> getData() {
            return data;
    }

    public void setData(ArrayList<Address> data) {
        this.data = data;
    }

}