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
 * @brief Class Ex4
 */
import java.util.*;

public class Ex4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // metodo para entrada de dados pelo usuario
        //declarando variavel
        double num;
        num = ler.nextDouble(); //ler a varivel

        //verificacao para ver se o numero informado esta entre os parametros abaixo
        if (num >= 0 && num <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (num > 25 && num <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (num > 50 && num <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (num > 75 && num <= 100) {
            System.out.println("Intervalo (75,100]");

        } else {
            System.out.println("Fora de intervalo");
        }
    }

}
