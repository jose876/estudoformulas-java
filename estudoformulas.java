import java.util.Scanner;

public class estudoformulas {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int opcaotrigonometria = -1;
        boolean voltar = false;
        while(opcao != 0){
            
            System.out.println("----------SISTEMA----------");
            System.out.println("1 - FUNÇÔES TRIGONOMETRICAS");
            System.out.println("2 - TEOREMA DE PITAGORAS");
            System.out.println("----");
            System.out.println("----");
            System.out.println("----");
            System.out.println("0 - SAIR");

            System.out.println("Digite um opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    voltar = false;
                    while(!voltar){
                    System.out.println("1 - FUNÇAO SENO NO TRIANGULO RETANGULO");
                    System.out.println("2 - FUNÇAO COSSENO NO TRIANGULO RETANGULO");
                    System.out.println("3 - FUNÇAO TANGENTE");
                    System.out.println("4 - VOLTAR");

                    double catetooposto= 0 , catetoadjacente= 0, hipotenusa = 0, seno = 0, cosseno = 0, tangente = 0;
                    System.out.println("Digite uma opção: ");
                         opcaotrigonometria = sc.nextInt();
                            switch(opcaotrigonometria)   {
                                case 1:
                                        System.out.println("                      ");
                                        System.out.println("                      ");
                                        System.out.println("                      ");

                                        System.out.println("DESCOBRINDO O VALOR DE SENO");

                                        while(true){
                                        System.out.println("Digite o valor do cateto oposto");
                                        catetooposto = sc.nextDouble();
                                        System.out.println("Digite o valor da hipotenusa");
                                        hipotenusa = sc.nextDouble();


                                        if (catetooposto >0 && hipotenusa > catetooposto){
                                            break;
                                        }else{
                                            System.out.println("Digite os valores validos");
                                            System.out.println("--------------------------");
                                        }
                                    }
                                    
                                         seno = catetooposto/hipotenusa;
                                         System.out.println("O resultado e: "+ seno);
                                         break;
                                case 2:
                                        System.out.println("                      ");
                                        System.out.println("                      ");
                                        System.out.println("                      ");

                                        System.out.println("DESCOBRINDO O VALOR DE COSSENO");

                                        while(true){
                                        System.out.println("Digite o valor do cateto adjacente");
                                        catetoadjacente = sc.nextDouble();
                                        System.out.println("Digite o valor da hipotenusa");
                                        hipotenusa = sc.nextDouble();


                                        if (catetoadjacente >0 && hipotenusa > catetoadjacente){
                                            break;
                                        }else{
                                            System.out.println("Digite os valores validos");
                                            System.out.println("--------------------------");
                                        }
                                         }
                                    
                                         cosseno = catetoadjacente/hipotenusa;
                                         System.out.println("O resultado e: "+ cosseno);
                                         break;
                                case 3:
                                        System.out.println("                      ");
                                        System.out.println("                      ");
                                        System.out.println("                      ");

                                        System.out.println("DESCOBRINDO O VALOR DE TANGENTE");

                                        while(true){
                                        System.out.println("Digite o valor do cateto oposto");
                                        catetooposto = sc.nextDouble();
                                        System.out.println("Digite o valor do cateto adjacente");
                                        catetoadjacente= sc.nextDouble();


                                        if (catetooposto >0 && catetoadjacente > 0){
                                            break;
                                        }else{
                                            System.out.println("Digite os valores validos");
                                            System.out.println("--------------------------");
                                        }
                                         }
                                    
                                         tangente = catetooposto/catetoadjacente;
                                         System.out.println("O resultado e: "+ tangente);
                                         break;
                                case 4:
                                    System.out.println("Voltando...");
                                    voltar = true;
                                    break;
                                default:
                                    System.out.println("Opção invalida");
                            }
                        }
                break;
                case 2:
                    double catetoa =0 , catetob = 0;
                    System.out.println("DESCOBRINDO O VALOR DE HIPOTENUSA USANDO OS CATETOS");
                    System.out.println("Digite o numero do primeiro cateo? ");
                    catetoa = sc.nextDouble();
                    System.out.println("Digite o numero do segundo cateto?");
                    catetob = sc.nextDouble();
                    double soma = (catetoa * catetoa) + (catetob * catetob);
                    double raiz = 0;
                        while(raiz * raiz < soma){
                            raiz+=0.01;
                        }
                    System.out.printf("O valor de hipotenusa e: %2.2f%n", raiz);
                    System.out.println("VOLTANDO PARA O MENU...");
                    break;

                    default :
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}


