package com.capstone.ecommerce.platform.com.capstone.ecommerce.platform.usermanagement.models;

import com.capstone.ecommerce.platform.common.model.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role extends BaseModel {

    private String name;

    public Role(String name){
        this.name=name;
    }

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users = new HashSet<>();
}
