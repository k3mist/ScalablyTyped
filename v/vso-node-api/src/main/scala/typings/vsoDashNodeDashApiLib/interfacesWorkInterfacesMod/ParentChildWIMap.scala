package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentChildWIMap extends js.Object {
  var childWorkItemIds: js.Array[scala.Double]
  var id: scala.Double
  var title: java.lang.String
}

object ParentChildWIMap {
  @scala.inline
  def apply(childWorkItemIds: js.Array[scala.Double], id: scala.Double, title: java.lang.String): ParentChildWIMap = {
    val __obj = js.Dynamic.literal(childWorkItemIds = childWorkItemIds, id = id, title = title)
  
    __obj.asInstanceOf[ParentChildWIMap]
  }
}

