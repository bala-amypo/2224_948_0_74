package com.example.demo.entit

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity {
  @id
  @GeneratedValue(startegy=GenerationType.IDENTITY)
  private Long id;

  @Email(message = "Email Format is not valid")
  private String email;

  @NotBlank(message="Name is not Valid")
  private String name;

  public void setId(Long id){
    this.id = id;
  }
  public Long getId(){
    return id;
  } 

  public studentEntity(){

  }

  public studentEntity(Long id,String name,String email)
  {
    this.id = id;
    this.name = name;
    this.email = email;
  }


}