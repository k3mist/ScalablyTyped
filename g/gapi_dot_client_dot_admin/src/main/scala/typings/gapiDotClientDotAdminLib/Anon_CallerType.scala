package typings
package gapiDotClientDotAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallerType extends js.Object {
  /** User or OAuth 2LO request. */
  var callerType: js.UndefOr[java.lang.String] = js.undefined
  /** Email address of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** For OAuth 2LO API requests, consumer_key of the requestor. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Obfuscated user id of the user. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CallerType {
  @scala.inline
  def apply(
    callerType: java.lang.String = null,
    email: java.lang.String = null,
    key: java.lang.String = null,
    profileId: java.lang.String = null
  ): Anon_CallerType = {
    val __obj = js.Dynamic.literal()
    if (callerType != null) __obj.updateDynamic("callerType")(callerType)
    if (email != null) __obj.updateDynamic("email")(email)
    if (key != null) __obj.updateDynamic("key")(key)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    __obj.asInstanceOf[Anon_CallerType]
  }
}

