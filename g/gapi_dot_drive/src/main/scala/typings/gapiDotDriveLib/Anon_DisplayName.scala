package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  var displayName: java.lang.String
  var emailAddress: java.lang.String
  var isAuthenticatedUser: scala.Boolean
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#user`
  var permissionId: java.lang.String
  var picture: Anon_Url
}

object Anon_DisplayName {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    emailAddress: java.lang.String,
    isAuthenticatedUser: scala.Boolean,
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#user`,
    permissionId: java.lang.String,
    picture: Anon_Url
  ): Anon_DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName, emailAddress = emailAddress, isAuthenticatedUser = isAuthenticatedUser, kind = kind, permissionId = permissionId, picture = picture)
  
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

