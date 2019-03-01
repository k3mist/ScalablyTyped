package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendObjectResult extends js.Object {
  var name: java.lang.String
  var nextAppendPosition: java.lang.String
   // the url of oss
  var res: NormalSuccessResponse
  var url: java.lang.String
}

object AppendObjectResult {
  @scala.inline
  def apply(
    name: java.lang.String,
    nextAppendPosition: java.lang.String,
    res: NormalSuccessResponse,
    url: java.lang.String
  ): AppendObjectResult = {
    val __obj = js.Dynamic.literal(name = name, nextAppendPosition = nextAppendPosition, res = res, url = url)
  
    __obj.asInstanceOf[AppendObjectResult]
  }
}

