package com.busqueda.grafos;

public class InformacionGrafo {
	
	private int distancia;
	private int predecesor;
	
	public InformacionGrafo(int distancia, int predecesor) {
		super();
		this.distancia = 0;
		this.predecesor = 0;
	}

	public int getDistancia() {
		return distancia;
	}

	public int getPredecesor() {
		return predecesor;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public void setPredecesor(int predecesor) {
		this.predecesor = predecesor;
	}
	
	
	

}
