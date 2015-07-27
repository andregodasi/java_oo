/**
 * Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 5. Faça um programa que seja capaz de imprimir no console o valor por extenso de um número 
 * inteiro recebido como parâmetro. O valor recebido deve estar no intervalo [0,49]. Valores 
 * maiores ou menores devem ser desconsiderados e uma mensagem apropriada deve ser exibida;
 */
package lista3exercicio5andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista3exercicio5andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
            try{
            System.out.println("Digite um numero entre 0 e 49");
                Scanner scn = new Scanner(System.in);
                num = scn.nextInt();
                while (num < 0 || num > 49) { 
                    System.out.println("Digite um numero entre 0 e 49");
                    
                }
                for(int j=0;j<2;j++){
                    if(num == 0){
                        System.out.printf("zero \n");
                        break;
                    }else if(num == 1){
                        System.out.printf("um \n");
                        break;
                    }else if(num == 2){
                        System.out.printf("dois \n");
                        break;
                    }else if(num == 3){
                        System.out.printf("três \n");
                        break;
                    }else if(num == 4){
                        System.out.printf("quatro \n");
                        break;
                    }else if(num == 5){
                        System.out.printf("cinco \n");
                        break;
                    }else if(num == 6){
                        System.out.printf("seis \n");
                        break;
                    }else if(num == 7){
                        System.out.printf("sete \n");
                        break;
                    }else if(num == 8){
                        System.out.printf("oito \n");
                        break;
                    }else if(num == 9){
                        System.out.printf("nove \n");
                        break;
                    }else if(num == 10){
                        System.out.printf("dez \n");
                        break;
                    }else if(num == 11){
                        System.out.printf("onze \n");
                    }else if(num == 12){
                        System.out.printf("doze \n");
                        break;
                    }else if(num == 13){
                        System.out.printf("treze \n");
                        break;
                    }else if(num == 14){
                        System.out.printf("catorze \n");
                        break;
                    }else if(num == 15){
                        System.out.printf("quinze \n");
                        break;
                    }else if(num == 16){
                        System.out.printf("dezesseis \n");
                        break;
                    }else if(num == 17){
                        System.out.printf("dezessete \n");
                    }else if(num == 18){
                        System.out.printf("dezoito \n");
                        break;
                    }else if(num == 19){
                        System.out.printf("dezenove \n");
                        break;
                    }else if((num/10)>=2.0 && (num/10)<=2.9){
                        System.out.printf("vinte");
                        if((num%10)!=0){
                            num = num%10;
                            System.out.printf(" e ");
                        }else{
                            System.out.printf("\n");
                            break;
                        }
                    }else if((num/10)>=3.0 && (num/10)<=3.9){
                        System.out.printf("trinta");
                        if((num%10)!=0){
                            num = num%10;
                            System.out.printf(" e ");
                        }else{
                            System.out.printf("\n");
                            break;
                        }
                    }else if((num/10)>=4.0 && (num/10)<=4.9){
                        System.out.printf("quarenta");
                        if((num%10)!=0){
                            num = num%10;
                            System.out.printf(" e ");
                        }else{
                            System.out.printf("\n");
                            break;
                        }
                    }
                }
                
            }catch(Exception e){
                System.out.println("Digite os dados corretos.");
            }
        
    }
    
}
