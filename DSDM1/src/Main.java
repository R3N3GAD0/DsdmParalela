import java.util.ArrayList;
import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			
			
			int gv, tv, op, en,b, x = 0;
		
			String ex;
			
			ArrayList<Moto> listMoto = new ArrayList<Moto>();
			
			ArrayList<Passeio> listPasseio = new ArrayList<Passeio>();
			
			ArrayList<SUV> listSUV = new ArrayList<SUV>();
			
			Moto moto= new Moto();
			Passeio passeio= new Passeio();
			SUV suv= new SUV();
			System.out.println("Digite 1 para entrar no programa e 2 para sair");
			en=input.nextInt();
			while(en == 1) {
			System.out.println("Digite 1 para acessar o Gerenciamento de Ve�culos, digite 2 para acessar o Relatorio dos impostos, digite 3 listar os ve�culos pela ordem de valor e digite 0 para sair");
				op=input.nextInt();
				switch(op){
					case 1:
						do{
							System.out.println("Digite 1 para realizar o cadastro de um ve�culo, 2 para realizar a exclus�o e 0 para poder voltar");
							gv=input.nextInt();
							if(gv==1||gv==2||gv==3){
								do {
									System.out.println("Selecione o ve�culo desejado: Digite 1 para motos, 2 para carros de passeio, 3 para SUV e 0 para poder voltar");
									tv=input.nextInt();
								}while(tv!=0 && tv != 1 && tv != 2 && tv != 3);
								
								
								switch (gv) {
									case 1:
										while(tv != 0) {
										switch (tv) {
											case 1:
												System.out.println("Cadastro de ve�culo, Motos");
																								
												System.out.println("Placa do ve�culo:");
												moto.Placa = input.nextLine(); 
												moto.Placa = input.nextLine();
																								
												System.out.println("Ano de fabrica��o");
												moto.Ano= input.nextLine();
												
												System.out.println("Marca");
												moto.Marca=input.nextLine();
												
												System.out.println("Modelo");
												moto.Modelo=input.nextLine();
												
												System.out.println("Valor");
												moto.Valor=input.nextDouble();
												
												System.out.println("Quilometragem");
												moto.Quilometragem=input.nextDouble();
												
												moto.imposto = moto.Valor * 0.025;
												
												listMoto.add(moto);
												
												System.out.println("O ve�culo: "+ moto.Placa + " foi cadastrado com sucesso!");
												System.out.println("Deseja cadastrar mais ve�culos? Se sim digite 1 para motos, 2 para carros de passeio, 3 para SUV. Se deseja voltar pressione 0.");
											    tv = input.nextInt();
											  
												
												
												break;
										
											
											case 2:
																	
												System.out.println("Cadastro de ve�culo,Passeio");
												
												System.out.println("Placa do ve�culo:");
												passeio.Placa=input.nextLine();
												passeio.Placa = input.nextLine();
												
												System.out.println("Ano de fabrica��o");
												passeio.Ano=input.nextLine();
												
												System.out.println("Marca");
												passeio.Marca=input.nextLine();
												
												System.out.println("Modelo");
												passeio.Modelo=input.nextLine();
												
												System.out.println("Valor");
												passeio.Valor=input.nextDouble();
												
												System.out.println("Quilometragem");
												passeio.Quilometragem=input.nextDouble();
												
												passeio.imposto = passeio.Valor * 0.05;
												
												System.out.println("N�mero de Assentos");
												passeio.Assentos=input.nextInt();
												
												passeio.ValorSePasseio= passeio.Valor * 0.01; 
												
												listPasseio.add(passeio);		
												
												System.out.println("O ve�culo: " + passeio.Placa + " foi cadastrado com sucesso!");
												System.out.println("Deseja cadastrar mais ve�culos? Se sim digite 1 para motos, 2 para carros de passeio, 3 para SUV. Se deseja voltar pressione 0.");
											    tv = input.nextInt();
												
												
												break;
												
											case 3:
												
												
												System.out.println("Cadastro de ve�culo/ SUV");
												
												System.out.println("Placa do ve�culo: ");
												suv.Placa=input.nextLine();
												suv.Placa = input.nextLine();
												
												System.out.println("Ano de fabrica��o:");
												suv.Ano=input.nextLine();
												
												System.out.println("Marca");
												suv.Marca=input.nextLine();
												
												System.out.println("Modelo");
												suv.Modelo=input.nextLine();
												
												System.out.println("Valor");
												suv.Valor=input.nextDouble();
												
												System.out.println("Quilometragem");
												suv.Quilometragem=input.nextDouble();
												
												suv.imposto = suv.Valor * 0.08;
												
												System.out.println("N�mero de Assentos");
												suv.Assentos=input.nextInt();
												
												suv.ValorSeSUV= suv.Valor * 0.015; 
												
												listSUV.add(suv);	
												
												System.out.println("O ve�culo: " + suv.Placa + " foi cadastrado com sucesso!");
												System.out.println("Deseja cadastrar mais ve�culos? Se sim digite 1 para motos, 2 para carros de passeio, 3 para SUV. Se deseja voltar pressione 0.");
											    tv = input.nextInt();
												
												
												break;
										}
										
									}
										
										break;
									
									case 2:
										switch (tv) {
											
											case 1:
												System.out.println("Digite a posi��o do ve�culo que voc� deseja excluir:");	
												x = input.nextInt();
											
						
												
												if(x < listMoto.size() && x >= 0){
													
													System.out.println("DADOS DO VE�CULO/ MOTO" + x);
													
													System.out.println("Placa:" + listMoto.get(x).Placa);
													
													System.out.println("Ano de Fabrica��o:" + listMoto.get(x).Ano);
													
													System.out.println("Marca:" + listMoto.get(x).Marca);
													
													System.out.println("Modelo:" + listMoto.get(x).Modelo);
													
													System.out.println("Valor:" + listMoto.get(x).Valor);
													
													System.out.println("Quilometragem:" + listMoto.get(x).Quilometragem);
													
																					
													System.out.println("Voce confirma a exclus�o? Digite sim ou nao.")	;
													ex = input.nextLine();
													ex = input.nextLine();

													
													if(ex == "sim") {
														listMoto.remove(x);
													}
													
													else if(ex == "nao"){
														
														System.out.println("A moto na posi��o" + x + " n�o ser� exclu�da");
														
													}
												}
												break;
												
											
											case 2:
												System.out.println("Digite a posi��o do ve�culo que voc� deseja excluir:");	
												
												x=input.nextInt();
												
												if(x < listPasseio.size() && x >=0){
													
													System.out.println("DADOS DO VE�CULO/ Carro de passeio" + x);
													
													System.out.println("Placa:" + listPasseio.get(x).Placa);
													
													System.out.println("Ano de Fabrica��o:" + listPasseio.get(x).Ano);
													
													System.out.println("Marca:" + listPasseio.get(x).Marca);
													
													System.out.println("Modelo:" + listPasseio.get(x).Modelo);
													
													System.out.println("Valor:" + listPasseio.get(x).Valor);
													
													System.out.println("Quilometragem:"+ listPasseio.get(x).Quilometragem);
													
													System.out.println("Assentos:" + +listPasseio.get(x).Assentos);
													
													System.out.println("Seguro:" + +listPasseio.get(x).ValorSePasseio);
													
													System.out.println("Voce confirma a exclus�o? Digite sim ou nao.");
													ex = input.nextLine();
													ex = input.nextLine();
													
													if(ex == "sim") {
														listPasseio.remove(x);
														

													}										
													else if(ex == "nao"){
														System.out.println("A moto na posi��o" + x + " n�o ser� exclu�da");
													}
														
														
													}else {
														
														System.out.println("Comando inv�lido");
													}
												}
												
												
												break;
											case 3:
												System.out.println("Digite a posi��o do ve�culo que voc� deseja excluir:");	
												
												x=input.nextInt();

												if(x < listSUV.size() && x >=0){
													
													System.out.println("DADOS DO VE�CULO/ SUV" + x);
													
													System.out.println("Placa:" + listSUV.get(x).Placa);
													
													System.out.println("Ano de Fabrica��o:" + listSUV.get(x).Ano);
													
													System.out.println("Marca:" + listSUV.get(x).Marca);
													
													System.out.println("Modelo:" + listSUV.get(x).Modelo);
													
													System.out.println("Valor:" + listSUV.get(x).Valor);
													
													System.out.println("Quilometragem:"+ listSUV.get(x).Quilometragem);
													
													System.out.println("Assentos:" + +listSUV.get(x).Assentos);
													
													System.out.println("Seguro:" + +listSUV.get(x).ValorSeSUV);
													
													System.out.println("Voce confirma a exclus�o? Digite sim ou nao.");
													ex = input.nextLine();
													ex = input.nextLine();
													
													if(ex == "sim") {
														listSUV.remove(x);
														System.out.println("Ve�culo excluido com sucesso");
													}										
													else if(ex == "nao"){
														System.out.println("A moto na posi��o" + x + " n�o ser� exclu�da");
													}
														
														
													}else {
														
													}
														System.out.println("Comando inv�lido");
														
													}
												}
												break;
										}while(gv == 1 || gv == 2 || gv == 3);
												
						break;
						
					case 2:
					do {
						do {
							System.out.println("Selecione o ve�culo desejado: Digite para motos, 2 para carros de passeio, 3 para SUV e 0 para poder voltar");
							
							tv=input.nextInt();
						}while(tv!=0 && tv != 1 && tv != 2 && tv != 3);
						switch (tv) {
						case 1:
							System.out.println("Imposto Anual sobre Motos");	
								for(int i = 0;i < listMoto.size();i++) {
									int z = 0;
									
									System.out.println("A moto com a placa: " + listMoto.get(z).Placa + " , ano de fabrica��o" + listMoto.get(z).Ano + ", marca " + listMoto.get(z).Marca + " , modelo: " + listMoto.get(z).Modelo + " ter� que pagar R$:" + listMoto.get(z).imposto);
									z = z + 1;
								}break;
						case 2:
							System.out.println("Imposto Anual sobre Carros de Passeio");
							
							for(int i = 0;i < listPasseio.size();i++) {
								int y = 0;
								System.out.println(" O carro de passeio com a placa: " + listPasseio.get(y).Placa + " , ano de fabrica��o " + listPasseio.get(y).Ano + " , marca " + listPasseio.get(y).Marca + ", modelo:" + listPasseio.get(y).Modelo + " ter� que pagar R$: " + listPasseio.get(y).imposto);
								y = y +1;
								
							 	
							}break;
						case 3:
							System.out.println("Imposto Anual sobre SUV");	
							
							for(int i = 0;i < listSUV.size();i++) {
								int k = 0;
								System.out.println(" O SUV com a placa: " + listSUV.get(k).Placa + " , ano de fabrica��o " + listSUV.get(k).Ano + " , marca " + listSUV.get(k).Marca + " , modelo: " + listSUV.get(k).Modelo + " ter� que pagar R$: " + listSUV.get(k).imposto);
							k = k +1;
							}break;
						}
					}while(op != 0);

					case 3:
						do {
							do {
								System.out.println("Selecione o ve�culo desejado: Digite 1 para motos, 2 para carros de passeio, 3 para SUV e 0 para poder voltar");
								
								tv=input.nextInt();
							}while(tv!=0 && tv != 1 && tv != 2 && tv != 3);
							while(tv != 0) {
							switch (tv) {
							
							case 1:
								System.out.println("Motos organizadas da mais cara a mais barata");	
								
									for(int i = 0;i < listMoto.size();i++) {
										  for (int j = 0; j < i; j++) {
										        if (listMoto.get(i).Valor > listMoto.get(j).Valor) {
										            double temp = listMoto.get(i).Valor;
										            listMoto.get(i).Valor = listMoto.get(j).Valor;
										            listMoto.get(j).Valor = temp;
										        }
										    }
										}System.out.println("Deseja checar outro ve�culo? Se sim, digite 1 para motos , 2 para passeio e 3 para SUVS e 0 para voltar");
										tv = input.nextInt();
										for(int i = 0;i < listMoto.size();i++) {
											System.out.println("A moto mais cara � o:" + listMoto.get(i).Placa + " e o seu valor �" + listMoto.get(i).Valor );
										}

										
								break;
							case 2:
								System.out.println("Carros de Passeio organizados do mais cara ao mais barato");	
								
								for(int i = 0;i < listPasseio.size();i++) {
									  for (int j = 0; j < i; j++) {
									        if (listPasseio.get(i).Valor > listPasseio.get(j).Valor) {
									            double temp = listPasseio.get(i).Valor;
									            listPasseio.get(i).Valor = listPasseio.get(j).Valor;
									            listPasseio.get(j).Valor = temp;
									        }
									    }
									}System.out.println("Deseja checar outro ve�culo? Se sim, digite 1 para motos , 2 para passeio e 3 para SUVS e 0 para voltar");
									tv = input.nextInt();
									for(int i = 0;i < listPasseio.size();i++) {
										System.out.println("O carro de passeio mais caro � o:" + listPasseio.get(i).Placa + " e o seu valor �" + listPasseio.get(i).Valor );
									}
								break;
							case 3:
								System.out.println("SUVS organizados do mais caro ao mais barato");	
								
								for(int i = 0;i < listSUV.size();i++) {
									  for (int j = 0; j < i; j++) {
									        if (listSUV.get(i).Valor > listSUV.get(j).Valor) {
									            double temp = listSUV.get(i).Valor;
									            listSUV.get(i).Valor = listSUV.get(j).Valor;
									            listSUV.get(j).Valor = temp;
									        }
									    }
									}System.out.println("Deseja checar outro ve�culo? Se sim, digite 1 para motos , 2 para passeio e 3 para SUVS e 0 para voltar");
									tv = input.nextInt();
										
										
									

								
							break;
							}
							}
						}while(op !=0);
					case 0:
						do {
						System.out.println("Voltando");
						System.out.println("Voce deseja realizar mais alguma opera��o? Se sim, digite 1, se n�o digite qualquer n�mero excluindo 1");
						en = input.nextInt();
						if (en != 1) {
							System.out.println("Fechando o programa");
						}
						
						break;		
						}while(op >= 0);
						
						
			}
		}
	}
}

 

	
			

         