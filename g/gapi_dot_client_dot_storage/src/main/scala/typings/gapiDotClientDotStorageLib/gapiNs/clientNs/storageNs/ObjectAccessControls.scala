package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControls extends js.Object {
  /** The list of items. */
  var items: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  /** The kind of item this is. For lists of object access control entries, this is always storage#objectAccessControls. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ObjectAccessControls {
  @scala.inline
  def apply(items: js.Array[ObjectAccessControl] = null, kind: java.lang.String = null): ObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ObjectAccessControls]
  }
}

