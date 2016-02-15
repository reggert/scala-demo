package io.github.reggert.scalademo.scalaexamples

import org.scalacheck._


object MathemagicsProperties extends Properties("Mathemagics") {
  import Prop._

  property("minimum returns a value that is <= all elements in list") = forAll {list : List[Int] =>
    list.nonEmpty ==> {
      val result = Mathemagics.minimum(list)
      list.forall(result <= _)
    }
  }

}
