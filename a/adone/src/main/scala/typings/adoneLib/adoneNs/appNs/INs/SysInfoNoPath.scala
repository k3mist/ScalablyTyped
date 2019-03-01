package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SysInfoNoPath extends SysInfo {
  @JSName("path")
  var path_SysInfoNoPath: scala.Null
}

object SysInfoNoPath {
  @scala.inline
  def apply(
    configureArgs: js.Array[_],
    description: java.lang.String,
    group: java.lang.String,
    instance: adoneLib.adoneNs.appNs.Subsystem,
    name: java.lang.String,
    path: scala.Null
  ): SysInfoNoPath = {
    val __obj = js.Dynamic.literal(configureArgs = configureArgs, description = description, group = group, instance = instance, name = name, path = path)
  
    __obj.asInstanceOf[SysInfoNoPath]
  }
}

