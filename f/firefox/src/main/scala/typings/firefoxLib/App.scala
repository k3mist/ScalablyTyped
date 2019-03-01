package typings
package firefoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var installOrigin: java.lang.String
  var installTime: scala.Double
  var manifest: js.Any
  var manifestURL: java.lang.String
  var origin: java.lang.String
  var receipts: js.Array[_]
  def checkForUpdate(): DOMRequest[_]
  def launch(): scala.Unit
}

object App {
  @scala.inline
  def apply(
    checkForUpdate: js.Function0[DOMRequest[_]],
    installOrigin: java.lang.String,
    installTime: scala.Double,
    launch: js.Function0[scala.Unit],
    manifest: js.Any,
    manifestURL: java.lang.String,
    origin: java.lang.String,
    receipts: js.Array[_]
  ): App = {
    val __obj = js.Dynamic.literal(checkForUpdate = checkForUpdate, installOrigin = installOrigin, installTime = installTime, launch = launch, manifest = manifest, manifestURL = manifestURL, origin = origin, receipts = receipts)
  
    __obj.asInstanceOf[App]
  }
}

