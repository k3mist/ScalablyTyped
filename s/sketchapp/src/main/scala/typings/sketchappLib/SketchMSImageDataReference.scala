package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImageDataReference extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.jSONOriginalDataReference
  var _ref: java.lang.String
  var _ref_class: sketchappLib.sketchappLibStrings.imageData
  var data: Anon_Data
  var sha1: Anon_Data
}

object SketchMSImageDataReference {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.jSONOriginalDataReference,
    _ref: java.lang.String,
    _ref_class: sketchappLib.sketchappLibStrings.imageData,
    data: Anon_Data,
    sha1: Anon_Data
  ): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal(_class = _class, _ref = _ref, _ref_class = _ref_class, data = data, sha1 = sha1)
  
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
}

