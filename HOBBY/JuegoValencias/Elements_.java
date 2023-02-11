package JuegoValencias;

public class Elements_ implements Comparable{
	
	private String nombre;
	private String simbolo;
	private String grupo;
	private int numero_atomico;
	private double masa_atomica;
	private String valencias;
	private boolean ebau;
	private boolean repe;
	
	public Elements_(String nombre,String simbolo,String grupo,int numero_atomico,double masa_atomica,String valencias,boolean ebau,boolean repe){
		
		this.nombre=nombre;
		this.simbolo=simbolo;
		this.grupo=grupo;
		this.numero_atomico=numero_atomico;
		this.masa_atomica=masa_atomica;
		this.valencias=valencias;
		this.ebau=ebau;
		this.repe=repe;
	}
	
	public String dime_nombre() {
		
		return nombre;
		
	}
	public String dime_simbolo() {
		
		return simbolo;
		
	}
	public String dime_grupo() {
		
		return grupo;
		
	}
	public int dime_numero_atomico() {
		
		return numero_atomico;
		
	}
	public double dime_masa_atomica() {
		
		return masa_atomica;
		
	}
	public String dime_valencias() {
		
		return valencias;
		
	}
	public boolean dime_ebau() {
		
		return ebau;
		
	}
	public boolean dime_repe() {
		
		return repe;
		
	}
	
	
	public void set_repe() {
		
		repe=true;
		
	}
	
    public int compareTo(Object o) {
    	
    	Elements_ p=(Elements_) o;
    	
        if (this.numero_atomico < p.numero_atomico) {
            return -1;
        }
        if (this.numero_atomico > p.numero_atomico) {
            return 1;
        }
        return 0;
    }

	
}

