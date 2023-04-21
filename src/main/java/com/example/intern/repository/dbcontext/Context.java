package com.example.intern.repository.dbcontext;

import com.example.intern.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Context {
    @Autowired
    public AccountRepository accountRepository;

    @Autowired
    public ProductRepo productRepo;

    @Autowired
    public ProductImgRepo productImgRepo;

    @Autowired
    public BrandRepo brandRepo;

    @Autowired
    public ColorRepo colorRepo;

    @Autowired
    public ProducerRepo producerRepo;

    @Autowired
    public SizeRepo sizeRepo;

    @Autowired
    public CategoryRepo categoryRepo;

    @Autowired
    public ProductStatusRepo productStatusRepo;
}
