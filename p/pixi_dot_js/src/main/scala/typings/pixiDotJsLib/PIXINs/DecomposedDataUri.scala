package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
///////////////////////////////UTILS//////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
trait DecomposedDataUri extends js.Object {
  var data: js.Any
  var encoding: java.lang.String
  var mediaType: java.lang.String
  var subType: java.lang.String
}

object DecomposedDataUri {
  @scala.inline
  def apply(data: js.Any, encoding: java.lang.String, mediaType: java.lang.String, subType: java.lang.String): DecomposedDataUri = {
    val __obj = js.Dynamic.literal(data = data, encoding = encoding, mediaType = mediaType, subType = subType)
  
    __obj.asInstanceOf[DecomposedDataUri]
  }
}

