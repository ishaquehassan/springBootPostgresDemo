package com.example.demo

import javax.persistence.Entity
import javax.persistence.GenerationType
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null
    private var firstName: String = ""
    private var lastName: String = ""

    constructor() {}

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName)
    }

}