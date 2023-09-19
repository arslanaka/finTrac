package com.aka.finTrac.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Accounts")
public class Accounts {


    @Id
    private Integer accountID;

    private Integer userID;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false,unique = true)
    private String accountNumber;

    @Column(nullable = false)
    private Double Balance;

    private Timestamp createdAt;

    private Timestamp updatedAt;





}
