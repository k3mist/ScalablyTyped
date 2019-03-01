package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamName extends js.Object {
  var asterisk: scala.Boolean
  var delimiter: java.lang.String
  var name: java.lang.String
  var optional: scala.Boolean
  var partial: scala.Boolean
  var pattern: java.lang.String
  var prefix: java.lang.String
  var repeat: java.lang.String
}

object ParamName {
  @scala.inline
  def apply(
    asterisk: scala.Boolean,
    delimiter: java.lang.String,
    name: java.lang.String,
    optional: scala.Boolean,
    partial: scala.Boolean,
    pattern: java.lang.String,
    prefix: java.lang.String,
    repeat: java.lang.String
  ): ParamName = {
    val __obj = js.Dynamic.literal(asterisk = asterisk, delimiter = delimiter, name = name, optional = optional, partial = partial, pattern = pattern, prefix = prefix, repeat = repeat)
  
    __obj.asInstanceOf[ParamName]
  }
}

