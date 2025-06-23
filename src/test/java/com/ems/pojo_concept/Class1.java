package com.ems.pojo_concept;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import static java.util.Arrays.*;

public class Class1 {


    public static void main(String[] args) throws JsonProcessingException {

        PojoConcept pojoConcept = new PojoConcept();
        pojoConcept.setFirstName("Yugandhar");
        pojoConcept.setLastName("VG");
        pojoConcept.setEmail("yugandhar@gmail.com");
        pojoConcept.setSkills(asList("Java", "Python", "C"));
//
//        System.out.println(pojoConcept.getFirstName());
//        System.out.println(pojoConcept.getLastName());
//        System.out.println(pojoConcept.getEmail());
//        System.out.println(pojoConcept.getSkills());

        ObjectMapper mapper = new ObjectMapper();
        String pojoToJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojoConcept);
        System.out.println(pojoToJson);

    }

}
