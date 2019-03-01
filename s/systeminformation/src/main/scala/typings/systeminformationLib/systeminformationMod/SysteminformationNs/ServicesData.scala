package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesData extends js.Object {
  var name: java.lang.String
  var pcpu: scala.Double
  var pmem: scala.Double
  var running: scala.Boolean
}

object ServicesData {
  @scala.inline
  def apply(name: java.lang.String, pcpu: scala.Double, pmem: scala.Double, running: scala.Boolean): ServicesData = {
    val __obj = js.Dynamic.literal(name = name, pcpu = pcpu, pmem = pmem, running = running)
  
    __obj.asInstanceOf[ServicesData]
  }
}

