package com.example.intern.services;

import com.example.intern.model.Objects.AccountCreate;
import com.example.intern.model.Accounts;
import com.example.intern.model.Objects.AccountCustom;

import com.example.intern.model.Product;
import com.example.intern.repository.dbcontext.Context;
import com.example.intern.services.IServices.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class Services implements IServices {
    @Autowired
    private Context context;

    @Override
    public Accounts createAccount(AccountCreate newAccount) {
        Accounts accounts = new Accounts();
        accounts.setAccountName(newAccount.getName());
        accounts.setAccountUserName(newAccount.getUserName());
        accounts.setAccountPassword(newAccount.getUserPass());
        context.accountRepository.save(accounts);
        return accounts;
    }

    @Override
    public AccountCustom login(String userName, String userPass) {
//        Accounts accounts = context.accountRepository.checkLogin(userName,userPass);
//        if(accounts == null){
//            return null;
//        }
        Accounts accounts = new Accounts();
        List<Accounts> accountsList = context.accountRepository.findAll();
        for (Accounts data:accountsList) {
            if((data.getAccountName().equals(userName)) && (data.getAccountPassword().equals(userPass))){
                accounts = data;
                break;
            }
        }
        if (accounts.getAccountId() == null){
            System.out.println(accounts.getAccountName());
            return null;
        }
        AccountCustom result = new AccountCustom();
        result.setRoleID(accounts.getRoleId());
        result.setId(accounts.getAccountId());
        result.setAddress("hanoi");
        result.setName(accounts.getAccountName());
        result.setShipContacts(null);
        return result;
    }

    @Override
    public List<Product> nextPage(int page) {
//        PageRequest pageRequest = PageRequest.of(page,5);
//        Page<Product> result = context.productRepo.findAll(pageRequest);
        List result = context.productRepo.findAll();
        System.out.println("sss");
        return result;
    }
}
