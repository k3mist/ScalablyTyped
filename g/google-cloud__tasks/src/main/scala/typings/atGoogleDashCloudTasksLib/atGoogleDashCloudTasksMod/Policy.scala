package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var bindings: js.Array[Binding]
  var etag: java.lang.String
  var version: scala.Double
}

object Policy {
  @scala.inline
  def apply(bindings: js.Array[Binding], etag: java.lang.String, version: scala.Double): Policy = {
    val __obj = js.Dynamic.literal(bindings = bindings, etag = etag, version = version)
  
    __obj.asInstanceOf[Policy]
  }
}

