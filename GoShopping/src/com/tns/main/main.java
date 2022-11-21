package com.tns.main;

import com.tns.outer.GSNormalAcc;
import com.tns.outer.GSPrimeAcc;
import com.tns.outer.GSShopFactory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSShopFactory gssf = new GSShopFactory();
		gssf.getNewPrimeAccount(173, "Nithin", 1090, false);
		gssf.getNewNormalAccount(174, "nithin12", 900, 9);
		
		
		// Step 2
		GSPrimeAcc gsp = new GSPrimeAcc();
		gsp.getAccNm();
		gsp.getAccNo();
		gsp.getCharges();
		// Step 4 / Step d.
		gsp.bookProduct(500);
		
		
		String Details=gsp.toString();
		System.out.println(Details);
		
	
		GSNormalAcc gsn = new GSNormalAcc(); 
		gsn.getAccNm();
		gsn.getAccNo();
		gsn.getCharges();
		gsn.getDeliveryCharge();
		
		
		gsn.bookProduct(1000);

		String Details1=gsn.toString();
	
		System.out.println(Details1);

	}

}
