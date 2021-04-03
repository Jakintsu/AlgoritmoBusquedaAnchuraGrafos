package com.busqueda.grafos;

import java.util.ArrayList;
import java.util.LinkedList;

public class BusquedaAnchura {

	static ArrayList<InformacionGrafo> realizarBusquedaAnchura(int[][] grafos, int origen) {
		ArrayList<InformacionGrafo> informacionGrafos = new ArrayList<InformacionGrafo>();
		//LinkedList<InformacionGrafo> colaGrafos = new LinkedList<InformacionGrafo>();
		LinkedList<Integer> colaPosiciones = new LinkedList<Integer>();
		for (int i = 0; i < grafos.length; i++) {
			InformacionGrafo informacionGrafo = new InformacionGrafo(0, 0);
			informacionGrafos.add(i, informacionGrafo);
		}

		colaPosiciones.add(origen);

		while (!colaPosiciones.isEmpty()) {

			int vertice = colaPosiciones.poll();

			for (int u = 0; u < grafos[vertice].length; u++) {
				int vecino = grafos[vertice][u];

				if (informacionGrafos.get(vecino).getDistancia() == 0) {

					informacionGrafos.get(vecino).setDistancia(informacionGrafos.get(vertice).getDistancia() + 1);
					informacionGrafos.get(vecino).setPredecesor(vertice);
					colaPosiciones.add(vecino);
				}
			}
		}

		return informacionGrafos;
	}

	public static void main(String[] args) {

		int[][] adjList = { { 1 }, { 0, 4, 5 }, { 3, 4, 5 }, { 2, 6 }, { 1, 2 }, { 1, 2, 6 }, { 3, 5 }, {} };
		ArrayList<InformacionGrafo> info = realizarBusquedaAnchura(adjList, 3);
		for (int i = 0; i < adjList.length; i++) {
			System.out.println("vertice " + i + ": distancia = " + info.get(i).getDistancia() + ", predecesor = "
					+ info.get(i).getPredecesor());
		}

	}

}
