package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ancestor extends js.Object {
  /** Resource id of the ancestor. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object Ancestor {
  @scala.inline
  def apply(resourceId: ResourceId = null): Ancestor = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[Ancestor]
  }
}

