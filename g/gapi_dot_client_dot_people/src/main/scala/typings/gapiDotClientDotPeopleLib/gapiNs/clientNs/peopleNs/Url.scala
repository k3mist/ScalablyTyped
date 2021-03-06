package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  /**
    * The read-only type of the URL translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the URL. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the URL. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `blog`
    * &#42; `profile`
    * &#42; `homePage`
    * &#42; `ftp`
    * &#42; `reservations`
    * &#42; `appInstallPage`: website for a Google+ application.
    * &#42; `other`
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The URL. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Url {
  @scala.inline
  def apply(
    formattedType: java.lang.String = null,
    metadata: FieldMetadata = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): Url = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Url]
  }
}

