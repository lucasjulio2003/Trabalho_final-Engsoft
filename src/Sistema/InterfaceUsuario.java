package Sistema;

import java.util.HashMap;
import java.util.Scanner;

import Comandos.*;

public class InterfaceUsuario {
	private HashMap<String,Comando> comandos = new HashMap<String,Comando>();

	
	
	public InterfaceUsuario() {
        inicializarComandos();
    }

    private void inicializarComandos() {
		comandos.put("emp", new ComandoEmprestar());
		comandos.put("res", new ComandoReservar());
		comandos.put("dev", new ComandoDevolver());
	}
	
	public void executarComando(String strComando, CarregadorParametros parametros) {
		Comando comando = comandos.get(strComando);
		comando.executar(parametros);
	}
	
	public void lerComandos(){

		while (true){

			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite seu comando:");
			String input = scanner.nextLine();

			String[] parametros = input.split(" ");
			//System.out.println("Comando inválido. Use o formato: comando parametro1 parametro2");

			String comando = parametros[0];
			System.out.println("Parametros:" + parametros[1] + " " + parametros[2]);

			if (comando == "sai"){
				System.exit(0);
			}

			CarregadorParametros carregadorParametros = new CarregadorParametros(parametros[1], parametros[2]);
			
			System.out.println(carregadorParametros);
			
			this.executarComando(comando, carregadorParametros);

			scanner.close();
		}
	}
	

}
