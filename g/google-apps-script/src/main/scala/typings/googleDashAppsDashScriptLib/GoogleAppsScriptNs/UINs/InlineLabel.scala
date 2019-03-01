package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineLabel extends js.Object {
  def addClickHandler(handler: Handler): InlineLabel
  def addMouseDownHandler(handler: Handler): InlineLabel
  def addMouseMoveHandler(handler: Handler): InlineLabel
  def addMouseOutHandler(handler: Handler): InlineLabel
  def addMouseOverHandler(handler: Handler): InlineLabel
  def addMouseUpHandler(handler: Handler): InlineLabel
  def addMouseWheelHandler(handler: Handler): InlineLabel
  def addStyleDependentName(styleName: java.lang.String): InlineLabel
  def addStyleName(styleName: java.lang.String): InlineLabel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setDirection(direction: Component): InlineLabel
  def setHeight(height: java.lang.String): InlineLabel
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): InlineLabel
  def setId(id: java.lang.String): InlineLabel
  def setLayoutData(layout: js.Object): InlineLabel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): InlineLabel
  def setSize(width: java.lang.String, height: java.lang.String): InlineLabel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): InlineLabel
  def setStyleAttributes(attributes: js.Object): InlineLabel
  def setStyleName(styleName: java.lang.String): InlineLabel
  def setStylePrimaryName(styleName: java.lang.String): InlineLabel
  def setTag(tag: java.lang.String): InlineLabel
  def setText(text: java.lang.String): InlineLabel
  def setTitle(title: java.lang.String): InlineLabel
  def setVisible(visible: scala.Boolean): InlineLabel
  def setWidth(width: java.lang.String): InlineLabel
  def setWordWrap(wordWrap: scala.Boolean): InlineLabel
}

object InlineLabel {
  @scala.inline
  def apply(
    addClickHandler: js.Function1[Handler, InlineLabel],
    addMouseDownHandler: js.Function1[Handler, InlineLabel],
    addMouseMoveHandler: js.Function1[Handler, InlineLabel],
    addMouseOutHandler: js.Function1[Handler, InlineLabel],
    addMouseOverHandler: js.Function1[Handler, InlineLabel],
    addMouseUpHandler: js.Function1[Handler, InlineLabel],
    addMouseWheelHandler: js.Function1[Handler, InlineLabel],
    addStyleDependentName: js.Function1[java.lang.String, InlineLabel],
    addStyleName: js.Function1[java.lang.String, InlineLabel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setDirection: js.Function1[Component, InlineLabel],
    setHeight: js.Function1[java.lang.String, InlineLabel],
    setHorizontalAlignment: js.Function1[HorizontalAlignment, InlineLabel],
    setId: js.Function1[java.lang.String, InlineLabel],
    setLayoutData: js.Function1[js.Object, InlineLabel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      InlineLabel
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, InlineLabel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, InlineLabel],
    setStyleAttributes: js.Function1[js.Object, InlineLabel],
    setStyleName: js.Function1[java.lang.String, InlineLabel],
    setStylePrimaryName: js.Function1[java.lang.String, InlineLabel],
    setTag: js.Function1[java.lang.String, InlineLabel],
    setText: js.Function1[java.lang.String, InlineLabel],
    setTitle: js.Function1[java.lang.String, InlineLabel],
    setVisible: js.Function1[scala.Boolean, InlineLabel],
    setWidth: js.Function1[java.lang.String, InlineLabel],
    setWordWrap: js.Function1[scala.Boolean, InlineLabel]
  ): InlineLabel = {
    val __obj = js.Dynamic.literal(addClickHandler = addClickHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setDirection = setDirection, setHeight = setHeight, setHorizontalAlignment = setHorizontalAlignment, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth, setWordWrap = setWordWrap)
  
    __obj.asInstanceOf[InlineLabel]
  }
}

