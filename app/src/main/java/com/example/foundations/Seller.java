package com.example.foundations;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "seller_table")
public class Seller {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "sellerId")
    private Integer sellerId;

    @NonNull
    @ColumnInfo(name = "firstName")
    private String firstName;
    public String getFirstName() { return firstName; }

    @NonNull
    @ColumnInfo(name = "lastName")
    private String lastName;
    public String getLastName() { return lastName; }

    @NonNull
    @ColumnInfo(name = "email")
    private String email;
    public String getEmail() { return email; }

    @NonNull
    @ColumnInfo(name = "phone")
    private String phone;
    public String getPhone() { return phone; }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer id) {
        this.sellerId = id;
    }

    public void setFirstName(@NonNull String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public void setPhone(@NonNull String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);
        fullName.append(" ");
        fullName.append(lastName);
        return fullName.toString();
    }

    public Seller(@NonNull String firstName, @NonNull String lastName, @NonNull String email, @NonNull String phone) {
        this.sellerId = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
}
