package typings
package paperLib.paperNs.PathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path.Arc")
@js.native
class Arc protected ()
  extends paperLib.paperNs.Path {
  /**
    * Creates an circular arc path item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the path's attributes
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a circular arc path item
    * @param from - the starting point of the circular arc
    * @param through - the point the arc passes through
    * @param to - the end point of the arc
    */
  def this(from: paperLib.paperNs.Point, through: paperLib.paperNs.Point, to: paperLib.paperNs.Point) = this()
}

