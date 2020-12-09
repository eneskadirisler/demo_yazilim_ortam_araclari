package tr.edu.medipol.yazilimaraclari;

public class HarfSaydýrmaApp {

	 public static void main(String[] args) {
	        
	        String cumle = "Medipol Universitesi";
	        int harfSayisi = harfleriSaydir(cumle);
	        System.out.printf("%s cumledeki harf sayisi: %d", cumle, harfSayisi);
	    }

	 

	    static int harfleriSaydir(String cumle) {
	        
	        int harfSayisi = 0;
	        for (int i = 0; i < cumle.length(); i++) {
	            char karakter = cumle.charAt(i);
	            if ( Character.isAlphabetic(karakter) ) {
	                harfSayisi++;
	            }
	        }
	        
	        return harfSayisi;
	    }

	 

	}