package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mixin extends js.Object {
  /** The fully qualified name of the interface which is included. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If non-empty specifies a path under which inherited HTTP paths
    * are rooted.
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object Mixin {
  @scala.inline
  def apply(name: java.lang.String = null, root: java.lang.String = null): Mixin = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Mixin]
  }
}

