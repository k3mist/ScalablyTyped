package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLConfiguration extends js.Object {
  var certificatePath: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[scala.Boolean] = js.undefined
  var validateCallback: js.UndefOr[SSLVerifyCallback] = js.undefined
}

object SSLConfiguration {
  @scala.inline
  def apply(
    certificatePath: java.lang.String = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined,
    validateCallback: SSLVerifyCallback = null
  ): SSLConfiguration = {
    val __obj = js.Dynamic.literal()
    if (certificatePath != null) __obj.updateDynamic("certificatePath")(certificatePath)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    if (validateCallback != null) __obj.updateDynamic("validateCallback")(validateCallback)
    __obj.asInstanceOf[SSLConfiguration]
  }
}

