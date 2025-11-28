/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokogundar;

/**
 *
 * @author Shalwa Rahgiant
 */
public class Main {
    public static void main(String[] args) {
        User pengguna1 = new Admin("Rudi");
        User pengguna2 = new Buyer("Budi");
        User pengguna3 = new Seller("Siti");

        User[] semuaPengguna = {pengguna1, pengguna2, pengguna3};

        for (User u : semuaPengguna) {
            u.showMenu();
        }
    }
}

