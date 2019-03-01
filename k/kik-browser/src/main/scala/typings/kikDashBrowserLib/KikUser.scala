package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikUser extends js.Object {
  var firstName: java.lang.String
  var fullName: java.lang.String
  var lastName: java.lang.String
  var pic: java.lang.String
  var thumbnail: java.lang.String
  var username: java.lang.String
}

object KikUser {
  @scala.inline
  def apply(
    firstName: java.lang.String,
    fullName: java.lang.String,
    lastName: java.lang.String,
    pic: java.lang.String,
    thumbnail: java.lang.String,
    username: java.lang.String
  ): KikUser = {
    val __obj = js.Dynamic.literal(firstName = firstName, fullName = fullName, lastName = lastName, pic = pic, thumbnail = thumbnail, username = username)
  
    __obj.asInstanceOf[KikUser]
  }
}

