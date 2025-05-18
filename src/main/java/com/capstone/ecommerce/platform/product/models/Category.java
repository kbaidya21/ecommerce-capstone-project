package com.capstone.ecommerce.platform.product.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import com.capstone.ecommerce.platform.common.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Setter
@Getter
@NoArgsConstructor
@Entity
    public class Category extends BaseModel {
        private String name;
        private String description;

        @JsonIgnore
        @OneToMany(mappedBy = "category")
        private List<Product> products;

        public Category(String name) {
            this.name = name;
        }
    }