//QN: https://leetcode.com/problems/powx-n/?envType=study-plan-v2&envId=top-interview-150

func myPow(x float64, n int) float64 {

    if x == 1.0 {
        return 1.0
    }
    if x == 0.0 {
        return 0.0
    }

    if n < 0 {
        x = 1 / x
        n = -n
    }

    curr := 1.0
    mult := x
    for n > 0 {
        if (n % 2 == 1) {
            n -= 1
            curr *= mult
        }
        n /= 2
        mult *= mult
    }

    return curr
}
