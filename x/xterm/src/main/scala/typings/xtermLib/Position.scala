package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  val coords: Coordinates
  val timestamp: scala.Double
}

object Position {
  @scala.inline
  def apply(coords: Coordinates, timestamp: scala.Double): Position = {
    val __obj = js.Dynamic.literal(coords = coords, timestamp = timestamp)
  
    __obj.asInstanceOf[Position]
  }
}

