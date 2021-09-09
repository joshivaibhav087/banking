package com.org.security.response;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;

public class JwtResponse {
	private String id;
	private String name;
	private String token;
	private String type = "Bearer";
	private String username;
	private String gender;
	private int savings_account_number;
	private String pan;
	private String adhar_number;
	private String mobile;
	private Collection<? extends GrantedAuthority> authorities;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSavings_account_number() {
		return savings_account_number;
	}
	public void setSavings_account_number(int savings_account_number) {
		this.savings_account_number = savings_account_number;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAdhar_number() {
		return adhar_number;
	}
	public void setAdhar_number(String adhar_number) {
		this.adhar_number = adhar_number;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
	public JwtResponse(String id, String name, String token, String type, String username, String gender,
			int savings_account_number, String pan, String adhar_number, String mobile,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.id = id;
		this.name = name;
		this.token = token;
		this.type = type;
		this.username = username;
		this.gender = gender;
		this.savings_account_number = savings_account_number;
		this.pan = pan;
		this.adhar_number = adhar_number;
		this.mobile = mobile;
		this.authorities = authorities;
	}
	
//	
	
	
    
}