package com.lambdaexpression.ecommerce;

import java.util.*;

// This class accepts dynamic sorting logic using a lambda
public class CampaignSorter {
	public static void sortProducts(
			List<Product> products,
			Comparator<Product> comparator) {
		
		products.sort(comparator);
	}
}
