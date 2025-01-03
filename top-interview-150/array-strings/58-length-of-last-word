//qn: https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150

func lengthOfLastWord(s string) int {
    count := 0
    for idx := len(s) - 1; idx >= 0; idx-- {
        if s[idx] != ' ' {
            count ++
        } else if s[idx] == ' ' && count > 0 {
            break
        }
    }
    return count
}
