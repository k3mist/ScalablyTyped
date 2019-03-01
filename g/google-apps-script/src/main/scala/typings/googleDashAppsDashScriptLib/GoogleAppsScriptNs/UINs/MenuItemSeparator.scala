package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemSeparator extends js.Object {
  def addStyleDependentName(styleName: java.lang.String): MenuItemSeparator
  def addStyleName(styleName: java.lang.String): MenuItemSeparator
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setHeight(height: java.lang.String): MenuItemSeparator
  def setId(id: java.lang.String): MenuItemSeparator
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): MenuItemSeparator
  def setSize(width: java.lang.String, height: java.lang.String): MenuItemSeparator
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): MenuItemSeparator
  def setStyleAttributes(attributes: js.Object): MenuItemSeparator
  def setStyleName(styleName: java.lang.String): MenuItemSeparator
  def setStylePrimaryName(styleName: java.lang.String): MenuItemSeparator
  def setTag(tag: java.lang.String): MenuItemSeparator
  def setTitle(title: java.lang.String): MenuItemSeparator
  def setVisible(visible: scala.Boolean): MenuItemSeparator
  def setWidth(width: java.lang.String): MenuItemSeparator
}

object MenuItemSeparator {
  @scala.inline
  def apply(
    addStyleDependentName: js.Function1[java.lang.String, MenuItemSeparator],
    addStyleName: js.Function1[java.lang.String, MenuItemSeparator],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setHeight: js.Function1[java.lang.String, MenuItemSeparator],
    setId: js.Function1[java.lang.String, MenuItemSeparator],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      MenuItemSeparator
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, MenuItemSeparator],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, MenuItemSeparator],
    setStyleAttributes: js.Function1[js.Object, MenuItemSeparator],
    setStyleName: js.Function1[java.lang.String, MenuItemSeparator],
    setStylePrimaryName: js.Function1[java.lang.String, MenuItemSeparator],
    setTag: js.Function1[java.lang.String, MenuItemSeparator],
    setTitle: js.Function1[java.lang.String, MenuItemSeparator],
    setVisible: js.Function1[scala.Boolean, MenuItemSeparator],
    setWidth: js.Function1[java.lang.String, MenuItemSeparator]
  ): MenuItemSeparator = {
    val __obj = js.Dynamic.literal(addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setHeight = setHeight, setId = setId, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth)
  
    __obj.asInstanceOf[MenuItemSeparator]
  }
}

