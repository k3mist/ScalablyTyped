package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonEndpoint contains information about a single Daemon endpoint.
  */
trait DaemonEndpoint extends js.Object {
  /**
    * Port number of the given endpoint.
    */
  val Port: scala.Double
}

object DaemonEndpoint {
  @scala.inline
  def apply(Port: scala.Double): DaemonEndpoint = {
    val __obj = js.Dynamic.literal(Port = Port)
  
    __obj.asInstanceOf[DaemonEndpoint]
  }
}

