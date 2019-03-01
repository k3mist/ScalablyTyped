package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Resource class.
  */
trait ASPxClientResource extends js.Object {
  /**
    * Returns the resource's caption.
    * Value: A string value that is the resource's caption.
    */
  var caption: java.lang.String
  /**
    * Gets the resource's color.
    * Value: A string value representing the resource's color name.
    */
  var color: java.lang.String
  /**
    * Gets the resource ID.
    * Value: A string value representing the resource ID.
    */
  var resourceId: java.lang.String
  /**
    * Returns the resource's caption.
    */
  def GetCaption(): java.lang.String
  /**
    * Gets the resource's color.
    */
  def GetColor(): java.lang.String
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): java.lang.String
}

object ASPxClientResource {
  @scala.inline
  def apply(
    GetCaption: js.Function0[java.lang.String],
    GetColor: js.Function0[java.lang.String],
    GetId: js.Function0[java.lang.String],
    caption: java.lang.String,
    color: java.lang.String,
    resourceId: java.lang.String
  ): ASPxClientResource = {
    val __obj = js.Dynamic.literal(GetCaption = GetCaption, GetColor = GetColor, GetId = GetId, caption = caption, color = color, resourceId = resourceId)
  
    __obj.asInstanceOf[ASPxClientResource]
  }
}

