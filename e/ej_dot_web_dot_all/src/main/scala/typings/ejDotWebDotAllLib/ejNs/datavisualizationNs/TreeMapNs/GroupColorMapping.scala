package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupColorMapping extends js.Object {
  /** Specifies the groupID for GroupColorMapping.
    * @Default {null}
    */
  var groupID: js.UndefOr[java.lang.String] = js.undefined
}

object GroupColorMapping {
  @scala.inline
  def apply(groupID: java.lang.String = null): GroupColorMapping = {
    val __obj = js.Dynamic.literal()
    if (groupID != null) __obj.updateDynamic("groupID")(groupID)
    __obj.asInstanceOf[GroupColorMapping]
  }
}

