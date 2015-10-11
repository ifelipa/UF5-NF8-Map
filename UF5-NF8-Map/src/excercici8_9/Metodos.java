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

	public static Map<String, ArrayList<Cotxe>> brandCar(Map<String, Cotxe> mapList) {
		//ArrayList<ArrayList<Cotxe>> returnList = new ArrayList<ArrayList<Cotxe>>(); 
		Map<String, ArrayList<Cotxe>> returnListBrand = new TreeMap<String, ArrayList<Cotxe>>();
		
		ArrayList<Cotxe> returnAux = new ArrayList<Cotxe>();

		for (Map.Entry elemento : mapList.entrySet()) {
			Cotxe aux = (Cotxe) elemento.getValue();
			returnAux.add(aux);
		}

//		Collections.sort(returnAux, new Comparator<Cotxe>() {
//			@Override
//			public int compare(Cotxe o1, Cotxe o2) {
//				return o1.getMarca().compareTo(o2.getMarca());
//			}
//		});
		Collections.sort(returnAux);
		System.out.println(returnAux);
		boolean found=true;
		ArrayList<Cotxe> coche = new ArrayList<Cotxe>();
		String key="";
		String keyAux="";
		for (int i = 0; i < returnAux.size()-1; i++) {
			key = returnAux.get(i).getMarca();
			keyAux = returnAux.get(i+1).getMarca();
			while (key.equals(keyAux)&& found) {				
				Cotxe cocheAux =returnAux.get(i);
				System.out.println(cocheAux);
				//coche.add(cocheAux);
				found=false;
			}
			
			if (!found){
				returnListBrand.put(key,coche );
				found=true;
			}
		}
		return returnListBrand;
	}

}
