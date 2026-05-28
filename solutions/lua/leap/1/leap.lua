local leap_year = function(number)
  if number % 4 == 0 then
    if number % 100 == 0 then
      if number % 400 ~= 0 then
        return false
      end
    end
    return true
  else
    return false
  end
end

return leap_year
