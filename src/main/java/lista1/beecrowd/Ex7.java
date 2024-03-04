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
 * @brief Class Ex7
 */
import java.util.*;

public class Ex7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //metodo para leitura de dados informado pelo usuario

        //um laco de repeticao que ira repetir ate que seja falso ou brecado/parado/interrompido
        while (true) {
            //leitura de dados das variaveis
            int x = ler.nextInt();
            int y = ler.nextInt();
            //verificando as condicoes
            if (x == 0 || y == 0) {
                break;//comando para interromper o codigo inteiro
            }
            //condicao de validacao
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }

    }

}
