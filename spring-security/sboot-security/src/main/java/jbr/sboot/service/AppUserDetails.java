package jbr.sboot.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jbr.sboot.model.AppUser;

public class AppUserDetails implements UserDetails {

  private static final long serialVersionUID = 1L;

  private AppUser appUser;

  public AppUserDetails(AppUser appUser) {
    this.setAppUser(appUser);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Collections.singleton(new SimpleGrantedAuthority("USER"));
  }
  
  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

@Override
public String getPassword() {
	return null;
}

@Override
public String getUsername() {
	return null;
}

public AppUser getAppUser() {
	return appUser;
}

public void setAppUser(AppUser appUser) {
	this.appUser = appUser;
}

}
