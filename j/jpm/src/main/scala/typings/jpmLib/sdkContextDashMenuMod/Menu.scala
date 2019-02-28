package typings
package jpmLib.sdkContextDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Menu extends ItemMenuSeparator {
  var contentScript: java.lang.String | js.Array[java.lang.String]
  var contentScriptFile: java.lang.String | js.Array[java.lang.String]
  var context: ItemContext
  var image: java.lang.String | stdLib.URL
  var items: js.Array[ItemMenuSeparator]
  var label: java.lang.String
  var parentMenu: js.UndefOr[Menu] = js.undefined
  def addItem(item: ItemMenuSeparator): scala.Unit
  def destroy(): scala.Unit
  def removeItem(item: ItemMenuSeparator): scala.Unit
}

