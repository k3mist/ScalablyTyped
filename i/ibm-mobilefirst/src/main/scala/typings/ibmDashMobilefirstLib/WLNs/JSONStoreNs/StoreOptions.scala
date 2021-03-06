package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var additionalSearchFields: js.UndefOr[js.Object] = js.undefined
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(
    additionalSearchFields: js.Object = null,
    invocationContext: js.Any = null,
    onFailure: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    onSuccess: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    push: js.UndefOr[scala.Boolean] = js.undefined
  ): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalSearchFields != null) __obj.updateDynamic("additionalSearchFields")(additionalSearchFields)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[StoreOptions]
  }
}

