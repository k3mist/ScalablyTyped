package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsoidSurfaceAppearance extends Appearance {
  val aboveGround: scala.Boolean
  val faceForward: scala.Boolean
  val flat: scala.Boolean
  val vertexFormat: VertexFormat
}

object EllipsoidSurfaceAppearance {
  @scala.inline
  def apply(
    aboveGround: scala.Boolean,
    closed: scala.Boolean,
    faceForward: scala.Boolean,
    flat: scala.Boolean,
    fragmentShaderSource: java.lang.String,
    getFragmentShaderSource: js.Function0[java.lang.String],
    getRenderState: js.Function0[js.Any],
    isTranslucent: js.Function0[scala.Boolean],
    material: Material,
    renderState: js.Any,
    translucent: scala.Boolean,
    vertexFormat: VertexFormat,
    vertexShaderSource: java.lang.String
  ): EllipsoidSurfaceAppearance = {
    val __obj = js.Dynamic.literal(aboveGround = aboveGround, closed = closed, faceForward = faceForward, flat = flat, fragmentShaderSource = fragmentShaderSource, getFragmentShaderSource = getFragmentShaderSource, getRenderState = getRenderState, isTranslucent = isTranslucent, material = material, renderState = renderState, translucent = translucent, vertexFormat = vertexFormat, vertexShaderSource = vertexShaderSource)
  
    __obj.asInstanceOf[EllipsoidSurfaceAppearance]
  }
}

