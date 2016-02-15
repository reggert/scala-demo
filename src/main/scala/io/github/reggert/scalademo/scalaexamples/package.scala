package io.github.reggert.scalademo

package object scalaexamples {
  import Math.abs
  implicit final class PointOps(val self : Point) extends AnyVal {
    def manhattanDistance(other : Point) : Long =
      abs(self.x.toLong - other.x.toLong) + abs(self.y.toLong - other.y.toLong) + abs(self.z.toLong - other.z.toLong)
  }
}
