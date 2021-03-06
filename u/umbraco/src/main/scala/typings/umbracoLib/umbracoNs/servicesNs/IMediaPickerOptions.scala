package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mediapicker dialog options object
  */
trait IMediaPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*Only display files that have an image file-extension*/
  var onlyImages: scala.Boolean
}

object IMediaPickerOptions {
  @scala.inline
  def apply(callback: js.Function, onlyImages: scala.Boolean): IMediaPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback, onlyImages = onlyImages)
  
    __obj.asInstanceOf[IMediaPickerOptions]
  }
}

