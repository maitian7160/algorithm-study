
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
    val start = System.currentTimeMillis()
    twoSum(Array(2, 7, 11, 15), 9)
    println(System.currentTimeMillis() - start)
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


}
