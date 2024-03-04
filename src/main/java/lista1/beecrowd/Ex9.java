/*
 * Copyright (C) 2024 Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lista1.beecrowd;

/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex9
 */
import java.util.*;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//metodo de leitura 
        //declarando e ja lendo a varivel
        int casosTeste = scanner.nextInt();
        //laco de repeticao 
        for (int caso = 0; caso < casosTeste; caso++) {
            int x = scanner.nextInt();
            //condicao para verificar se o numero e perfeito
            if (ehPerfeito(x)) {
                System.out.println(x + " eh perfeito"); //imprimira essa msg caso a condicao do if for atendida
            } else {
                System.out.println(x + " nao eh perfeito"); //caso contrario ira imprimir isso
            }
        }
    }

    //funcao que valida se o numero e perfeito ou nao
    public static boolean ehPerfeito(int num) {
        int soma = 0;
        //calculo baseado nos parametros passados para validar s eo numero e perfeito ou nao
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

}
