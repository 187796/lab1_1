package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
	// product
		private String productId;

		private BigDecimal productPrice;

		private String productName;

		private Date productSnapshotDate;

		private String productType;

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public BigDecimal getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(BigDecimal productPrice) {
			this.productPrice = productPrice;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Date getProductSnapshotDate() {
			return productSnapshotDate;
		}

		public void setProductSnapshotDate(Date productSnapshotDate) {
			this.productSnapshotDate = productSnapshotDate;
		}

		public String getProductType() {
			return productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public boolean equals(OfferItem offerItem, Object obj) {
			if (offerItem == obj)
				return true;
			if (obj == null)
				return false;
			if (offerItem.getClass() != obj.getClass())
				return false;
			OfferItem other = (OfferItem) obj;
			if (offerItem.money.getCurrency() == null) {
				if (other.money.getCurrency() != null)
					return false;
			} else if (!offerItem.money.getCurrency().equals(other.money.getCurrency()))
				return false;
			if (offerItem.discount == null) {
				if (other.discount != null)
					return false;
			} else if (!offerItem.discount.equals(other.discount))
				return false;
			if (this == null) {
				if (other.product != null)
					return false;
			} else if (!equals(other.product))
				return false;
			if (offerItem.quantity != other.quantity)
				return false;
			if (offerItem.money.getTotalCost() == null) {
				if (other.money.getTotalCost() != null)
					return false;
			} else if (!offerItem.money.getTotalCost().equals(other.money.getTotalCost()))
				return false;
			return true;
		}
}
