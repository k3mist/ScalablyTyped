package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRing extends js.Object {
  /** Output only. The time at which this KeyRing was created. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Output only. The resource name for the KeyRing in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object KeyRing {
  @scala.inline
  def apply(createTime: java.lang.String = null, name: java.lang.String = null): KeyRing = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[KeyRing]
  }
}

