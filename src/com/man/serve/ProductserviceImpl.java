package com.man.serve;

import com.man.dto.ProductDto;
import com.man.repository.ProductRepo;
import com.man.repository.ProductrepoImpl;

public class ProductserviceImpl implements ProductService {

    @Override
    public boolean save(ProductDto productDto) {
        if (productDto != null) {
            System.out.println("DTO is not null");

            String name = productDto.getName();
            if (name != null && name.length() > 2 && name.length() <= 50) {
                System.out.println("Valid product name");
            } else {
                System.out.println("Invalid product name");
                return false;
            }

            String type = productDto.getType();
            if (type != null && !type.isEmpty()) {
                System.out.println("Valid product type");
            } else {
                System.out.println("Invalid product type");
                return false;
            }
            double incomingPrice=productDto.getIncomingPrice();

            if (productDto.getIncomingPrice() >= 0) {
                System.out.println("Valid incoming price");
            } else {
                System.out.println("Invalid incoming price");
                return false;
            }
            double sellingPrice=productDto.getSellingPrice();
            if (productDto.getSellingPrice() >= 0) {
                System.out.println("Valid selling price");
            } else {
                System.out.println("Invalid selling price");
                return false;
            }
            double mrp=productDto.getMrp();
            if (productDto.getMrp() >= productDto.getSellingPrice()) {
                System.out.println("Valid MRP");
            } else {
                System.out.println("Invalid MRP");
                return false;
            }

            String description = productDto.getDescription();
            if (description != null && !description.trim().isEmpty()) {
                System.out.println("Valid description");
            } else {
                System.out.println("Invalid description");
                return false;
            }
            String brand = productDto.getBrand();
            if (brand != null && !brand.isEmpty()) {
                System.out.println("Valid brand");
            } else {
                System.out.println("Invalid brand");
                return false;
            }
            int quantity=productDto.getQuantity();
            if (productDto.getQuantity() >= 0) {
                System.out.println("Valid quantity");
            } else {
                System.out.println("Invalid quantity");
                return false;
            }

            String color = productDto.getColor();
            if (color != null && !color.isEmpty()) {
                System.out.println("Valid color");
            } else {
                System.out.println("Invalid color");
                return false;
            }
            double weight=productDto.getWeight();
            if (productDto.getWeight() >= 0) {
                System.out.println("Valid weight");
            } else {
                System.out.println("Invalid weight");
                return false;
            }
            String manufDate=productDto.getManufDate();
            if (productDto.getManufDate() != null) {
                System.out.println("Valid manufacture date");
            } else {
                System.out.println("Invalid manufacture date");
                return false;
            }
            String warranty=productDto.getWarranty();
            if (productDto.getWarranty() != null && !productDto.getWarranty().isEmpty()) {
                System.out.println("Valid warranty");
            } else {
                System.out.println("Invalid warranty");
                return false;
            }



        } else {
            System.out.println("DTO is null");
            return false;
        }
        ProductRepo productRepo=new ProductrepoImpl();
        boolean saved=productRepo.persist(productDto);


        System.out.println("Product saved successfully.");
        return saved;
    }
}
