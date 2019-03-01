package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextRule extends js.Object {
  /** A list of full type names of provided contexts. */
  var provided: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of full type names of requested contexts. */
  var requested: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object ContextRule {
  @scala.inline
  def apply(
    provided: js.Array[java.lang.String] = null,
    requested: js.Array[java.lang.String] = null,
    selector: java.lang.String = null
  ): ContextRule = {
    val __obj = js.Dynamic.literal()
    if (provided != null) __obj.updateDynamic("provided")(provided)
    if (requested != null) __obj.updateDynamic("requested")(requested)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[ContextRule]
  }
}

