package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceReferenceObject extends js.Object {
  var character: scala.Double
  var fileName: java.lang.String
  var line: scala.Double
}

object SourceReferenceObject {
  @scala.inline
  def apply(character: scala.Double, fileName: java.lang.String, line: scala.Double): SourceReferenceObject = {
    val __obj = js.Dynamic.literal(character = character, fileName = fileName, line = line)
  
    __obj.asInstanceOf[SourceReferenceObject]
  }
}

