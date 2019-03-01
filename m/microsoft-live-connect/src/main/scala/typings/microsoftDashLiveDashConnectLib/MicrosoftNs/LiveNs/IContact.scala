package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Contact object contains info about a user's Outlook.com contacts. The
  * Live Connect REST API supports reading Contact objects.
  */
trait IContact extends js.Object {
  /**
    * The day of the contact's birth date, or null if no birth date is
    * specified.
    */
  var birth_day: scala.Double
  /**
    * The month of the contact's birth date, or null if no birth date is
    * specified.
    */
  var birth_month: scala.Double
  /**
    * An array containing a SHA-256 hash for each of the contact's email
    * addresses. For more info, see Friend finder.
    */
  var email_hashes: js.Array[java.lang.String]
  /**
    * The contact's first name, or null if no first name is specified.
    */
  var first_name: java.lang.String
  /**
    * The Contact object's ID.
    */
  var id: java.lang.String
  /**
    * A value that indicates whether the contact is set as a favorite
    * contact. If the contact is a favorite, this value is true; otherwise,
    * it is false.
    */
  var is_favorite: scala.Boolean
  /**
    * A value that indicates whether the contact is set as a friend. If the
    * contact is a friend, this value is true; otherwise, it is false.
    */
  var is_friend: scala.Boolean
  /**
    * The contact's last name, or null if no last name is specified.
    */
  var last_name: java.lang.String
  /**
    * The contact's full name, formatted for location.
    */
  var name: java.lang.String
  /**
    * The time, in ISO 8601 format, at which the user last updated the
    * data.
    */
  var updated_time: java.lang.String
  /**
    * The contact's ID, if the contact has one. If not, this value is null.
    */
  var user_id: java.lang.String
}

object IContact {
  @scala.inline
  def apply(
    birth_day: scala.Double,
    birth_month: scala.Double,
    email_hashes: js.Array[java.lang.String],
    first_name: java.lang.String,
    id: java.lang.String,
    is_favorite: scala.Boolean,
    is_friend: scala.Boolean,
    last_name: java.lang.String,
    name: java.lang.String,
    updated_time: java.lang.String,
    user_id: java.lang.String
  ): IContact = {
    val __obj = js.Dynamic.literal(birth_day = birth_day, birth_month = birth_month, email_hashes = email_hashes, first_name = first_name, id = id, is_favorite = is_favorite, is_friend = is_friend, last_name = last_name, name = name, updated_time = updated_time, user_id = user_id)
  
    __obj.asInstanceOf[IContact]
  }
}

