package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken", "JsonWebTokenError")
@js.native
class JsonWebTokenError protected ()
  extends nodeLib.Error
     with VerifyErrors {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, error: nodeLib.Error) = this()
  var inner: nodeLib.Error = js.native
}

