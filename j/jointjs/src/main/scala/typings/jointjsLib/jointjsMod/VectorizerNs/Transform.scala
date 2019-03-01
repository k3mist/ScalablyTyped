package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var rotate: Rotation
  var scale: Scale
  var translate: Translation
  var value: java.lang.String
}

object Transform {
  @scala.inline
  def apply(rotate: Rotation, scale: Scale, translate: Translation, value: java.lang.String): Transform = {
    val __obj = js.Dynamic.literal(rotate = rotate, scale = scale, translate = translate, value = value)
  
    __obj.asInstanceOf[Transform]
  }
}

