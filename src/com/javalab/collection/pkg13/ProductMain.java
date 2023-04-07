package com.javalab.collection.pkg13;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		//[1]전체 싱픔목록 출력 메소드 호출(수동으로 메소드 시그너처 생성)
		List<Product> arrPro = new ArrayList<>();

		arrPro.add(new Product(1, "자전거", 250000));
		arrPro.add(new Product(2, "노트북", 1250000));
		arrPro.add(new Product(3, "쌀", 150000));
		arrPro.add(new Product(4, "세탁기", 800000));
		arrPro.add(new Product(5, "시금치", 2500));
		arrPro.add(new Product(6, "대파", 10000));
		arrPro.add(new Product(7, "에어컨", 3500000));
		arrPro.add(new Product(8, "쇼파", 3000000));
		arrPro.add(new Product(9, "우유", 2500));
		arrPro.add(new Product(10, "운동화", 600000));

		printAllproduct(arrPro);
		System.out.println();

		//[2] 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고 
		//해당 상품 가격을 main()메소드 에서 출력하세요
		String wentProduct = "";
		wentProduct = "세탁기";
		Integer price = getProductPrice(arrPro, wentProduct);
		System.out.println(price);
		System.out.println();
		
		//[3] 구매한 저품의 평균 구매 가격을 조회해서 main()메소드 에서 출력
		Double avg = getAverage(arrPro);
		System.out.printf("%.2f",avg);
		System.out.println("\n");
		
		//[4] 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 
		//반환해주는 메소드 만들고, main()메소드에서 출력
		List<Product> arr100 = product100List(arrPro);
		for (Product product : arr100) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
		
		//[5] HanshMap을 통한 제품 출력 메소드 만들기
		Map<Integer, Product> hMap = new HashMap<>();
		hMap.put(1, new Product(1, "자전거", 250000));
		hMap.put(2,new Product(2, "노트북", 1250000));
		hMap.put(3,new Product(3, "쌀", 150000));
		hMap.put(4,new Product(4, "세탁기", 800000));
		hMap.put(5,new Product(5, "시금치", 2500));
		hMap.put(6,new Product(6, "대파", 10000));
		hMap.put(7,new Product(7, "에어컨", 3500000));
		hMap.put(8,new Product(8, "쇼파", 3000000));
		hMap.put(9,new Product(9, "우유", 2500));
		hMap.put(10,new Product(10, "운동화", 600000));
		System.out.println();
		printProductMap(hMap);
		

		
	} // end of main
	
	//[문제5]
	/**
	 * 
	 * @param hMap
	 */
	private static void printProductMap(Map<Integer, Product> hMap){
		for (Integer key : hMap.keySet()) {
			System.out.println(hMap.get(key).getId()+"\t"+hMap.get(key).getName()+"\t"+hMap.get(key).getPrice());
		}
	}
	

	//[문제4]
	/**
	 * 
	 * @param arrPro
	 * @return
	 */
	private static List<Product> product100List(List<Product> arrPro){
			List<Product> arr100 = new ArrayList<>();
			
			for (Product product : arrPro) {
				if (product.getPrice()>=1000000) {
					arr100.add(product);
				}
			}
		return arr100;
	}
	
	
	// [문제3]
	/**
	 * 
	 * @param arrPro
	 * @return
	 */
	public static Double getAverage(List<Product> arrPro) {
		Double avg = 0.0;
		Double sum = 0.0;
		Double count = 0.0;
		for (Product product : arrPro) {
			sum += product.getPrice();
			count++;
		}
		avg = sum / count;
		return avg;
	}

	// [문제2]
	/**
	 * 
	 * @param arrPro
	 * @param wentProduct
	 * @return
	 */
	private static Integer getProductPrice(List<Product> arrPro, String wentProduct) {
		Integer price = 0;

		for (Product product : arrPro) {
			if (product.getName().equals(wentProduct)) {
				price = product.getPrice();
			}
		}
		return price;
	}

	// [문제1]
	/**
	 * 
	 * @param arrPro
	 */
	private static void printAllproduct(List<Product> arrPro) {
		for (Product product : arrPro) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
	}

}