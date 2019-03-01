package typings
package gapiDotClientDotFirebaseremoteconfigLib.gapiNs.clientNs.firebaseremoteconfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigParameter extends js.Object {
  /**
    * Optional - a map of (condition_name, value). The condition_name of the
    * highest priority (the one listed first in the conditions array) determines
    * the value of this parameter.
    */
  var conditionalValues: js.UndefOr[stdLib.Record[java.lang.String, RemoteConfigParameterValue]] = js.undefined
  /**
    * Optional - value to set the parameter to, when none of the named conditions
    * evaluate to <code>true</code>.
    */
  var defaultValue: js.UndefOr[RemoteConfigParameterValue] = js.undefined
}

object RemoteConfigParameter {
  @scala.inline
  def apply(
    conditionalValues: stdLib.Record[java.lang.String, RemoteConfigParameterValue] = null,
    defaultValue: RemoteConfigParameterValue = null
  ): RemoteConfigParameter = {
    val __obj = js.Dynamic.literal()
    if (conditionalValues != null) __obj.updateDynamic("conditionalValues")(conditionalValues)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.asInstanceOf[RemoteConfigParameter]
  }
}

