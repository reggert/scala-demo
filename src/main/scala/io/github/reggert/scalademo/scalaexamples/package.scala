package io.github.reggert.scalademo

package object scalaexamples {
  implicit final class PointOps(val self : Point) extends AnyVal {
    def manhattanDistance(other : Point) : Int = {
      self.x - other.x + self.y - other.y + self.z - other.z
    }
  }
}
