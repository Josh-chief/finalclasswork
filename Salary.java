package com.finalclasswork;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Salary {
    public double basic_salary;
    public double allowance;
    public double tax_rate;
    public double tax_amount;
    public double net_salary;


    public Salary(){
        this.basic_salary = 10000;
        this.allowance = 5000;
        this.tax_rate = 10;
    }

    public Salary(double basic_salary, double allowance, double tax_rate){

        this.basic_salary = basic_salary;
        this.allowance = allowance;
        this.tax_rate = tax_rate;
    }

    public void input(){
        System.out.print("Enter your basic salary: ");
        Scanner scanner = new Scanner(System.in);
        this.basic_salary = scanner.nextDouble();


        System.out.print("Enter your allowance: ");
        Scanner scanner1 = new Scanner(System.in);
        this.allowance = scanner1.nextDouble();


        System.out.print("Enter your tax_rate: ");
        Scanner scanner2 = new Scanner(System.in);
        this.tax_rate = scanner2.nextDouble();

    }

    public void output(){

        this.compute();  // Here we must compute the values before printing out
        System.out.println("Your tax amount is: " + this.tax_amount);
        System.out.println("Your net salary is: " + this.net_salary);
    }

    public double compute(){

        double gross_salary = this.basic_salary + this.allowance;
        this.tax_amount = this.tax_rate/100 * gross_salary;
        this.net_salary = gross_salary - this.tax_amount;

        //double [] final_values = {this.tax_amount, this.net_salary};


        return 0;
    }





}