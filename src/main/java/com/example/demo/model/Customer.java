// package com.example.demo.model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// //Because no @Table annotation exists, it is assumed that this entity is mapped to a table named Customer.

// @Entity
// public class Customer {

//   @Id
//   @GeneratedValue(strategy=GenerationType.AUTO)
//   private Long id;
//   private String firstName;
//   private String lastName;

//   protected Customer() {}

//   public Customer(String firstName, String lastName) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//   }

//   @Override
//   public String toString() {
//     return String.format(
//         "Customer[id=%d, firstName='%s', lastName='%s']",
//         id, firstName, lastName);
//   }

//   public Long getId() {
//     return id;
//   }

//   public String getFirstName() {
//     return firstName;
//   }

//   public String getLastName() {
//     return lastName;
//   }
// }