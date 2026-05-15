<?php

class PizzaPi
{
    public function calculateDoughRequirement(int $pizzas, int $persons) : int
    {
        $grams = $pizzas * (($persons * 20) + 200);
        return $grams;
    }

    public function calculateSauceRequirement(int $pizzas, int $sauceCanVolume)
    {
        $saucePerPizza = 125;
        $cansOfSauce = $pizzas * $saucePerPizza / $sauceCanVolume;
        return $cansOfSauce;
    }

    public function calculateCheeseCubeCoverage(int $cheeseDimension, float $thickness, int $diameter) : int
    {
        $PI = pi();
        $pizzas = ($cheeseDimension ** 3) / ($thickness * $PI * $diameter);
        return $pizzas;
    }

    public function calculateLeftOverSlices(int $pizzas, int $friends)
    {
        $leftOvers = ($pizzas * 8) % $friends;
        return $leftOvers;
    }
}
