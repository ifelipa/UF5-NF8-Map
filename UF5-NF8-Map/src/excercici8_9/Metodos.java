package excercici8_9;


import java.util.ArrayList;
import java.util.Map;

import exercici8_8.Cotxe;

public class Metodos {

	public static void removeCar(int cilin, Map<String, Cotxe> mapList) {
		ArrayList<String> borrar = new ArrayList<String>();
		
		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			if (aux.getCilindrada() > cilin) {	
				String key = (String) elemento.getKey();
				borrar.add(key);
			}
		}
		
		for (String key : borrar) {
			mapList.remove(key);
		}
		
	}

	public static ArrayList<Cotxe> numberN(int nCili, Map<String, Cotxe> mapList) {
		ArrayList<Cotxe> returnList = new ArrayList<Cotxe>();
				
		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			if (aux.getnCilindros() == nCili ) {				
				String clave = (String) elemento.getKey();
				System.out.println("Agregando" + elemento.getValue());
				returnList.add((Cotxe) elemento.getValue());
			}
		}
		return returnList;

	}

	public static ArrayList<Cotxe> barndCar(String brand, Map<String, Cotxe> mapList) {
		ArrayList<Cotxe> returnList = new ArrayList<Cotxe>();
		
		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			if (aux.getMarca().equals(brand) ) {				
				String clave = (String) elemento.getKey();
				System.out.println("Agregando" + elemento.getValue());
				returnList.add((Cotxe) elemento.getValue());
			}
		}
		return returnList;
	}


}
