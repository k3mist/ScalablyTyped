package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventSourceInit extends js.Object {
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object IEventSourceInit {
  @scala.inline
  def apply(withCredentials: js.UndefOr[scala.Boolean] = js.undefined): IEventSourceInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[IEventSourceInit]
  }
}

