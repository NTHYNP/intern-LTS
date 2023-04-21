package com.example.intern.model.Objects;

import com.example.intern.model.*;

import java.util.List;

public class PropertyObject {
    private List<Color> colors;
    private List<Producer> producers;
    private List<Brand> brands;
    private List<Size> sizes;
    private List<CategoryTypeId> categoryTypes;
    private List<ProductStatus> productStatuses;

    public List<ProductStatus> getProductStatuses() {
        return productStatuses;
    }

    public void setProductStatuses(List<ProductStatus> productStatuses) {
        this.productStatuses = productStatuses;
    }

    public List<CategoryTypeId> getCategoryTypes() {
        return categoryTypes;
    }

    public void setCategoryTypes(List<CategoryTypeId> categoryTypes) {
        this.categoryTypes = categoryTypes;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
