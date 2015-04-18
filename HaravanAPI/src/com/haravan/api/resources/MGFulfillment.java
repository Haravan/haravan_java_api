/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Fulfillment.java
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

public class MGFulfillment extends HaravanResource {

	@JsonProperty("line_items")
	public List<LineItem> getLineItems() {
		return (List<LineItem>)getAttribute("line_items");
	}
	@JsonProperty("line_items")
	public void setLineItems(List<LineItem> _line_items) {
		setAttribute("line_items", _line_items);
	}

	@JsonProperty("order_id")
	public int getOrderId() {
		Integer value = (Integer)getAttribute("order_id");
		return value != null ? value : 0;
	}
	@JsonProperty("order_id")
	public void setOrderId(int _order_id) {
		setAttribute("order_id", _order_id);
	}

	@JsonProperty("receipt")
	public Receipt getReceipt() {
		return (Receipt)getAttribute("receipt");
	}
	@JsonProperty("receipt")
	public void setReceipt(Receipt _receipt) {
		setAttribute("receipt", _receipt);
	}

	@JsonProperty("status")
	public String getStatus() {
		return (String)getAttribute("status");
	}
	@JsonProperty("status")
	public void setStatus(String _status) {
		setAttribute("status", _status);
	}

	@JsonProperty("tracking_company")
	public String getTrackingCompany() {
		return (String)getAttribute("tracking_company");
	}
	@JsonProperty("tracking_company")
	public void setTrackingCompany(String _tracking_company) {
		setAttribute("tracking_company", _tracking_company);
	}

	@JsonProperty("tracking_number")
	public String getTrackingNumber() {
		return (String)getAttribute("tracking_number");
	}
	@JsonProperty("tracking_number")
	public void setTrackingNumber(String _tracking_number) {
		setAttribute("tracking_number", _tracking_number);
	}

}