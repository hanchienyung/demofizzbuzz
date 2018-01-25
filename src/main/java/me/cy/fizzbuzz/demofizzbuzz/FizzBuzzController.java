package me.cy.fizzbuzz.demofizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class FizzBuzzController {

    @RequestMapping("/")
    public String fizzbuzz() {

        int start_num = 1;
        int end_num;
        int num;
        num = start_num;
        int counter7 = 0;
        int counter17 = 0;
        int counter23 = 0;
        String display = "";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter End number:");

        end_num = keyboard.nextInt();

        display = display + "End number is " + String.valueOf(end_num) + "<br/>";


        for (num = start_num; num <= end_num; num++) {

            if (num % 3 == 0 && num % 5 == 0){
                display = display + "<br/>" + "FizzBuzz";

            }
            else if (num % 3 == 0) {
                display = display + "<br/>" + "Fizz";

            }
            else if (num % 5 == 0) {
                display = display + "<br/>" + "Buzz";
            }
            else{
                display = display + "<br/>" + num;
            }

            if (num % 7 == 0 ) {
                counter7++;
            }

            if (num % 17 == 0) {
                counter17++;
            }

            if (num % 23 == 0) {
                counter23++;
            }

        }

        display = display + "<br/><br/>Number of multiples of 7 is: " + String.valueOf(counter7) + "<br/>";
        display = display + "Number of multiples of 17 is: " + String.valueOf(counter17) + "<br/>";
        display = display + "Number of multiples of 23 is: " + String.valueOf(counter23) + "<br/>";
        return display;
    }

}




