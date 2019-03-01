package typings
package oidcDashTokenDashManagerLib.OidcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupSettings extends js.Object {
  var features: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object PopupSettings {
  @scala.inline
  def apply(features: java.lang.String = null, target: java.lang.String = null): PopupSettings = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PopupSettings]
  }
}

