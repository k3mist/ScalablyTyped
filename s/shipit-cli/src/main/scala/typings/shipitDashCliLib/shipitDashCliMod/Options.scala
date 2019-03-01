package typings
package shipitDashCliLib.shipitDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var environment: java.lang.String
  var stderr: nodeLib.fsMod.WriteStream
  var stdout: nodeLib.fsMod.WriteStream
}

object Options {
  @scala.inline
  def apply(
    environment: java.lang.String,
    stderr: nodeLib.fsMod.WriteStream,
    stdout: nodeLib.fsMod.WriteStream
  ): Options = {
    val __obj = js.Dynamic.literal(environment = environment, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Options]
  }
}

