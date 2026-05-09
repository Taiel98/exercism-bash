<?php

class HighSchoolSweetheart
{
    public function firstLetter(string $name): string
    {
        $thisName = trim($name);
        return substr($thisName, 0, 1);
        throw new \BadFunctionCallException("Implement the function");
    }

    public function initial(string $name): string
    {
        return strtoupper($this->firstLetter($name)) . ".";
        throw new \BadFunctionCallException("Implement the function");
    }

    public function initials(string $name): string
    {
        $fullname = explode(" ",$name);
        return $this->initial($fullname[0]) . " " . $this->initial($fullname[1]);
        throw new \BadFunctionCallException("Implement the function");
    }

    public function pair(string $sweetheart_a, string $sweetheart_b): string
    {
        $a = $this->initials($sweetheart_a);
        $b = $this->initials($sweetheart_b);
        //return $this->initials($sweetheart_a) . " + " . $this->initials($sweetheart_b);
        return <<<END
             ******       ******
           **      **   **      **
         **         ** **         **
        **            *            **
        **                         **
        **     $a  +  $b     **
         **                       **
           **                   **
             **               **
               **           **
                 **       **
                   **   **
                     ***
                      *
        END;
        throw new \BadFunctionCallException("Implement the function");
    }
}
