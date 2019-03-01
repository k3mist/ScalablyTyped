package typings
package atMaterialFloatingDashLabelLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFloatingLabelAdapter extends js.Object {
  /**
    * Adds a class to the label element.
    */
  def addClass(className: java.lang.String): scala.Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Returns the width of the label element.
    */
  def getWidth(): scala.Double
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Removes a class from the label element.
    */
  def removeClass(className: java.lang.String): scala.Unit
}

object MDCFloatingLabelAdapter {
  @scala.inline
  def apply(
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    getWidth: js.Function0[scala.Double],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit]
  ): MDCFloatingLabelAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, deregisterInteractionHandler = deregisterInteractionHandler, getWidth = getWidth, registerInteractionHandler = registerInteractionHandler, removeClass = removeClass)
  
    __obj.asInstanceOf[MDCFloatingLabelAdapter]
  }
}

