public class Main {
	
	public static void main(String[] args) {
			
		Messi a = new Messi();
		Messi b = new Messi();
		Messi c = new Messi();
		
		a.setEquipo(new Manchester());
		b.setEquipo(new Barcelona());
		c.setEquipo(new Juventus());
		
		a.mostrarEquipo();
		b.mostrarEquipo();
		c.mostrarEquipo();
	}

}
