package arraylistestudo;
import java.util.ArrayList;
public class Testa {

	public static void main(String[] args) {
/*ArrayList<Integer>numeros = new ArrayList<>();
numeros.add(1);
numeros.add(2);
numeros.add(10);

int soma = 0;

for (int num: numeros) {
	soma += num;
}

System.out.println(soma);*/
		
/*	ArrayList<Integer>numeros = new ArrayList<>();
	numeros.add(75);
	numeros.add(12);
	numeros.add(87);
	 int maior = numeros.get(0);
	for (int i = 1 ; i <numeros.size(); i++) {
		int atual = numeros.get(i);
		
		if(atual > maior) {
		maior = atual;
		}
	
		
	}
	System.out.println(maior);*/

/*ArrayList<Integer>numeros = new ArrayList<>();

numeros.add(75);
numeros.add(12);
numeros.add(87);
numeros.add(4);
numeros.add(8);

ArrayList<Integer>impares = new ArrayList<>();
for(int num: numeros) {
	if(num %2 != 0) {
		impares.add(num);
	}
}
numeros.clear();
numeros.addAll(impares);

System.out.println(numeros);*/
		
ArrayList<Integer>numeros = new ArrayList<>();
numeros.add(1);
numeros.add(2);
numeros.add(3);
numeros.add(4);

ArrayList<Integer>inverso = new ArrayList<>();
int tamanho = numeros.size();
for (int i = tamanho - 1; i >= 0; i--) {
    inverso.add(numeros.get(i));
}
numeros.clear();
numeros.addAll(inverso);

System.out.println(numeros);


	}

}
