package WhatToEat;

import java.util.Random;
import java.util.Scanner;

public class RandomFoodSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] american = {"Marty's Grill", "Ruby Tuesday", "Riverbound Cafe", "Cracker Barrel", "Sports Page Bar", "TGI Fridays", "Charred Hanover", "Outback Steakhouse", "Waffle House"};
        String[] chinese = {"Chen's Chines", "Bell Hut Asian Cuisine", "Zheng Chinese Restaurant", "China Kitchen", "China Wok", "Peking Restaurant", "China House", "Ginger Red Asian Bistro", "Tops China", "Fuji Asian Cuisine", "Asian cuisine", "Marigold Thai", "Bonchon", "Little Szechuan"};
        String[] fastFood = {"Chick-fil-A", "Wendys", "Arbys", "Cook Out", "McDonalds", "Taco Bell", "Sonic", "Five Guys", "Burger King", "Subway"};
        String[] favorites = {"Zaxby's", "Chic-fil-A"};


        System.out.println("What do you want to eat?");
        System.out.println("Your choices are American, Chinese, Fast Food, Favorites");


        String response = input.nextLine();

        do {
            if (response.equalsIgnoreCase("American")) {
                randomizeResultOfFoods(american);
                System.out.println(randomizeResultOfFoods(american));
            } else if (response.equalsIgnoreCase("Chinese")) {
                randomizeResultOfFoods(chinese);
                System.out.println(randomizeResultOfFoods(chinese));
            } else if (response.equalsIgnoreCase("Fast Food")) {
                randomizeResultOfFoods(fastFood);
                System.out.println(randomizeResultOfFoods(fastFood));
            } else if (response.equalsIgnoreCase("favorites")) {
                randomizeResultOfFoods(favorites);
                System.out.println(randomizeResultOfFoods(favorites));
            } else {
                response = "false";
                System.out.println("Incorrect Input");
            }
        } while (response.equals(false));


    }

    public static String randomizeResultOfFoods(String[] a) {
        Random rand = new Random();
        String randomFoodResult = a[rand.nextInt(a.length)];

        return randomFoodResult;
    }
}
