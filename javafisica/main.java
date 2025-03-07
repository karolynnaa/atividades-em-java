package javafisica;

import java.util.Scanner;

public class main {
    public static void mai(String args[]) {
        // declaração de variáveis
        int opcao = 1;
        int escolha;
        int cin;
        int din;
        int cal;
        int term;
        int elet;
        // declaração dos valores
        double espacoFinal; // espaço final
        double espacoInicial; // espaço inicial
        double tempoFinal; // tempo final
        double tempoInicial ; // tempo inicial
        double velocidadeMedia; // velocidade média
        double velocidadeInicial; // velocidade inicial
        double velocidadeFinal; // velocidade final
        double aceleracao; // aceleração
        double forcaResultante; // força resultante
        double massa; // massa
        double forcaPeso; // força peso
        double quantidadeCalor; // quantidade de caloria recebda
        double calorEspecifico; // calor especificp
        double temperaturaFinal; // temperatura final
        double temperaturaInicial; // temperatura inicial
        int gravidadeTerra = 10; // aceleração da gravidade na terra
        double calorLatente; // calor latente
        double capacidadeTermica; // capacidade térmica
        double grausCelsius; // celsius
        double grausFahrenheit;// fahrenheit
        double grausKelvin; // kelvin
        double potenciaEletrica; // poência elétrica
        double correnteEletrica; // corrente elétrica
        double tensaoEletrica; // tensao
        double resistenciaEletrica; // resistencia

        while (opcao != 0) {
            Scanner ler = new Scanner(System.in);
            System.out.printf("BEM-VINDO(A) A CALCULADORA DE FÍSICA\n");
            System.out.printf(
                    "Com qual área da física você precisa: \n [1]Cinemática \n [2]Dinâmica \n [3]Calorimetria \n [4]Escalas termométricas \n [5]Eletrodinâmica ");

            escolha = ler.nextInt();

            if (escolha == 1) {
                System.out.println("Fórmulas dispoíveis em CINEMÁTICA: \n");
                System.out.println("[1]V = ΔS/Δt\n");
                System.out.println("[2]a = Δv/Δt\n");
                System.out.println("[3]S = Si + vi * Δt\n");
                System.out.println("[4]V = Vi + a * Δt\n");
                System.out.println("[5]S = Si + vi * Δt + (a*Δt²/2)\n");
                System.out.println("[6]V² = Vi² + 2a * ΔS \n");
                cin = ler.nextInt();
                switch (cin) {
                    case 1:
                        System.out.println("Então você escolheu a fórmula da VELOCIDADE MÉDIA.");
                        System.out.println(
                                "A VELOCIDADE MÉDIA(m/s) é a razão entre a distância percorrida(m) em uma variação de tempo(s)");
                        System.out.println("Esta fórmula está inserida no Movimento Retilínio Uniforme(MRU)");
                        System.out.println("Qual o valor da distância inicial(S0) em metros?");
                        espacoInicial = ler.nextDouble();
                        System.out.println("Qual o valor da distância final(S) em metros?");
                        espacoFinal = ler.nextDouble();
                        System.out.println("Qual o valor do tempo inicial(t0) em segundos?");
                        tempoInicial = ler.nextDouble();
                        System.out.println("Qual o valor do tempo final(t) em segundos?");
                        tempoFinal = ler.nextDouble();
                        velocidadeMedia = (espacoFinal - espacoInicial) / (tempoFinal - tempoInicial);
                        System.out.println("Resultado: V = " + velocidadeMedia + "m/s\n");
                        break;
                    case 2:
                        System.out.println("Então você escolheu a fórmula da ACELERAÇÃO MÉDIA.\n");
                        System.out.println(
                                "A ACELERAÇÃO MÉDIA(m/s²) é a razão entre a variação da velocidade(m/s) em uma variação de tempo(s)\n");
                        System.out.println("Esta fórmula está inserida no Movimento Uniformemente Variado(MUV)\n");
                        System.out.println("Qual o valor da velocidade inicial(v0) em metros por segundo?");
                        velocidadeInicial = ler.nextDouble();
                        System.out.println("Qual o valor da velocidade final(v) em metros por segundo?");
                        velocidadeFinal = ler.nextDouble();
                        System.out.println("Qual o valor do tempo inicial(t0) em segundos?");
                        tempoInicial = ler.nextDouble();
                        System.out.println("Qual o valor do tempo final(t) em segundos?");
                        tempoFinal = ler.nextDouble();
                        aceleracao = (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial);
                        System.out.println("Resultado: V = " + aceleracao + "m/s²\n");
                        break;
                    case 3:
                        System.out.println("Então você escolheu a fórmula da FUNÇÃO HORÁRIA DA POSIÇÃO.\n");
                        System.out.println(
                                "A FUNÇÃO HORÁRIA DA POSIÇÃO(s) é uma função que relaciona a posição inicial, a velocidade e a variação de tempo para achar a posição final.\n");
                        System.out.println("Esta fórmula está inserida no Movimento Retilíneo Uniforme(MRU)\n");
                        System.out.println("Qual o valor da velocidade inicial(v0) em metros por segundo?");
                        velocidadeInicial = ler.nextDouble();
                        System.out.println("Qual o valor da posição inicial(m) em metros?");
                        espacoInicial = ler.nextDouble();
                        System.out.println("Qual o valor do tempo inicial(t0) em segundos?");
                        tempoInicial = ler.nextDouble();
                        System.out.println("Qual o valor do tempo final(t) em segundos?");
                        tempoFinal = ler.nextDouble();
                        espacoFinal = espacoInicial + velocidadeInicial * (tempoFinal - tempoInicial);
                        System.out.println("Resultado: S = " + espacoFinal + "m\n");
                        break;
                    case 4:
                        System.out.println("Então você escolheu a fórmula da FUNÇÃO HORÁRIA DA VEOCIDADE.\n");
                        System.out.println(
                                "A FUNÇÃO HORÁRIA DA VELOCIDADE(m/s) é uma função que relaciona a velocidade inicial, a aceleração e a variação de tempo para achar a posição final.\n");
                        System.out.println("Esta fórmula está inserida no Movimento Uniformemente Variado(MUV)\n");
                        System.out.println("Qual o valor da velocidade inicial(v0) em metros por segundo?");
                        velocidadeInicial = ler.nextDouble();
                        System.out.println("Qual o valor da aceleração(a) em metros por segundo ao quadrado?");
                        aceleracao = ler.nextDouble();
                        System.out.println("Qual o valor do tempo inicial(t0) em segundos?");
                        tempoInicial = ler.nextDouble();
                        System.out.println("Qual o valor do tempo final(t) em segundos?");
                        tempoFinal = ler.nextDouble();
                        velocidadeFinal = velocidadeInicial + aceleracao * (tempoFinal - tempoFinal);
                        System.out.println("Resultado: V = " + velocidadeFinal + "m/s\n");
                        break;
                    case 5:
                        System.out.println("Então você escolheu a fórmula da FUNÇÃO HORÁRIA DA POSIÇÃO NO MUV.\n");
                        System.out.println(
                                "A FUNÇÃO HORÁRIA DA POSIÇÃO NO MUV(m) é uma função que relaciona a posição inicial, a velocidade inicical e a variação de tempo junto.\n");
                        System.out.println("Esta fórmula está inserida no Movimento Uniformemente Variado(MUV)\n");
                        System.out.println("Qual o valor da posição inicial(s0) em metros?");
                        espacoInicial = ler.nextDouble();
                        System.out.println("Qual o valor da velocidade inicial(v0) em metros por segundo?");
                        velocidadeInicial = ler.nextDouble();
                        System.out.println("Qual o valor do tempo inicial(t0) em segundos?");
                        tempoFinal = ler.nextDouble();
                        System.out.println("Qual o valor do tempo final(t) em segundos?");
                        tempoFinal = ler.nextDouble();
                        System.out.println("Qual o valor da aceleração(a) em metros por segundos ao quadrado?");
                        aceleracao = ler.nextDouble();
                        espacoFinal = espacoInicial + velocidadeInicial * (tempoFinal - tempoFinal) + (aceleracao * Math.pow(tempoFinal - tempoFinal, 2) / 2);
                        System.out.println("Resultado: S = " + espacoFinal + "m\n");
                        break;
                    case 6:
                        System.out.println("Então você escolheu a EQUAÇÃO DE TORRINCELLI.\n");
                        System.out.println(
                                "A EQUAÇÃO DE TORRINCELLI(m/s) é uma equação que relaciona velocidade inicial, a aceleração, a distânica percorrida, sem necessitar da variação de tempo, para achar a velocidade final.\n");
                        System.out.println("Esta fórmula está inserida no Movimento Uniformemente Variado(MUV)\n");
                        System.out.println("Qual o valor da velocidade inicial(v0) em metros?");
                        velocidadeInicial = ler.nextDouble();
                        System.out.println("Qual o valor da aceleração(a) em metros por segundos ao quadrado?");
                        aceleracao = ler.nextDouble();
                        System.out.println("Qual o valor a distância inicial(s0) em segundos?");
                        espacoInicial = ler.nextDouble();
                        System.out.println("Qual o valor a distância final(s) em segundos?");
                        espacoFinal = ler.nextDouble();
                        velocidadeFinal = Math.sqrt(Math.pow(velocidadeInicial, 2) + 2 * aceleracao * (espacoFinal - espacoInicial));
                        System.out.println("Resultado: S = " + velocidadeFinal + "m/s\n");
                        break;
                }
            } else if (escolha == 2) {
                System.out.println("Fórmulas dispoíveis em DINÂMICA: \n");
                System.out.println("[1]F = m * a\n");
                System.out.println("[2]P = m * g\n");
                din = ler.nextInt();
                switch (din) {
                    case 1:
                        System.out.println("Então você escolheu a FÓRMULA DA FORÇA RESULTANTE\n");
                        System.out
                                .println("A Força resultente(N) é  produto entre a aceleração e a massa de um corpo\n");
                        System.out.println("Qual o valor da aceleração(a) em metros por segundo?");
                        aceleracao = ler.nextDouble();
                        System.out.println("Qual o valor da massa(m) em gramas?");
                        massa = ler.nextDouble();
                        forcaResultante = massa * aceleracao;
                        System.out.println("Resultado: F = " + forcaResultante + "N\n");
                        break;
                    case 2:
                        System.out.println("Então você escolheu a FÓRMULA DA FORÇA PESO\n");
                        System.out.println(
                                "A Força Peso(P) é  produto entre a aceleração da terra e a massa de um corpo\n");
                        System.out.println("Qual o valor da massa(m) em gramas?");
                        massa = ler.nextDouble();
                        forcaPeso = massa * gravidadeTerra;
                        System.out.println("Resultado: P = " + forcaPeso + "N\n");
                        break;
                }
            } else if (escolha == 3) {
                System.out.println("Fórmulas dispoíveis em CALORIMETRIA: \n");
                System.out.println("[1]Q = m * c * ΔT\n");
                System.out.println("[2]Q = m * L\n");
                System.out.println("[3]C = Q / ΔT \n");
                cal = ler.nextInt();
                switch (cal) {
                    case 1:
                        System.out.println("Então você escolheu a fórmula do CALOR SENSÍVEL\n");
                        System.out.println(
                                "O Calor Sensível corresponde à quantidade de calor fornecida a um corpo que gera apenas variações de temperatura, sem produzir mudanças de fase.\n");
                        System.out.println("Qual o valor da massa(m) em gramas?");
                        massa = ler.nextDouble();
                        System.out.println("Qual o valor do calor específico da substância?");
                        calorEspecifico = ler.nextDouble();
                        System.out.println("Qual o valor da temperatura inicial em graus Celsius(ºC)?");
                        temperaturaFinal = ler.nextDouble();
                        System.out.println("Qual o valor da temperatura final em graus Celsius(ºC)?");
                        temperaturaInicial = ler.nextDouble();
                        quantidadeCalor = massa * calorEspecifico * (temperaturaFinal - temperaturaInicial);
                        System.out.println("Resultado: Q = " + quantidadeCalor + "cal\n");
                        break;
                    case 2:
                        System.out.println("Então você escolheu a fórmula do CALOR LATENTE\n");
                        System.out.println(
                                "Calor latente é a quantidade de energia térmica que é absorvida ou cedida por um corpo ou sistema termodinâmico, durante uma mudança de seu estado físico, em temperatura constante.\n");
                        System.out.println("Qual o valor da massa(m) em gramas?");
                        massa = ler.nextDouble();
                        System.out.println("Qual o valor do calor Latente?");
                        calorLatente = ler.nextDouble();
                        quantidadeCalor = massa * calorLatente;
                        System.out.println("Resultado: Q = " + quantidadeCalor + "cal\n");
                        break;
                    case 3:
                        System.out.println("Então você escolheu a fórmula do CAPACIDADE TÉRMICA\n");
                        System.out.println(
                                "A capacidade térmica é uma grandeza física que diz a quantidade de calor que um corpo precisa para variar a sua temperatura em 1 ºC\n");
                        System.out.println("Qual o valor da quantidade de calorias recebeida(Q) pelo corpo em cal?");
                        quantidadeCalor = ler.nextDouble();
                        System.out.println("Qual o valor da temperatua final?");
                        temperaturaFinal = ler.nextDouble();
                        System.out.println("Qual o valor da temperatua inicial?");
                        temperaturaInicial = ler.nextDouble();
                        capacidadeTermica = quantidadeCalor / (temperaturaFinal - temperaturaInicial);
                        System.out.println("Resultado: C = " + capacidadeTermica + "cal/ºC\n");
                        break;
                }
            } else if (escolha == 4) {
                System.out.println("Fórmulas dispoíveis em ESCALAS TERMÉTRICAS: \n");
                System.out.println("[1]K = C + 273\n");
                System.out.println("[2]C = K - 273\n");
                System.out.println("[3]F = (9C/5) + 32 \n");
                System.out.println("[4]C = (F - 32) * 5/9 \n");
                term = ler.nextInt();
                switch (term) {
                    case 1:
                        System.out.println("Então você escolheu a transformar CELSIUS EM KELVIN\n");
                        System.out.println("Quantos graus celsius você quer transformar em Kelvin?");
                        grausCelsius = ler.nextDouble();
                        grausKelvin = grausCelsius + 273;
                        System.out.println("Resultado: K = " + grausKelvin + "ºK\n");
                        break;
                    case 2:
                        System.out.println("Então você escolheu a transformar KELVIN EM CELSIUS\n");
                        System.out.println("Quantos graus kelvin você quer transformar em celsius?");
                        grausKelvin = ler.nextDouble();
                        grausCelsius = grausKelvin - 273;
                        System.out.println("Resultado: K = " + grausKelvin+ "ºK\n");
                        break;
                    case 3:
                        System.out.println("Então você escolheu a transformar CELSIUS EM FAHRENHEIT\n");
                        System.out.println("Quantos graus celsius você quer transformar em Fahrenheit?");
                        grausCelsius = ler.nextDouble();
                        grausFahrenheit = (9 * grausCelsius) / 5 + 32;
                        System.out.println("Resultado: F = " + grausFahrenheit + "ºF\n");
                        break;
                    case 4:
                        System.out.println("Então você escolheu a transformar FAHRENHEIT EM CELSIUS\n");
                        System.out.println("Quantos graus farenheit você quer transformar em celsius?");
                        grausFahrenheit = ler.nextDouble();
                        grausCelsius = (grausFahrenheit - 32) * 5 / 9;
                        System.out.println("Resultado: C = " + grausCelsius + "ºC\n");
                        break;
                }
            } else if (escolha == 5) {
                System.out.println("Fórmulas dispoíveis em ELETRODINÂMICA: \n");
                System.out.println("[1]P = U * I\n");
                System.out.println("[2]P = R * I²\n");
                System.out.println("[3]P = U² / R \n");
                elet = ler.nextInt();
                switch (elet) {
                    case 1:
                        System.out.println(
                                "Então você escolheu a transformar a fórmula da equação fundamental da potência elétrica em um circuito elétrico\n");
                        System.out.println("Insira o valor da tensão em volts?");
                        tensaoEletrica = ler.nextDouble();
                        System.out.println("Insira o valor da corrente em amperes?");
                        correnteEletrica = ler.nextDouble();
                        potenciaEletrica = tensaoEletrica * correnteEletrica;
                        System.out.println("Resultado: P = " + potenciaEletrica + "W\n");
                        break;
                    case 2:
                        System.out.println(
                                "Então você escolheu a transformar a fórmula da potência dissipada em um resistor devido ao efeito Joule\n");
                        System.out.println("Insira o valor da resistênica em ohms?");
                        resistenciaEletrica = ler.nextDouble();
                        System.out.println("Insira o valor da corrente em amperes?");
                        correnteEletrica = ler.nextDouble();
                        potenciaEletrica = resistenciaEletrica * Math.pow(correnteEletrica, 2);
                        System.out.println("Resultado: P = " + potenciaEletrica + "W\n");
                        break;
                    case 3:
                        System.out.println(
                                "Então você escolheu a transformar a fórmula da potência dissipada em um resistor quando se conhece a tensão aplicada e a resistência\n");
                        System.out.println("Insira o valor da tensão em volts?");
                        tensaoEletrica = ler.nextDouble();
                        System.out.println("Insira o valor da resistência em ohms?");
                        resistenciaEletrica = ler.nextDouble();
                        potenciaEletrica = Math.pow(tensaoEletrica, 2) / resistenciaEletrica;
                        System.out.println("Resultado: P = " + potenciaEletrica + "W\n");
                        break;
                }
            } else if (escolha == 0) {
                opcao = 0;
            } else {
                System.out.println("Digite um valor válido!");
            }
            ler.close();
        }
        System.out.println("Obrigado por utilizar nosso sistema, volte se precisar!");
    }
}