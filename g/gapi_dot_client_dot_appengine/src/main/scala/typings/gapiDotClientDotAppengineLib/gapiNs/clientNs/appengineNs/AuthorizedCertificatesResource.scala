package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedCertificatesResource extends js.Object {
  /** Uploads the specified SSL certificate. */
  def create(request: gapiDotClientDotAppengineLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[AuthorizedCertificate]
  /** Deletes the specified SSL certificate. */
  def delete(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the specified SSL certificate. */
  def get(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsId): gapiDotClientLib.gapiNs.clientNs.Request[AuthorizedCertificate]
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListAuthorizedCertificatesResponse]
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdAuthorizedCertificatesId): gapiDotClientLib.gapiNs.clientNs.Request[AuthorizedCertificate]
}

object AuthorizedCertificatesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotAppengineLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AuthorizedCertificate]
    ],
    delete: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AuthorizedCertificate]
    ],
    list: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListAuthorizedCertificatesResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdAuthorizedCertificatesId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AuthorizedCertificate]
    ]
  ): AuthorizedCertificatesResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, patch = patch)
  
    __obj.asInstanceOf[AuthorizedCertificatesResource]
  }
}

