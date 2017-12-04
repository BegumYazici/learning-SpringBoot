package com.springboot.SpringBootExample.models;

import com.sun.corba.se.spi.ior.ObjectId;

import java.util.Date;
import java.util.List;


public class User {
    private ObjectId id;

    private String name;
    private Integer age;
    private Date createdAt;
    private String nationality;
    private List<String> friendsIds;
    private List<String> articlesIds;
}
