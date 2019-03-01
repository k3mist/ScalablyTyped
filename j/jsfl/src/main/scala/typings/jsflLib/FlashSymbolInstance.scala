package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSymbolInstance extends js.Object {
  var accName: java.lang.String
  var actionScript: java.lang.String
  var backgroundColor: java.lang.String
  var bitmapRenderMode: java.lang.String
  var blendMode: java.lang.String
  var buttonTracking: java.lang.String
  var cacheAsBitmap: scala.Boolean
  var colorAlphaAmount: scala.Double
  var colorAlphaPercent: scala.Double
  var colorBlueAmount: scala.Double
  var colorBluePercent: scala.Double
  var colorGreenAmount: scala.Double
  var colorGreenPercent: scala.Double
  var colorMode: java.lang.String
  var colorRedAmount: scala.Double
  var colorRedPercent: scala.Double
  var description: java.lang.String
  var filters: js.Array[FlashFilter]
  var firstFrame: scala.Double
  var forceSimple: scala.Boolean
  var loop: java.lang.String
  var shortcut: java.lang.String
  var silent: scala.Boolean
  var symbolType: java.lang.String
  var tabIndex: scala.Double
  var useBackgroundColor: scala.Boolean
  var visible: scala.Boolean
}

object FlashSymbolInstance {
  @scala.inline
  def apply(
    accName: java.lang.String,
    actionScript: java.lang.String,
    backgroundColor: java.lang.String,
    bitmapRenderMode: java.lang.String,
    blendMode: java.lang.String,
    buttonTracking: java.lang.String,
    cacheAsBitmap: scala.Boolean,
    colorAlphaAmount: scala.Double,
    colorAlphaPercent: scala.Double,
    colorBlueAmount: scala.Double,
    colorBluePercent: scala.Double,
    colorGreenAmount: scala.Double,
    colorGreenPercent: scala.Double,
    colorMode: java.lang.String,
    colorRedAmount: scala.Double,
    colorRedPercent: scala.Double,
    description: java.lang.String,
    filters: js.Array[FlashFilter],
    firstFrame: scala.Double,
    forceSimple: scala.Boolean,
    loop: java.lang.String,
    shortcut: java.lang.String,
    silent: scala.Boolean,
    symbolType: java.lang.String,
    tabIndex: scala.Double,
    useBackgroundColor: scala.Boolean,
    visible: scala.Boolean
  ): FlashSymbolInstance = {
    val __obj = js.Dynamic.literal(accName = accName, actionScript = actionScript, backgroundColor = backgroundColor, bitmapRenderMode = bitmapRenderMode, blendMode = blendMode, buttonTracking = buttonTracking, cacheAsBitmap = cacheAsBitmap, colorAlphaAmount = colorAlphaAmount, colorAlphaPercent = colorAlphaPercent, colorBlueAmount = colorBlueAmount, colorBluePercent = colorBluePercent, colorGreenAmount = colorGreenAmount, colorGreenPercent = colorGreenPercent, colorMode = colorMode, colorRedAmount = colorRedAmount, colorRedPercent = colorRedPercent, description = description, filters = filters, firstFrame = firstFrame, forceSimple = forceSimple, loop = loop, shortcut = shortcut, silent = silent, symbolType = symbolType, tabIndex = tabIndex, useBackgroundColor = useBackgroundColor, visible = visible)
  
    __obj.asInstanceOf[FlashSymbolInstance]
  }
}

