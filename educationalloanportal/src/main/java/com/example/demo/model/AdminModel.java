package com.example.demo.model;


	import jakarta.persistence.Entity;

	import jakarta.persistence.Id;

	@Entity
	public class AdminModel {

		
		private String Email;
		private String Password;
		private String MobileNumber;
		@Id
		private int UserRole;
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getMobileNumber() {
			return MobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			MobileNumber = mobileNumber;
		}
		public int getUserRole() {
			return UserRole;
		}
		public void setUserRole(int userRole) {
			UserRole = userRole;
		}
		
	
}
