package com.niit.beans;

public class ContractEmployee {
	 private float pay_per_hour;  
	    private String contract_duration;
	    private String name;
		/**
		 * @return the pay_per_hour
		 */
		public float getPay_per_hour() {
			return pay_per_hour;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @param pay_per_hour the pay_per_hour to set
		 */
		public void setPay_per_hour(float pay_per_hour) {
			this.pay_per_hour = pay_per_hour;
		}
		/**
		 * @return the contract_duration
		 */
		public String getContract_duration() {
			return contract_duration;
		}
		/**
		 * @param contract_duration the contract_duration to set
		 */
		public void setContract_duration(String contract_duration) {
			this.contract_duration = contract_duration;
		} 
	    
}
