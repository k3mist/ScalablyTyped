package typings
package wonderDotJsLib.distEs2015StructureViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends js.Object {
  var dom: js.Any
  var height: scala.Double
  var offset: wonderDotJsLib.Anon_XY
  var styleHeight: java.lang.String
  var styleWidth: java.lang.String
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
  def getContext(contextConfig: wonderDotJsLib.distEs2015CoreDataMainDataMod.ContextConfigData): stdLib.WebGLRenderingContext
  def initCanvas(): scala.Unit
}

object IView {
  @scala.inline
  def apply(
    dom: js.Any,
    getContext: js.Function1[
      wonderDotJsLib.distEs2015CoreDataMainDataMod.ContextConfigData, 
      stdLib.WebGLRenderingContext
    ],
    height: scala.Double,
    initCanvas: js.Function0[scala.Unit],
    offset: wonderDotJsLib.Anon_XY,
    styleHeight: java.lang.String,
    styleWidth: java.lang.String,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): IView = {
    val __obj = js.Dynamic.literal(dom = dom, getContext = getContext, height = height, initCanvas = initCanvas, offset = offset, styleHeight = styleHeight, styleWidth = styleWidth, width = width, x = x, y = y)
  
    __obj.asInstanceOf[IView]
  }
}

