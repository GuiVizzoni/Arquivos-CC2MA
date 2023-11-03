package exerciciointerface;

public interface Mostra {
static void MostraNome(Pessoa p) {
System.out.println("***> "+p.Nome()+" <***");
}
public static void main(String[] args) {
    
    
Fulano f = new Fulano();
Cicrano c = new Cicrano();
Beltrano b = new Beltrano();

MostraNome(f);
MostraNome(c);
MostraNome(b); 
} 
}



