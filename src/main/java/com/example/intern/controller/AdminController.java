package com.example.intern.controller;

import com.example.intern.model.Accounts;
import com.example.intern.model.Objects.CreateProduct;
import com.example.intern.model.Objects.PropertyObject;
import com.example.intern.model.Product;
import com.example.intern.services.AdminServices;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RequestMapping(value = "api/admin1.0")
public class AdminController {
    @Autowired
    private AdminServices adminServices;
    Gson gson = new Gson();

    @RequestMapping(value = "upload",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public void upload(@RequestPart MultipartFile file1, @RequestPart MultipartFile file2, @RequestParam String data){
        CreateProduct ctp = gson.fromJson(data, CreateProduct.class);
        adminServices.addProduct(file1, file2, ctp);
    }

    @RequestMapping(value = "getallproperty",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public PropertyObject getAllProperty(){
        return adminServices.getPropertyObject();
    }

    @RequestMapping(value = "searchtop5product",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> searchTop5Product(@RequestParam String search){
        return adminServices.searchTop5Product(search);
    }



}
