package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var URI: java.lang.String
  var URIPrefix: java.lang.String
  var callTimeout: scala.Double
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def execute(name: java.lang.String, params: js.Object, callback: CbCallback): scala.Unit
}

object Code {
  @scala.inline
  def apply(
    URI: java.lang.String,
    URIPrefix: java.lang.String,
    callTimeout: scala.Double,
    execute: js.Function3[java.lang.String, js.Object, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI, URIPrefix = URIPrefix, callTimeout = callTimeout, execute = execute, systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[Code]
  }
}

