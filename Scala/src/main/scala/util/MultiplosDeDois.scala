package util

object MultiplosDeDois extends (Int => List[Int]) {

  override def apply(v1: Int): List[Int] = {
    if (v1 < 2) Nil
    else {
      if (v1%2==0) v1 :: (apply(v1-1))
      else apply(v1-1)
    }
  }

}
