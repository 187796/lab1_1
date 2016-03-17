package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	public String discountCause;
	public BigDecimal discount;
	
	public Discount(){
	}
	
	public String getDiscountCause() {
		return discountCause;
	}
	public void setDiscountCause(String discountCause) {
		this.discountCause = discountCause;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	
}