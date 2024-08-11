//QN: https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150

/*
Other than the edge cases of IV, IX, XL, XC, CD, CM, all of the roman numerals are sorted from
largest to smallest.

we can detect if a roman numeral is not sorted in order and make the appropriate adjustment to handle these
cases.
*/

func romanToInt(s string) int {

    sum := 0
    prev := 10000

    roman := map[rune]int{
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000,
    }

    for _, chr := range s {
        if roman[chr] <= prev {
            sum += roman[chr]
        } else {
            switch chr {
                case 'V':
                    sum += 3
                case 'X':
                    sum += 8
                case 'L':
                    sum += 30
                case 'C':
                    sum += 80
                case 'D':
                    sum += 300
                case 'M':
                    sum += 800
            }
        }
        prev = roman[chr]
    }

    return sum
}