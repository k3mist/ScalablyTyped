package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError
  extends StdError
     with gotLib.gotMod.gotNs.GotError {
  var name: gotLib.gotLibStrings.ParseError
  var statusCode: scala.Double
  var statusMessage: java.lang.String
}

