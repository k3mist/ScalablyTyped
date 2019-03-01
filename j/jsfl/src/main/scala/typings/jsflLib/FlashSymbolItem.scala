package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSymbolItem extends js.Object {
  var scalingGrid: scala.Boolean
  var scalingGridRect: FlashRectangle
  var sourceAutoUpdate: scala.Boolean
  var sourceFilePath: java.lang.String
  var sourceLibraryName: java.lang.String
  var symbolType: java.lang.String
  var timeline: FlashTimeline
  def convertToCompiledClip(): scala.Unit
  def exportSWC(outputURI: java.lang.String): scala.Unit
  def exportSWF(outputURI: java.lang.String): scala.Unit
}

object FlashSymbolItem {
  @scala.inline
  def apply(
    convertToCompiledClip: js.Function0[scala.Unit],
    exportSWC: js.Function1[java.lang.String, scala.Unit],
    exportSWF: js.Function1[java.lang.String, scala.Unit],
    scalingGrid: scala.Boolean,
    scalingGridRect: FlashRectangle,
    sourceAutoUpdate: scala.Boolean,
    sourceFilePath: java.lang.String,
    sourceLibraryName: java.lang.String,
    symbolType: java.lang.String,
    timeline: FlashTimeline
  ): FlashSymbolItem = {
    val __obj = js.Dynamic.literal(convertToCompiledClip = convertToCompiledClip, exportSWC = exportSWC, exportSWF = exportSWF, scalingGrid = scalingGrid, scalingGridRect = scalingGridRect, sourceAutoUpdate = sourceAutoUpdate, sourceFilePath = sourceFilePath, sourceLibraryName = sourceLibraryName, symbolType = symbolType, timeline = timeline)
  
    __obj.asInstanceOf[FlashSymbolItem]
  }
}

