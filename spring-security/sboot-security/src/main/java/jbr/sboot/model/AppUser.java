package jbr.sboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
  @Id
  private long id;
  private String username;
  private String password;
  
  public void setId(long id) {
	  this.id = id;
  }
  
  public long getId() {
	  return id;
  }
  
  public void setUsername(String username) {
	  this.username = username;
  }
  
  public String getUsername() {
	  return username;
  }
  
  public void setPassword(String password) {
	  this.password = password;
  }
  
  public String getPassword() {
	  return password;
  }
}
