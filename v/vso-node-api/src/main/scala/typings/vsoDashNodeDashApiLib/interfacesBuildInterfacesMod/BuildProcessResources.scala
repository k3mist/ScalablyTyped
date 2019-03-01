package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildProcessResources extends js.Object {
  var endpoints: js.Array[ServiceEndpointReference]
  var files: js.Array[SecureFileReference]
  var queues: js.Array[AgentPoolQueueReference]
}

object BuildProcessResources {
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpointReference],
    files: js.Array[SecureFileReference],
    queues: js.Array[AgentPoolQueueReference]
  ): BuildProcessResources = {
    val __obj = js.Dynamic.literal(endpoints = endpoints, files = files, queues = queues)
  
    __obj.asInstanceOf[BuildProcessResources]
  }
}

