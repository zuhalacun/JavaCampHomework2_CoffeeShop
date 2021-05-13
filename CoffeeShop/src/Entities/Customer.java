package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity{
	    public String NationalityId;
        public int id;
        public String firstName;
        public String lastName;
        public LocalDate dateOfBirth;
		
        
        public Customer(String nationalityId, int id, String firstName, String lastName, LocalDate dateOfBirth) {
			super();
			NationalityId = nationalityId;
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
		}


		public String getNationalityId() {
			return NationalityId;
		}


		public void setNationalityId(String nationalityId) {
			NationalityId = nationalityId;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}


		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
        
        
		

		
}
