package com.finalclasswork;

import java.util.Scanner;

import static java.lang.StrictMath.abs;
//import java.lang.Math

public class Commodity {
    public int buying_price;
    public int transport_cost;
    public int selling_price ;
    public int margin;

    public Commodity()
    {
        // the keyword called this assigns attributes of methods to the object
        this.buying_price = 0;
        this.transport_cost = 0;
        this.selling_price = 0;
        this.margin = 0;
    }

    public Commodity(int buying_price, int transport_cost, int selling_price)
    {
        this.buying_price = buying_price;
        this.transport_cost = transport_cost;
        this.selling_price = selling_price;

    }

    public void get_data()
    {
        System.out.print("Enter buying price: ");
        Scanner scanner = new Scanner(System.in);
        this.buying_price = scanner.nextInt();

        System.out.print("Enter transport cost: ");
        Scanner scanner1 = new Scanner(System.in);
        this.transport_cost = scanner1.nextInt();

        System.out.print("Enter selling price: ");
        Scanner scanner2 = new Scanner(System.in);
        this.selling_price = scanner2.nextInt();
    }


    public void give_output()
    {
        // Output loss if the value is negative
        // Output profit if the value is positive
        int final_margin = this.calculate();

        if (final_margin == 0){
            System.out.println("Your have no profit or loss. Margin =" + final_margin);
        }
        else if (final_margin > 0){
            System.out.println("Your profit is: " + final_margin);
        }
        else {
            final_margin = abs(final_margin); // here we don't want to print the negative sign now we take the
                                            // absolute value
            System.out.println("Your loss is: " + final_margin);
        }


    }

    public int calculate ()
    {
        // margin = selling price - (buying_price + transport_cost)
        // 130 - (100 + 30) = 0

        this.margin = this.selling_price - (this.buying_price + this.transport_cost);

        return this.margin;
    }
}
