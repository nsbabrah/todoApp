
package com.example.demo.web.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "user")
public class User {

  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @NotNull
  private String email;
  
  @NotNull
  private String name;

  // Public methods

  public User(long id) { 
    this.id = id;
  }
  
  public User(String email, String name) {
    this.email = email;
    this.name = name;
  }
}
  // Getter and setter methods