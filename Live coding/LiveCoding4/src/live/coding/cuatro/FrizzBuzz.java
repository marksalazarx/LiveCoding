package live.coding.cuatro;

public class FrizzBuzz {

int ultimo = 100; { 

for (int i = 1; i <= ultimo; i++) {

        if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
        } else if ((i % 3) == 0) {
                System.out.println("Fizz");
        } else if ((i % 5) == 0) {
                System.out.println("Buzz");
        } else {
                System.out.println(i); 
        }
        
		}

	}

public int getUltimo() {
	return ultimo;
}

public void setEnd(int ultimo) {
	this.ultimo = ultimo;
}

@Override
public String toString() {
	return "FrizzBuzz";
}

}