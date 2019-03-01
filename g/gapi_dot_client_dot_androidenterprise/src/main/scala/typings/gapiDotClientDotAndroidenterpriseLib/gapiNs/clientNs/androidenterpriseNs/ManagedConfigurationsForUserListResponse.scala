package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedConfigurationsForUserListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfigurationsForUserListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A managed configuration for an app for a specific user. */
  var managedConfigurationForUser: js.UndefOr[js.Array[ManagedConfiguration]] = js.undefined
}

object ManagedConfigurationsForUserListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, managedConfigurationForUser: js.Array[ManagedConfiguration] = null): ManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (managedConfigurationForUser != null) __obj.updateDynamic("managedConfigurationForUser")(managedConfigurationForUser)
    __obj.asInstanceOf[ManagedConfigurationsForUserListResponse]
  }
}

