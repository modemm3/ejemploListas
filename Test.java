/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure;

/**
 *
 * @author developer
 */
public class Test {

    private static final Integer dimension = 4;
    Info[][] elementos = new Info[dimension][dimension];

    void printArray() {
        for (int i = 0; i < dimension - 1; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("" + elementos[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public int combinaciones() {
        int contador = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {

                String letra = elementos[i][j].getDato();
                String letra2 = elementos[i + 1][j].getDato();

                if (letra.equals("C")) {
                    if (letra2.equals("F")) {
                        if (j == 3) {
                            if (!elementos[i][j].getRevisado() && !elementos[i + 1][j].getRevisado()) {
                                contador++;
                            }

                        } else {
                            contador++;
                        }
                        elementos[i][j].setRevisado(true);
                        elementos[i + 1][j].setRevisado(true);

                    }
                }
                if (letra.equals("F")) {
                    if (letra2.equals("C")) {
                        if (j == 3) {
                            if (!elementos[i][j].getRevisado() && !elementos[i + 1][j].getRevisado()) {
                                contador++;
                            }

                        } else {
                            contador++;
                        }
                        elementos[i][j].setRevisado(true);
                        elementos[i + 1][j].setRevisado(true);
                    }
                }
                if (letra.equals("B")) {
                    if (letra2.equals("S")) {
                        if (j == 3) {
                            if (!elementos[i][j].getRevisado() && !elementos[i + 1][j].getRevisado()) {
                                contador++;
                            }

                        } else {
                            contador++;
                        }
                        elementos[i][j].setRevisado(true);
                        elementos[i + 1][j].setRevisado(true);
                    }
                }
                if (letra.equals("S")) {
                    if (letra2.equals("B")) {
                        if (j == 3) {
                            if (!elementos[i][j].getRevisado() && !elementos[i + 1][j].getRevisado()) {
                                contador++;
                            }

                        } else {
                            contador++;
                        }
                        elementos[i][j].setRevisado(true);
                        elementos[i + 1][j].setRevisado(true);
                    }
                }

            }
        }
        return contador;
    }

    public static void main(String[] args) {

        Test t = new Test();
        String codigos = "CFCBSFFSBCCB";
        int contador = 0;
        for (int i = 0; i < dimension - 1; i++) {
            for (int j = 0; j < dimension; j++) {
                t.elementos[i][j] = new Info();
                t.elementos[i][j].setDato(String.valueOf(codigos.charAt(contador)));
                contador++;
            }
        }
        
        System.out.println("Combinaciones: " + t.combinaciones());
        t.printArray();
    }

}
