package com.works.props;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Product {

    private Long id;
    private String title;
    private String description;

}
