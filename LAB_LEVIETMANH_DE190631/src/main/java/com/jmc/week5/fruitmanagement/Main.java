package com.jmc.week5.fruitmanagement;

import com.jmc.week5.fruitmanagement.controller.ShopManager;
import com.jmc.week5.fruitmanagement.model.Customer;
import com.jmc.week5.fruitmanagement.model.Fruit;
import com.jmc.week5.fruitmanagement.model.Order;
import com.jmc.week5.fruitmanagement.model.database.Fruit_database;

import java.util.ArrayList;
import java.util.List;

import static com.jmc.week5.fruitmanagement.model.database.Fruit_database.*;

public class Main {

        public static void main(String[] args) {
            
         ShopManager c=new ShopManager();
         c.run();
        }


    }

