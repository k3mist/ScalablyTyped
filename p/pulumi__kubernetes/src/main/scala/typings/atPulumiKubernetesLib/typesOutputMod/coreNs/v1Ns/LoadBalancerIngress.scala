package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended
  * for the service should be sent to an ingress point.
  */
trait LoadBalancerIngress extends js.Object {
  /**
    * Hostname is set for load-balancer ingress points that are DNS based (typically AWS
    * load-balancers)
    */
  val hostname: java.lang.String
  /**
    * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack
    * load-balancers)
    */
  val ip: java.lang.String
}

object LoadBalancerIngress {
  @scala.inline
  def apply(hostname: java.lang.String, ip: java.lang.String): LoadBalancerIngress = {
    val __obj = js.Dynamic.literal(hostname = hostname, ip = ip)
  
    __obj.asInstanceOf[LoadBalancerIngress]
  }
}

