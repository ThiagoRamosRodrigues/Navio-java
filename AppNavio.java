import java.util.ArrayList;
import java.util.List;

public class AppNavio {
	
	static List<NavioContainer> listaContainers = new ArrayList<NavioContainer>();
	static List<NavioGraneleiro> listaGraneleiros = new ArrayList<NavioGraneleiro>();
	
	public static void main (String []args) {
		listaContainers.add(new NavioContainer(33, "Bela Fera  ", 2, 100000, " ", 2, 30));
		listaContainers.add(new NavioContainer(48, "Arrecifes  ", 2, 120000, " ", 2, 30));
		listaContainers.add(new NavioContainer(52, "Àguas Belas", 1, 90000 , " ", 0, 25));

		listaGraneleiros.add(new NavioGraneleiro(10, "Estrela do mar ", 1, 50000 , " ", 4));
		listaGraneleiros.add(new NavioGraneleiro(25, "Cruzeiro do sul", 1, 80000 , " ", 6));
		
		
		for(NavioContainer conteiners : listaContainers) {
			System.out.println(conteiners);
		}
		for(NavioGraneleiro graneleiro : listaGraneleiros) {
			System.out.println(graneleiro);
		}
	}
}