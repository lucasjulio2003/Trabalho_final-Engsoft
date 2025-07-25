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
			comandos.put("liv", new ConsultarLivro());
			comandos.put("usu", new ConsultarUsuario());
			comandos.put("ntf", new NotificacoesRecebidas());
			comandos.put("obs", new RegistraObservador());
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
				

				if (comando.equals("sai")){
					System.exit(0);
				}
				
				if (parametros.length == 3) {
					CarregadorParametros carregadorParametros = new CarregadorParametros(parametros[1],parametros[2]);
					this.executarComando(comando, carregadorParametros);
				}else{
					CarregadorParametros carregadorParametros = new CarregadorParametros(parametros[1]);
					this.executarComando(comando, carregadorParametros);
				}
				

				//scanner.close();
			}
		}
		

	}
