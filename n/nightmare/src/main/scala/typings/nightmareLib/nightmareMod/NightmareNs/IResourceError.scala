package typings
package nightmareLib.nightmareMod.NightmareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceError extends js.Object {
  var errorCode: scala.Double
  var errorString: java.lang.String
  var id: scala.Double
  var url: java.lang.String
}

object IResourceError {
  @scala.inline
  def apply(errorCode: scala.Double, errorString: java.lang.String, id: scala.Double, url: java.lang.String): IResourceError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorString = errorString, id = id, url = url)
  
    __obj.asInstanceOf[IResourceError]
  }
}

