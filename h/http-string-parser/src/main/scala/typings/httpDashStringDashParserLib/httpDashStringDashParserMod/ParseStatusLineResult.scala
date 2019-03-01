package typings
package httpDashStringDashParserLib.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseStatusLineResult extends js.Object {
  var protocol: java.lang.String
  var statusCode: java.lang.String
  var statusMessage: java.lang.String
}

object ParseStatusLineResult {
  @scala.inline
  def apply(protocol: java.lang.String, statusCode: java.lang.String, statusMessage: java.lang.String): ParseStatusLineResult = {
    val __obj = js.Dynamic.literal(protocol = protocol, statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[ParseStatusLineResult]
  }
}

