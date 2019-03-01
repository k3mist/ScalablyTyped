package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var markDirty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

object RemoveOptions {
  @scala.inline
  def apply(
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[scala.Boolean] = js.undefined,
    onFailure: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    onSuccess: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    push: js.UndefOr[scala.Boolean] = js.undefined
  ): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[RemoveOptions]
  }
}

