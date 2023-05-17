package controller;

import matheus.ListaObject.ListaObject;
import model.Num;

public class EspalhamentoControll 
{
	
	private ListaObject[] lista;
	private int[] vetor;
	
	public EspalhamentoControll()
	{
		int tamanhoVet = (int) ((Math.random() * 81) + 20);
		lista = new ListaObject[2];
		vetor = new int[tamanhoVet];
		iniciaLista();
		iniciaVet();
	}
	
	private void iniciaLista()
	{
		int tamanho = lista.length;
		for (int i = 0; i < tamanho; i++)
		{
			lista[i] = new ListaObject();
		}
	}
	
	private void iniciaVet()
	{
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++)
		{
			vetor[i] = (int) ((Math.random() * 101) + 1);
		}
	}
	
	public void criaListaAleatoria() throws Exception
	{
		
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++)
		{
			Num numero = new Num(vetor[i]);
			int posicao = numero.hashCode();
			
			if(lista[posicao].isEmpty())
			{
				lista[posicao].addFirst(numero);
			}
			else
			{
				lista[posicao].addLast(numero);
			}
		}
		
		
	}
	
	public void listar() throws Exception
	{
		int tamanho = lista.length;
		
		for (int i = 0; i < tamanho; i++)
		{
			int tamanho1 = lista[i].size();
			for (int j = 0; j < tamanho1; j++)
			{
				Num n = (Num) lista[i].get(j);
				System.out.println(n.toString());
				
			}
			
			
		}
		
		
		
	}
	
	
}
