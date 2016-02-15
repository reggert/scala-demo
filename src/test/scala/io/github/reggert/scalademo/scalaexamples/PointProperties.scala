package io.github.reggert.scalademo.scalaexamples

import org.scalacheck._

object PointProperties extends Properties("Point") {
  import Prop._
  import Arbitrary._
  import Shrink._

  implicit val arbitraryPoint = Arbitrary {
    for (x <- arbitrary[Int]; y <- arbitrary[Int]; z <- arbitrary[Int])
      yield Point(x, y, z)
  }

  implicit val shrinkPoint = Shrink { p : Point =>
    for (x <- shrink(p.x); y <- shrink(p.y); z <- shrink(p.z))
      yield Point(x, y, z)
  }

  property("manhattanDistance is never negative") = forAll {(a : Point, b : Point) =>
    a.manhattanDistance(b) >= 0
  }

}
