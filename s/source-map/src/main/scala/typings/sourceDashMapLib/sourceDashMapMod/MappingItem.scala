package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingItem extends js.Object {
  var generatedColumn: scala.Double
  var generatedLine: scala.Double
  var name: java.lang.String
  var originalColumn: scala.Double
  var originalLine: scala.Double
  var source: java.lang.String
}

object MappingItem {
  @scala.inline
  def apply(
    generatedColumn: scala.Double,
    generatedLine: scala.Double,
    name: java.lang.String,
    originalColumn: scala.Double,
    originalLine: scala.Double,
    source: java.lang.String
  ): MappingItem = {
    val __obj = js.Dynamic.literal(generatedColumn = generatedColumn, generatedLine = generatedLine, name = name, originalColumn = originalColumn, originalLine = originalLine, source = source)
  
    __obj.asInstanceOf[MappingItem]
  }
}

