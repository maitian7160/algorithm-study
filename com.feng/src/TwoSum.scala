/**
  * @Author: Feng
  * @Date: 2018/11/13
  */
object TwoSum {

  /**
    * Given nums = [2, 7, 11, 15], target = 9
    *
    * while nums[0] + nums[1] = 2 + 7 = 9
    * So return [0, 1]
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val t1 = new RunSeconds()
    twoSum(Array(2, 7, 11, 15), 9).foreach(println(_))
    println(t1.runTime)
    val t2 = new RunSeconds()
    twoTarget(Array(2, 7, 11, 15), 9).foreach(println(_))
    println(t2.runTime)

  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var map = Map.empty[Int, Int]
    var arr = Array(-1, -1)
    for ((v, i) <- nums.zipWithIndex if arr(0) == -1) {
      val numNeed = target - v
      if (map.contains(numNeed)) {
        arr = Array(map.get(numNeed).get, i)
      }
      map = map ++ Map(v -> i)
    }

    arr
  }

  /**
    *
    * @param arr
    * @param target
    */
  final def twoTarget(arr: Array[Int], target: Int) = {
    var i      = 0
    var j      = arr.length - 1
    var flag   = true
    val result = Array(-1, -1)
    while (flag && i < j) {
      if (arr(i) + arr(j) > target) j = j - 1
      else if (arr(i) + arr(j) < target) i = i + 1
      else flag = false
      result(0) = i
      result(1) = j
    }
    result
  }

  /**
    * run time  seconds
    */
  class RunSeconds {
    val start        = System.currentTimeMillis()
    lazy val end     = System.currentTimeMillis()
    lazy val runTime = end - start

  }

}
