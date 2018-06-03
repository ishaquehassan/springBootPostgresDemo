package com.example.demo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MainController {

    @Autowired
    private lateinit var customerDao:CustomerDao

    @RequestMapping("/")
    fun index():String{
        return "Hello World"
    }

    @RequestMapping("/add")
    fun add(@RequestParam firstName:String,@RequestParam lastName:String):String{
        customerDao.save(Customer(firstName,lastName))
        return "Hello World"
    }

    @RequestMapping("/get")
    fun get(@RequestParam id:Long):String{
        return customerDao.findById(id).toString()
    }
}