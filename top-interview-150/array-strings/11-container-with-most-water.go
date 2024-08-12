//QN:: https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150

func maxArea(height []int) int {
    left := 0
    right := len(height) - 1
    maxVol := 0

    for left < right {
        currVol := volCalc(left, right, height)
        if currVol > maxVol {
            maxVol = currVol
        }
        if height[left] > height[right] {
            right --
        } else {
            left ++
        }
    }

    return maxVol


}

func volCalc(i, j int, height []int) int {
    shorter := i
    if height[j] < height[i] {
        shorter = j
    }
    return height[shorter] * (j - i)
}

