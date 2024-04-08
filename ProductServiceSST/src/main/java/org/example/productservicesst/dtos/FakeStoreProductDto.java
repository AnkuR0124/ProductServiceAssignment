package org.example.productservicesst.dtos;


import lombok.Getter;
import lombok.Setter;

//dto = data transfer object
//dto is a class that is used to encapsulate data and send it from one subsystem of an application to another
@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
