package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasImageSmoothing extends js.Object {
  var imageSmoothingEnabled: scala.Boolean
  var imageSmoothingQuality: ImageSmoothingQuality
}

object CanvasImageSmoothing {
  @scala.inline
  def apply(imageSmoothingEnabled: scala.Boolean, imageSmoothingQuality: ImageSmoothingQuality): CanvasImageSmoothing = {
    val __obj = js.Dynamic.literal(imageSmoothingEnabled = imageSmoothingEnabled, imageSmoothingQuality = imageSmoothingQuality)
  
    __obj.asInstanceOf[CanvasImageSmoothing]
  }
}

