package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /** Output only. Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Timestamp when the type was created, in RFC3339 text format. */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the type. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The Operation that most recently ran, or is currently running, on this type. */
  var operation: js.UndefOr[Operation] = js.undefined
  /** Output only. Self link for the type. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object Type {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    insertTime: java.lang.String = null,
    name: java.lang.String = null,
    operation: Operation = null,
    selfLink: java.lang.String = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Type]
  }
}

