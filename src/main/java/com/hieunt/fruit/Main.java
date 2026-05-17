package com.hieunt.fruit;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hieunt.fruit.entity.Fruit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws JsonProcessingException {
        Fruit fruit = new Fruit("MC", "Mãng Cầu", "MÃNG CẦU LA TRÁI ĐẦU TIÊN TRONG MÂM NGŨ QUẢ", 5.0);
        System.out.println(fruit);
        //CONVERT OBJECT JSON GUI VE FE REACT, BƯA NAY IN ĐÃ RA MÀN HÌNH
        ObjectMapper mapper = new ObjectMapper();
        String cauJon = mapper.writeValueAsString(fruit);
        System.out.println("JSON mlem:" + cauJon);

        //tu json tro lai object
        String sungJSON = """
                {"id":"SS","name":"Sung Suong","desc":"Sung Suong LA TRÁI THU 2 TIÊN TRONG MÂM NGŨ QUẢ","price":4.0}
                """;

        Fruit sung = mapper.readValue(sungJSON, Fruit.class); //rã, parse, new ngầm
        System.out.println("Quá đã JSON ơi: " + sung.toString());
    }
//static void main() {
//    System.out.println("Hello Maven");
//}
}
