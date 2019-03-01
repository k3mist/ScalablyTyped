package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceLocalObject extends js.Object {
  /**
    * Name of the local to be namespaced.
    */
  var local: java.lang.String
  /**
    * Fully qualified namespace
    */
  var space: java.lang.String
}

object NamespaceLocalObject {
  @scala.inline
  def apply(local: java.lang.String, space: java.lang.String): NamespaceLocalObject = {
    val __obj = js.Dynamic.literal(local = local, space = space)
  
    __obj.asInstanceOf[NamespaceLocalObject]
  }
}

