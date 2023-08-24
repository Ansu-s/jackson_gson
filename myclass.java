package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class MobilePhone {
    String name;
    String brand;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MobilePhone{" + "name='" + name + '\'' + ", brand='" + brand + '\'' + ", price=" + price + '}';
    }
}

public class myclass extends MobilePhone {
    static myclass obj = new myclass();


    public static void main(String[] args) throws JsonProcessingException {

        obj.setBrand("Realme");
        obj.setName("x");
        obj.setPrice(19999);

        System.out.println(obj);
        String newline = System.lineSeparator();

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(obj);
        System.out.println("serialized object :" + newline + json);

        myclass dec = objectMapper.readValue(json, myclass.class);
        System.out.println("Deserialized json" + newline + dec);
    }
}
