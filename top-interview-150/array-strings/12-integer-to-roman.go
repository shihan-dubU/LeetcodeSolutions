//QN: https://leetcode.com/problems/integer-to-roman/description/?envType=study-plan-v2&envId=top-interview-150

func intToRoman(num int) string {
    romanNumerals := [][]interface{}{
        {1000, "M"},
        {900, "CM"},
        {500, "D"},
        {400, "CD"},
        {100, "C"},
        {90, "XC"},
        {50, "L"},
        {40, "XL"},
        {10, "X"},
        {9, "IX"},
        {5, "V"},
        {4, "IV"},
        {1, "I"},
    }

    result := ""

    for _, v := range romanNumerals {
        value := v[0].(int)
        numeral := v[1].(string)

        for num >= value {
            num -= value
            result += numeral
        }
    }


    return result
    
}