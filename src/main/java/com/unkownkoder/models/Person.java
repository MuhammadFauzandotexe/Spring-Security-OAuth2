package com.unkownkoder.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

@Entry(
        base = "ou=users",
        objectClasses = { "person", "inetOrgPerson", "top" })

@Setter
@Getter
public class Person {
    @Id
    private Name id;
    private @Attribute(name = "cn") String username;
    private @Attribute(name = "sn") String sureName;
    private @Attribute(name = "userPassword") String password;
}
