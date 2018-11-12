package palindrome

/**
  * @Author: Feng
  * @Date: 2018/11/12
  *
  */
object Palindrome {

  /**
    * check c is alphabet or number
    *
    * @param c
    * @return
    */
  def isAlphanumeric(s: Char) = (s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z') || (s >= '0' && s <= '9')

  def ignoreCase(a: Char, b: Char) = toLowerCase(a) == toLowerCase(b)

  def toLowerCase(s: Char): Char = if (s >= 'A' && s <= 'Z') s.toLower else s


  /**
    * Determines if the string is a palindrome
    *
    * Time(n) space(1)
    *
    * @param str
    * @return
    */
  def isPalindrome(str: String): Boolean = {
    if (str.isEmpty) true
    else {
      var i = 0
      var j = str.length - 1
      var flag = 0
      while (i <= j && flag == 0) {
        while (!isAlphanumeric(str.charAt(i))) i = i + 1
        while (!isAlphanumeric(str.charAt(j))) j = j - 1
        if (!ignoreCase(str.charAt(i), str.charAt(j))) flag = 1
        i = i + 1
        j = j - 1
      }

      flag == 0
    }
  }

  def main(args: Array[String]): Unit = {
    val str = "adbc 123321     cbda"
    println(isPalindrome(str))
  }


}
