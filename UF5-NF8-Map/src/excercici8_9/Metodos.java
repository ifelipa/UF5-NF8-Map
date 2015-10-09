package excercici8_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import exercici8_8.Cotxe;

public class Metodos {
	/*
	 * Elimina un coche con un determinada cilindrada
	 */
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
	
	/*
	 * ArrayList con Coches de determinado numero de cilindros 
	 */
	public static ArrayList<Cotxe> numberCilin(int nCili, Map<String, Cotxe> mapList) {
		ArrayList<Cotxe> returnList = new ArrayList<Cotxe>();

		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			if (aux.getnCilindros() == nCili) {
				String clave = (String) elemento.getKey();
				returnList.add((Cotxe) elemento.getValue());
			}
		}
		return returnList;
	}
	
	
	/*
	 *  arrayList con los coches ordenados alfabeticamente
	 */

	public static ArrayList<ArrayList<Cotxe>> brandCar(Map<String, Cotxe> mapList) {
		//ArrayList<ArrayList<Cotxe>> returnList = new ArrayList<ArrayList<Cotxe>>(); 
		Map<String, ArrayList<Cotxe>> returnList = new TreeMap<String, ArrayList<Cotxe>>();
		
		ArrayList<Cotxe> returnListBrand = new ArrayList<Cotxe>();

		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			String key = (String) elemento.getKey();
			
			if ()
				
				
			returnList.add((Cotxe) elemento.getValue());
		}

		Collections.sort(returnList, new Comparator<Cotxe>() {
			@Override
			public int compare(Cotxe o1, Cotxe o2) {
				return o1.getMarca().compareTo(o2.getMarca());
			}
		});
		return returnList;
	}

}
