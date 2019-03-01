package typings
package atMaterialToolbarLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCToolbarAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterResizeHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterScrollHandler(handler: stdLib.EventListener): scala.Unit
  def getFirstRowElementOffsetHeight(): scala.Double
  def getOffsetHeight(): scala.Double
  def getViewportScrollY(): scala.Double
  def getViewportWidth(): scala.Double
  def hasClass(className: java.lang.String): scala.Boolean
  def notifyChange(evtData: atMaterialToolbarLib.Anon_FlexibleExpansionRatio): scala.Unit
  def registerResizeHandler(handler: stdLib.EventListener): scala.Unit
  def registerScrollHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def setStyle(property: java.lang.String, value: java.lang.String): scala.Unit
  def setStyleForFixedAdjustElement(property: java.lang.String, value: java.lang.String): scala.Unit
  def setStyleForFlexibleRowElement(property: java.lang.String, value: java.lang.String): scala.Unit
  def setStyleForTitleElement(property: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCToolbarAdapter {
  @scala.inline
  def apply(
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterScrollHandler: js.Function1[stdLib.EventListener, scala.Unit],
    getFirstRowElementOffsetHeight: js.Function0[scala.Double],
    getOffsetHeight: js.Function0[scala.Double],
    getViewportScrollY: js.Function0[scala.Double],
    getViewportWidth: js.Function0[scala.Double],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    notifyChange: js.Function1[atMaterialToolbarLib.Anon_FlexibleExpansionRatio, scala.Unit],
    registerResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerScrollHandler: js.Function1[stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setStyle: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStyleForFixedAdjustElement: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStyleForFlexibleRowElement: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStyleForTitleElement: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCToolbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, deregisterResizeHandler = deregisterResizeHandler, deregisterScrollHandler = deregisterScrollHandler, getFirstRowElementOffsetHeight = getFirstRowElementOffsetHeight, getOffsetHeight = getOffsetHeight, getViewportScrollY = getViewportScrollY, getViewportWidth = getViewportWidth, hasClass = hasClass, notifyChange = notifyChange, registerResizeHandler = registerResizeHandler, registerScrollHandler = registerScrollHandler, removeClass = removeClass, setStyle = setStyle, setStyleForFixedAdjustElement = setStyleForFixedAdjustElement, setStyleForFlexibleRowElement = setStyleForFlexibleRowElement, setStyleForTitleElement = setStyleForTitleElement)
  
    __obj.asInstanceOf[MDCToolbarAdapter]
  }
}

