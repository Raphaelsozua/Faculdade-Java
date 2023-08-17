import java.util.ArrayList;
public class App {
    public static void main(String[] args){
       ArrayList<String> listaPessoas = new ArrayList<>();
       
       listaPessoas.add("rogerio");
       listaPessoas.add("Paulo");
       listaPessoas.add("Maria");
       listaPessoas.add("João");
       listaPessoas.add("Benedito");
       
        System.out.println("EXIBIR PESSOAS CONTIDAS NA LISTA");
            for(int i=0; i<listaPessoas.size();i++){
                String aux = listaPessoas.get(i);
                System.out.println(aux);
                
                int posicao = listaPessoas.indexOf("João");
                
                listaPessoas.set(posicao, "Tião");
                
                listaPessoas.remove("benedito");
                listaPessoas.remove(1);
            }
       
    }
}
