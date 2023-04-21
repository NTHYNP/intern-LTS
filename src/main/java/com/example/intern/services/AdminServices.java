package com.example.intern.services;


import com.example.intern.model.Accounts;
import com.example.intern.model.Objects.CreateProduct;
import com.example.intern.model.Objects.PropertyObject;
import com.example.intern.model.Product;
import com.example.intern.model.ProductImg;
import com.example.intern.repository.dbcontext.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.*;


@Service
public class AdminServices {
    @Autowired
    private Context context = new Context();
    public void addProduct(MultipartFile file1, MultipartFile file2, CreateProduct data){
        Product p = new Product();
        p.setQuantity(data.getProductQuantity());
        p.setProductName(data.getProductName());
        p.setProductDetail(data.getProductDetail());
        p.setCreateDate(null);
        p.setCategoryTypeId(data.getCategory());
        p.setColorId(data.getColor());
        p.setBrandId(data.getBrand());
        p.setProducerId(data.getProducer());
        p.setSizeId(data.getSize());
        p.setPrice(data.getProductPrice());
        p.setShellPrice(data.getProductShellPrice());
        p.setProductStatusId(1);
        context.productRepo.save(p);
        ProductImg pi1 = new ProductImg();
        pi1.setProductId(p.getProductId());
        pi1.setCountImg(1);
        try {
            pi1.setProductImg(file1.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        context.productImgRepo.save(pi1);
        ProductImg pi2 = new ProductImg();
        pi2.setProductId(p.getProductId());
        pi2.setCountImg(2);
        try {
            pi2.setProductImg(file2.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        context.productImgRepo.save(pi2);
    }
    public PropertyObject getPropertyObject() {
        PropertyObject po = new PropertyObject();
        po.setBrands(context.brandRepo.findAll());
        po.setColors(context.colorRepo.findAll());
        po.setProducers(context.producerRepo.findAll());
        po.setSizes(context.sizeRepo.findAll());
        po.setCategoryTypes(context.categoryRepo.findAll());
        po.setProductStatuses(context.productStatusRepo.findAll());

        return po;
    }

    public List<Product> searchTop5Product(String search){
        System.out.println("top5");
        return context.productRepo.searchProductTop5(search);
    }


}
