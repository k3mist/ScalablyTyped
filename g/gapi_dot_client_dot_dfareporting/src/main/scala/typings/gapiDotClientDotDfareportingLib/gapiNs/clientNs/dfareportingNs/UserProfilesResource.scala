package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesResource extends js.Object {
  /** Gets one user profile by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[UserProfile]
  /** Retrieves list of user profiles for a user. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[UserProfileList]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[UserProfile]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[UserProfileList]
    ]
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[UserProfilesResource]
  }
}

