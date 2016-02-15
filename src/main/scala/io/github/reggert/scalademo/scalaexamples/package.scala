package io.github.reggert.scalademo

package object scalaexamples {
  implicit final class PointOps(val self : Point) extends AnyVal {
    def manhattanDistance(other : Point) : Long = {
      self.x.toLong - other.x.toLong + self.y.toLong - other.y.toLong + self.z.toLong - other.z.toLong
    }
  }
}
