package io.github.reggert.scalademo.scalaexamples

import org.scalacheck.{Prop, Properties}

import Prop._


object MathemagicsProperties extends Properties("Mathemagics") {

  property("minimum returns a value that is <= all elements in list") = forAll {list : List[Int] =>
    val result = Mathemagics.minimum(list)
    list.forall(result <= _)
  }

}
