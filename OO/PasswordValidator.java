package OO;

public class PasswordValidator {
    final String LOWER_CASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    final String UPPER_CASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String DIGITS = "0123456789";
    // 物件屬性
    private int minLength; // 密碼最短長度
    private int maxLength; // 密碼最長的長度
    private int minCountLCLetters; // 小寫字母(lower-case letter)至少出現的次數
    private int minCountUCLetters; // 大寫字母(upper-case letter)至少出現的次數
    private int minCountDigits; // 數字至少出現的次數
    private int minCountOthers; // 英數字以外的字元至少出現的次數

    public PasswordValidator(int minLength, int maxLength,
                             int minCountLCLetters, int minCountUCLetters,
                             int minCountDigits, int minCountOthers)
    {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.minCountLCLetters = minCountLCLetters;
        this.minCountUCLetters = minCountUCLetters;
        this.minCountDigits = minCountDigits;
        this.minCountOthers = minCountOthers;
    }

    // 功能：給予一個密碼，檢驗該密碼是否為合法的？
    public boolean isValid(String password)
    {
        boolean result=true;

        // 檢驗長度是否合法
        if (password.length() < minLength ||
            password.length() > maxLength)
            return false;

        // 決定 password 出現小寫字母、大寫字母、數字，以及其他符號的次數
        int lc_count=0, uc_count=0, digit_count=0, other_count=0;
        for (int i=0; i<password.length(); i++)
        {
            // 擷取一個字元，放置於變數 c
            String c = password.substring(i, i+1); // each letter in password

            // 檢查 c 中的字元，是否出現在小寫字元集合中，有出現 indexOf 會回傳大於等於0的數值
            if (LOWER_CASE_CHARS.indexOf(c) >= 0)
                lc_count++;

            // 檢查 c 中的字元，是否出現在大寫字元集合中，有出現 indexOf 會回傳大於等於0的數值
            if (UPPER_CASE_CHARS.indexOf(c) >= 0)
                uc_count++;

            // 檢查 c 中的字元，是否出現在數字型字元集合中，有出現 indexOf 會回傳大於等於0的數值
            if (DIGITS.indexOf(c) >= 0)
                digit_count++;     

            if (LOWER_CASE_CHARS.indexOf(c) == -1 && // c 不是小寫字元(c 沒有出現在小寫字元集合中)
                    UPPER_CASE_CHARS.indexOf(c) == -1 && // c 不是大寫字元(c 沒有出現在大寫字元集合中)
                    DIGITS.indexOf(c) == -1) // c 不是數字型字元(c 沒有出現在數字型字元集合中)
                other_count++;
        }

        if (lc_count < minCountLCLetters)
            return false;
        if (uc_count < minCountUCLetters)
            return false;
        if (digit_count < minCountDigits)
            return false;
        if (other_count < minCountOthers)
            return false;

        return result;
    }

    public String toString()
    {
        String msg="密碼規則如下：";
        msg += "最小長度：" + minLength + "\n";
        msg += "最大長度：" + maxLength + "\n";
        msg += "小寫字母至少出現次數：" + minCountLCLetters + "\n";
        msg += "大寫字母至少出現次數：" + minCountUCLetters + "\n";
        msg += "數字至少出現次數：" + minCountDigits + "\n";
        msg += "其他字元少出現次數：" + minCountOthers + "\n";

        return msg;
    }
}
