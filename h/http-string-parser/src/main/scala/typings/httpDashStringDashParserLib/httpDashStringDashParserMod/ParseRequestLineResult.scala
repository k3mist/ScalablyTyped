package typings
package httpDashStringDashParserLib.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseRequestLineResult extends js.Object {
  var method: java.lang.String
  var protocol: java.lang.String
  var uri: java.lang.String
}

object ParseRequestLineResult {
  @scala.inline
  def apply(method: java.lang.String, protocol: java.lang.String, uri: java.lang.String): ParseRequestLineResult = {
    val __obj = js.Dynamic.literal(method = method, protocol = protocol, uri = uri)
  
    __obj.asInstanceOf[ParseRequestLineResult]
  }
}

