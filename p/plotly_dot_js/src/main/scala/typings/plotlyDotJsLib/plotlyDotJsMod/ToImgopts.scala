package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToImgopts extends js.Object {
  var format: plotlyDotJsLib.plotlyDotJsLibStrings.jpeg | plotlyDotJsLib.plotlyDotJsLibStrings.png | plotlyDotJsLib.plotlyDotJsLibStrings.webp | plotlyDotJsLib.plotlyDotJsLibStrings.svg
  var height: scala.Double
  var width: scala.Double
}

object ToImgopts {
  @scala.inline
  def apply(
    format: plotlyDotJsLib.plotlyDotJsLibStrings.jpeg | plotlyDotJsLib.plotlyDotJsLibStrings.png | plotlyDotJsLib.plotlyDotJsLibStrings.webp | plotlyDotJsLib.plotlyDotJsLibStrings.svg,
    height: scala.Double,
    width: scala.Double
  ): ToImgopts = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height, width = width)
  
    __obj.asInstanceOf[ToImgopts]
  }
}

