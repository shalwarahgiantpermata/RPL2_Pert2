/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokogundar;

/**
 *
 * @author Shalwa Rahgiant
 */
public class Seller extends User {
    public Seller(String username) {
        super(username);
    }

    @Override
    public void showMenu() {
        System.out.println("Halo " + getUsername() + ", ini menu SELLER.");
    }
}
