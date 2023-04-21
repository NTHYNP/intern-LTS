package com.example.intern.services.IServices;

import com.example.intern.model.Objects.AccountCreate;
import com.example.intern.model.Accounts;
import com.example.intern.model.Objects.AccountCustom;
import com.example.intern.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;


public interface IServices {

    public Accounts createAccount(AccountCreate newAccount);

    public AccountCustom login(String userName, String userPass);

    public List<Product> nextPage(int page);

}
