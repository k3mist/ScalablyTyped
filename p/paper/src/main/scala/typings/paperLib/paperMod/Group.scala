package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Group")
@js.native
/**
  * Creates a new Group item and places it at the top of the active layer.
  * @param children [optional] - An array of Item Objects children that will be added to the newly created group.
  */
class Group ()
  extends paperLib.paperNs.Group {
  def this(children: js.Array[paperLib.paperNs.Item]) = this()
  def this(`object`: js.Any) = this()
}

