package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-siteboundcredentialdata}
  */
trait SiteBoundCredentialData extends CredentialData {
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  var iconURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SiteBoundCredentialData {
  @scala.inline
  def apply(id: java.lang.String, iconURL: java.lang.String = null, name: java.lang.String = null): SiteBoundCredentialData = {
    val __obj = js.Dynamic.literal(id = id)
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SiteBoundCredentialData]
  }
}

