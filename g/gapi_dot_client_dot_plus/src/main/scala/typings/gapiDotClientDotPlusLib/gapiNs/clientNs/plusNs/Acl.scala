package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acl extends js.Object {
  /** Description of the access granted, suitable for display. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The list of access entries. */
  var items: js.UndefOr[js.Array[PlusAclentryResource]] = js.undefined
  /** Identifies this resource as a collection of access controls. Value: "plus#acl". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Acl {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    items: js.Array[PlusAclentryResource] = null,
    kind: java.lang.String = null
  ): Acl = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Acl]
  }
}

