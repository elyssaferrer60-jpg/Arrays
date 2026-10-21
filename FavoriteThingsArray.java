/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.favoritethingsarray;

/**
 *
 * @author elyssa ferrer
 */
public class FavoriteThingsArray {
    public static void main(String[] args) {

        String[] favorites = {
            "Coffee",
            "Beach",
            "Traveling",
            "Spanish Bread",
            "Vacation"
        };

        System.out.println("My Favorite Things:");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total Favorites: " + favorites.length);
    }
}

