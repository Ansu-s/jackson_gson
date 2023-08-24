package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Myinfo {
    String name;
    int age;

    Myinfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Myinfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ListToJson {
    public static void main(String[] args) throws JsonProcessingException {
        List<String> list1 = Arrays.asList("hff", "flskf", "Abs", "hfafh", "fjalksf3");
        System.out.println(list1);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(list1);
        System.out.println(arrayList);

        Gson gson = new Gson();
        String jsonformat = gson.toJson(list1);
        System.out.println(jsonformat);
        String jsonOut = gson.toJson(arrayList);
        System.out.println(jsonOut);
        String toList = gson.toString();
        //System.out.println(toList);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonforamt1 = objectMapper.writeValueAsString(list1);
        System.out.println(jsonforamt1);


        ArrayList<Myinfo> entries = new ArrayList<>();
        entries.add(new Myinfo("Ansu", 23));
        entries.add(new Myinfo("Nikhil", 22));
        entries.add(new Myinfo("Kabir", 24));

        System.out.println(entries);
        String infoJson = gson.toJson(entries);
        System.out.println(infoJson);

       /* ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("D:/cp/dataTwo.json"), jsonDataObject);*/


    }
}