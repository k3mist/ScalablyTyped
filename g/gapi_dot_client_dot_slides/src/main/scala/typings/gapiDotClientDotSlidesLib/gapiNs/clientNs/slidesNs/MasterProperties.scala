package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasterProperties extends js.Object {
  /** The human-readable name of the master. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object MasterProperties {
  @scala.inline
  def apply(displayName: java.lang.String = null): MasterProperties = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[MasterProperties]
  }
}

