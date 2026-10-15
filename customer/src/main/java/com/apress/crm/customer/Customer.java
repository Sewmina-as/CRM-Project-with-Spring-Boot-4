package com.apress.crm.customer;
// Import UUID to generate unique customer IDs
import java.util.UUID;

// A record is a concise way to create a class that holds data
public record Customer(UUID id, String name, String email, String phone) {

    // Constructor that accepts only customer details (without an ID)
    public Customer(String name, String email, String phone) {

        // Generate a new UUID and call the main constructor
        // 'this()' calls another constructor in the same record
        this(UUID.randomUUID(), name, email, phone);
    }
}
