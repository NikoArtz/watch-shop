package com.example.watchshop.model;

import lombok.Data;

/**
 * @author martsiomchyk
 */
@Data
public class WatchDTO {

    private Long id;
    private String title;
    private String price;
    private String description;
    private String fountain;
}
