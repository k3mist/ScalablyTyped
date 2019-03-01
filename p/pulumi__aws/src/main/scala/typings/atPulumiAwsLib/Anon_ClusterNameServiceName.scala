package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClusterNameServiceName extends js.Object {
  var clusterName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var serviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ClusterNameServiceName {
  @scala.inline
  def apply(
    clusterName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    serviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_ClusterNameServiceName = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClusterNameServiceName]
  }
}

