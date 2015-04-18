/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in LineItem.java
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

public class MGLineItem extends HaravanResource {

	@JsonProperty("fulfillment_service")
	public String getFulfillmentService() {
		return (String)getAttribute("fulfillment_service");
	}
	@JsonProperty("fulfillment_service")
	public void setFulfillmentService(String _fulfillment_service) {
		setAttribute("fulfillment_service", _fulfillment_service);
	}

	@JsonProperty("fulfillment_status")
	public String getFulfillmentStatus() {
		return (String)getAttribute("fulfillment_status");
	}
	@JsonProperty("fulfillment_status")
	public void setFulfillmentStatus(String _fulfillment_status) {
		setAttribute("fulfillment_status", _fulfillment_status);
	}

	@JsonProperty("grams")
	public int getGrams() {
		Integer value = (Integer)getAttribute("grams");
		return value != null ? value : 0;
	}
	@JsonProperty("grams")
	public void setGrams(int _grams) {
		setAttribute("grams", _grams);
	}

	@JsonProperty("name")
	public String getName() {
		return (String)getAttribute("name");
	}
	@JsonProperty("name")
	public void setName(String _name) {
		setAttribute("name", _name);
	}

	@JsonProperty("price")
	public String getPrice() {
		return (String)getAttribute("price");
	}
	@JsonProperty("price")
	public void setPrice(String _price) {
		setAttribute("price", _price);
	}

	@JsonProperty("product_id")
	public int getProductId() {
		Integer value = (Integer)getAttribute("product_id");
		return value != null ? value : 0;
	}
	@JsonProperty("product_id")
	public void setProductId(int _product_id) {
		setAttribute("product_id", _product_id);
	}

	@JsonProperty("quantity")
	public int getQuantity() {
		Integer value = (Integer)getAttribute("quantity");
		return value != null ? value : 0;
	}
	@JsonProperty("quantity")
	public void setQuantity(int _quantity) {
		setAttribute("quantity", _quantity);
	}

	@JsonProperty("requires_shipping")
	public boolean getRequiresShipping() {
		Boolean value = (Boolean)getAttribute("requires_shipping");
		return value != null ? value : false;
	}
	@JsonProperty("requires_shipping")
	public void setRequiresShipping(boolean _requires_shipping) {
		setAttribute("requires_shipping", _requires_shipping);
	}

	@JsonProperty("sku")
	public String getSku() {
		return (String)getAttribute("sku");
	}
	@JsonProperty("sku")
	public void setSku(String _sku) {
		setAttribute("sku", _sku);
	}

	@JsonProperty("title")
	public String getTitle() {
		return (String)getAttribute("title");
	}
	@JsonProperty("title")
	public void setTitle(String _title) {
		setAttribute("title", _title);
	}

	@JsonProperty("variant_id")
	public int getVariantId() {
		Integer value = (Integer)getAttribute("variant_id");
		return value != null ? value : 0;
	}
	@JsonProperty("variant_id")
	public void setVariantId(int _variant_id) {
		setAttribute("variant_id", _variant_id);
	}

	@JsonProperty("variant_title")
	public String getVariantTitle() {
		return (String)getAttribute("variant_title");
	}
	@JsonProperty("variant_title")
	public void setVariantTitle(String _variant_title) {
		setAttribute("variant_title", _variant_title);
	}

	@JsonProperty("vendor")
	public String getVendor() {
		return (String)getAttribute("vendor");
	}
	@JsonProperty("vendor")
	public void setVendor(String _vendor) {
		setAttribute("vendor", _vendor);
	}

}
