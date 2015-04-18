/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in PaymentDetails.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
// Last Generated: 2011-09-26T15:53:49-04:00
package com.haravan.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Haravan API Documentation
 */

public class MGPaymentDetails extends HaravanResource {

	@JsonProperty("credit_card_company")
	public String getCreditCardCompany() {
		return (String)getAttribute("credit_card_company");
	}
	@JsonProperty("credit_card_company")
	public void setCreditCardCompany(String _credit_card_company) {
		setAttribute("credit_card_company", _credit_card_company);
	}

	@JsonProperty("credit_card_number")
	public String getCreditCardNumber() {
		return (String)getAttribute("credit_card_number");
	}
	@JsonProperty("credit_card_number")
	public void setCreditCardNumber(String _credit_card_number) {
		setAttribute("credit_card_number", _credit_card_number);
	}

}
