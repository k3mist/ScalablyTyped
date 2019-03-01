package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EraseOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

object EraseOptions {
  @scala.inline
  def apply(
    invocationContext: js.Any = null,
    onFailure: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    onSuccess: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    push: js.UndefOr[scala.Boolean] = js.undefined
  ): EraseOptions = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[EraseOptions]
  }
}

