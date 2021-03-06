package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[CompanyRelation]
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a user. */
  def get(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[User]
  /**
    * Updates a user's profile. A user can only update their own profile and
    * should only be called within the context of a logged in user.
    */
  def updateProfile(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[UserProfile]
}

object UsersResource {
  @scala.inline
  def apply(
    createCompanyRelation: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[CompanyRelation],
    deleteCompanyRelation: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[User],
    updateProfile: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[UserProfile]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(createCompanyRelation = js.Any.fromFunction1(createCompanyRelation), deleteCompanyRelation = js.Any.fromFunction1(deleteCompanyRelation), get = js.Any.fromFunction1(get), updateProfile = js.Any.fromFunction1(updateProfile))
  
    __obj.asInstanceOf[UsersResource]
  }
}

