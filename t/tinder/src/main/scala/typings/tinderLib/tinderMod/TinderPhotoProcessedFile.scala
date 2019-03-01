package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderPhotoProcessedFile extends js.Object {
  var height: scala.Double
  var url: java.lang.String
  var width: scala.Double
}

object TinderPhotoProcessedFile {
  @scala.inline
  def apply(height: scala.Double, url: java.lang.String, width: scala.Double): TinderPhotoProcessedFile = {
    val __obj = js.Dynamic.literal(height = height, url = url, width = width)
  
    __obj.asInstanceOf[TinderPhotoProcessedFile]
  }
}

