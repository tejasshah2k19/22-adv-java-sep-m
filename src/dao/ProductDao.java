package dao;

import java.util.ArrayList;
import java.util.List;

import bean.ProductBean;

public class ProductDao {

	static List<ProductBean> products = new ArrayList<ProductBean>();

	static {
		ProductBean p1 = new ProductBean();
		p1.setProductId(1);
		p1.setName("iphone 14 pro");
		p1.setPrice(139900);
		p1.setQty(25);

		products.add(p1);
	}

	public List<ProductBean> getAllProducts() {
		return products;
	}

}
