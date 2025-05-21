package com.man.dto;

public class ProductDto {


        private String name;
        private String type;
        private double incomingPrice;
        private double sellingPrice;
        private double mrp;
        private String description;
        private String brand;
        private int quantity;
        private String color;
        private double weight;
        private String manufDate;
        private String warranty;
        private boolean returnPolicy;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getIncomingPrice() {
            return incomingPrice;
        }

        public void setIncomingPrice(double incomingPrice) {
            this.incomingPrice = incomingPrice;
        }

        public double getSellingPrice() {
            return sellingPrice;
        }

        public void setSellingPrice(double sellingPrice) {
            this.sellingPrice = sellingPrice;
        }

        public double getMrp() {
            return mrp;
        }

        public void setMrp(double mrp) {
            this.mrp = mrp;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getManufDate() {
            return manufDate;
        }

        public void setManufDate(String manufDate) {
            this.manufDate = manufDate;
        }

        public String getWarranty() {
            return warranty;
        }

        public void setWarranty(String warranty) {
            this.warranty = warranty;
        }

        public boolean isReturnPolicy() {
            return returnPolicy;
        }

        public void setReturnPolicy(boolean returnPolicy) {
            this.returnPolicy = returnPolicy;
        }

        @Override
        public String toString() {
            return "ProductDto{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", incomingPrice=" + incomingPrice +
                    ", sellingPrice=" + sellingPrice +
                    ", mrp=" + mrp +
                    ", description='" + description + '\'' +
                    ", brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", color='" + color + '\'' +
                    ", weight=" + weight +
                    ", manufDate='" + manufDate + '\'' +
                    ", warranty='" + warranty + '\'' +
                    ", returnPolicy=" + returnPolicy +
                    '}';
        }
    }


