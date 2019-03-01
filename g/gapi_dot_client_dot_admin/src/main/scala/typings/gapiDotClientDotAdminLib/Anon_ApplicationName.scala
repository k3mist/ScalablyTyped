package typings
package gapiDotClientDotAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplicationName extends js.Object {
  /** Application name to which the event belongs. */
  var applicationName: js.UndefOr[java.lang.String] = js.undefined
  /** Obfuscated customer ID of the source customer. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** Time of occurrence of the activity. */
  var time: js.UndefOr[java.lang.String] = js.undefined
  /** Unique qualifier if multiple events have the same time. */
  var uniqueQualifier: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ApplicationName {
  @scala.inline
  def apply(
    applicationName: java.lang.String = null,
    customerId: java.lang.String = null,
    time: java.lang.String = null,
    uniqueQualifier: java.lang.String = null
  ): Anon_ApplicationName = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (time != null) __obj.updateDynamic("time")(time)
    if (uniqueQualifier != null) __obj.updateDynamic("uniqueQualifier")(uniqueQualifier)
    __obj.asInstanceOf[Anon_ApplicationName]
  }
}

