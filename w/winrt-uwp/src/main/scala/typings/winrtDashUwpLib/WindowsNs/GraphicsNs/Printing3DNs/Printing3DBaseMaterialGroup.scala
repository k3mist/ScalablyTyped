package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of base materials used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup")
@js.native
class Printing3DBaseMaterialGroup protected () extends js.Object {
  /**
    * Creates an instance of the Printing3DBaseMaterialGroup class.
    * @param MaterialGroupId The identifier for the group of base materials used in the 3D model; a value greater than zero.
    */
  def this(MaterialGroupId: scala.Double) = this()
  /** Gets a group of base materials used in the 3D model. */
  var bases: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DBaseMaterial] = js.native
  /** Gets the identifier (ID) of the base material group. */
  var materialGroupId: scala.Double = js.native
}

