import javax.swing.JOptionPane;

public class Fila {

	private Livro [] data;
	private int finalFila;
	
	public Fila(int n) {
		finalFila = 0;
		data = new Livro[n];
	}
	
	public void enqueue(Livro tal) {
		if(finalFila<data.length) {
			data[finalFila] = tal;
			finalFila++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Fila cheia");
		}
	}
	 public Livro dequeue() {
		 Livro tal = null;
		 if(finalFila > 0) {
			 	tal = data[0];
				for(int i = 0; i<data.length-1; i++) {
					data[i] = data[i+1];
				}
				data[finalFila-1] = null;
				finalFila--;
				return tal;
			}
			else {
				System.out.println("Não há elementos na lista");
				return tal;
			}
	 }
	
	 public String print() {
		 String aux = "";
		 for(int i = 0 ; i<finalFila; i++) {
			 aux = aux + "\n" + "Título: " + data[i].getTitle() + ", Exemplares: " + data[i].getQtdLivros();
		 }
		 return aux;
	 }
	
}
