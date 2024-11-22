package com.Q2;

interface Taxable {
    // Constants
    double salesTax = 0.07;    // 7%
    double incomeTax = 0.105;  // 10.5%

    // Abstract method
    double calcTax();
}
