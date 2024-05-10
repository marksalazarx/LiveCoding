package live.coding.tres;


public class MangosNaranjas {
	int mangos;
	int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}

	//Metodo mangosCaja:
	
	public void mangosCaja() {
		int maximo = 0;
		if(this.mangos % 2 == 0) {
			for(int i = 1; i <= (this.mangos/2); i ++) {
				if((this.mangos/2)%i == 0) {
					maximo = i;
				}
			}
			System.out.println("El mcd: " + maximo);
		}else {
			for(int i = 1; i <= ((this.mangos-1)/2); i ++) {
				if(((this.mangos-1)/2)%i == 0) {
					maximo = i;
				}
			}
			System.out.println("El mcd es: " + maximo);
		}
	}
	
	@Override
	public String toString() {
		return "MangosNaranjas [mangos=" + this.mangos + ", naranjas=" + this.naranjas + "]";
	}
	
	
	

}