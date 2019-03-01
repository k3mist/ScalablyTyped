package typings
package nodeDashConfigDashManagerLib.nodeDashConfigDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var camelCase: scala.Boolean
  var configDir: java.lang.String
  var env: java.lang.String
}

object Options {
  @scala.inline
  def apply(camelCase: scala.Boolean, configDir: java.lang.String, env: java.lang.String): Options = {
    val __obj = js.Dynamic.literal(camelCase = camelCase, configDir = configDir, env = env)
  
    __obj.asInstanceOf[Options]
  }
}

