package com.example.intern.controller;

import com.example.intern.model.Objects.AccountCreate;
import com.example.intern.model.Accounts;
import com.example.intern.model.Objects.AccountCustom;
import com.example.intern.model.Product;
import com.example.intern.services.Services;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/product1.0")
@CrossOrigin(allowedHeaders = "*",value = "*")
public class Controller {
    @Autowired
    private Services services;
//    public Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
//        @Override
//        public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
//            return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
//        }
//    }).create();
    private Gson gson = new Gson();

    @RequestMapping(value = "createaccount", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public Accounts createAccount(@RequestBody String newAccount){
        System.out.println(newAccount);
        AccountCreate accountCreate = gson.fromJson(newAccount,AccountCreate.class);
        return services.createAccount(accountCreate);
    }
    
    @RequestMapping(value = "checklogin",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountCustom login(@RequestParam String userName, String userPass){
        return services.login(userName,userPass);
    }

    @RequestMapping(value = "nextpage",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> nextPage(@RequestParam int page){
        return services.nextPage(page);
    }
}
