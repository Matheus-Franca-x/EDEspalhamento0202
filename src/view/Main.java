package view;

import controller.EspalhamentoControll;

public class Main {

	public static void main(String[] args) 
	{
		EspalhamentoControll controll = new EspalhamentoControll();
		
		try {
			controll.criaListaAleatoria();
			controll.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
