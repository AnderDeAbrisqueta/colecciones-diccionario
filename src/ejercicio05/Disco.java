package ejercicio05;

public class Disco {
	private String codigo;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;//En minutos
	
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor.toLowerCase();
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo.toLowerCase();
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero.toLowerCase();
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		String elementos = "\n------------------------";
		elementos += "\nCódigo: " + this.codigo;
		elementos += "\nAutor: " + this.autor;
		elementos += "\nTítulo: " + this.titulo;
		elementos += "\nGénero: " + this.genero;
		elementos += "\nDuración: " + this.duracion;
		
		return elementos;
	}
	
	@Override
	public boolean equals(Object d) {
		return (this.codigo).equals(((Disco)d).getCodigo());
		}

}
