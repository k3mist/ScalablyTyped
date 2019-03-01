package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuthorizedCertificatesResponse extends js.Object {
  /** The SSL certificates the user is authorized to administer. */
  var certificates: js.UndefOr[js.Array[AuthorizedCertificate]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListAuthorizedCertificatesResponse {
  @scala.inline
  def apply(certificates: js.Array[AuthorizedCertificate] = null, nextPageToken: java.lang.String = null): ListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListAuthorizedCertificatesResponse]
  }
}

