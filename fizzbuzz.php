<?php
function FizzBuzz() {
    for($i = 1; $i <= 100; $i++) {
        $fizz = false; $buzz = false;
        if($i % 3 == 0) {
            $fizz = true;
        }
        if($i % 5 == 0) {
            $buzz = true;
        }
        if($fizz) {
            echo("Fizz");
        }
        if($buzz) {
            echo("Buzz");
        }
        if(!$fizz && !$buzz) {
            echo($i);
        }
        echo "\n";
    }
}
FizzBuzz();
