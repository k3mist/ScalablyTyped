package typings
package atMaterialTabLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    */
  def addClass(className: java.lang.String): scala.Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Returns whether the root element has the given className.
    */
  def hasClass(className: java.lang.String): scala.Boolean
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Removes the given className from the root element.
    */
  def removeClass(className: java.lang.String): scala.Unit
  /**
    * Sets the given attrName of the root element to the given value.
    */
  def setAttr(attr: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCTabAdapter {
  @scala.inline
  def apply(
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterEventHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    registerEventHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setAttr: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, deregisterEventHandler = deregisterEventHandler, hasClass = hasClass, registerEventHandler = registerEventHandler, removeClass = removeClass, setAttr = setAttr)
  
    __obj.asInstanceOf[MDCTabAdapter]
  }
}

