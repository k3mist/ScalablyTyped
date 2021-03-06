package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a standard control.
  * @see {@link Control}
  */
@js.native
trait StandardControl
  extends Control
     with UiStandardElement
     with UiFocusable {
  /**
    * Displays an error or recommendation notification for a control, and lets you specify actions to execute based on the notification.
    */
  def addNotification(notification: AddControlNotificationOptions): scala.Unit = js.native
  /**
    * Clears the notification identified by uniqueId.
    * @param uniqueId (Optional) Unique identifier.
    * @returns true if it succeeds, false if it fails.
    * @remarks If the uniqueId parameter is not used, the current notification shown will be removed.
    */
  def clearNotification(): scala.Boolean = js.native
  def clearNotification(uniqueId: java.lang.String): scala.Boolean = js.native
  /**
    * Gets the control's bound attribute.
    * @returns The attribute.
    */
  def getAttribute(): xrmLib.XrmNs.AttributesNs.Attribute = js.native
  /**
    * Gets the control's bound attribute.
    * @template T An Attribute type.
    * @returns The attribute.
    */
  @JSName("getAttribute")
  def getAttribute_TAttributeT[T /* <: xrmLib.XrmNs.AttributesNs.Attribute */](): T = js.native
  /**
    * Gets a boolean value, indicating whether the control is disabled.
    * @returns true if it is disabled, otherwise false.
    */
  def getDisabled(): scala.Boolean = js.native
  /**
    * Sets the state of the control to either enabled, or disabled.
    * @param disabled true to disable, false to enable.
    */
  def setDisabled(disabled: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a control-local notification message.
    * @param message The message.
    * @param uniqueId Unique identifier.
    * @returns true if it succeeds, false if it fails.
    * @remarks     When this method is used on Microsoft Dynamics CRM for tablets a red "X" icon
    *              appears next to the control. Tapping on the icon will display the message.
    */
  def setNotification(message: java.lang.String, uniqueId: java.lang.String): scala.Boolean = js.native
}

