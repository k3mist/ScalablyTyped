package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterBgpPeer extends js.Object {
  /**
    * The priority of routes advertised to this BGP peer. In the case where there is more than one matching route of maximum length, the routes with lowest
    * priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[scala.Double] = js.undefined
  /** Name of the interface the BGP peer is associated with. */
  var interfaceName: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the interface inside Google Cloud Platform. Only IPv4 is supported. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Peer BGP Autonomous System Number (ASN). For VPN use case, this value can be different for every tunnel. */
  var peerAsn: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the BGP interface outside Google cloud. Only IPv4 is supported. */
  var peerIpAddress: js.UndefOr[java.lang.String] = js.undefined
}

object RouterBgpPeer {
  @scala.inline
  def apply(
    advertisedRoutePriority: scala.Int | scala.Double = null,
    interfaceName: java.lang.String = null,
    ipAddress: java.lang.String = null,
    name: java.lang.String = null,
    peerAsn: scala.Int | scala.Double = null,
    peerIpAddress: java.lang.String = null
  ): RouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    if (advertisedRoutePriority != null) __obj.updateDynamic("advertisedRoutePriority")(advertisedRoutePriority.asInstanceOf[js.Any])
    if (interfaceName != null) __obj.updateDynamic("interfaceName")(interfaceName)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (name != null) __obj.updateDynamic("name")(name)
    if (peerAsn != null) __obj.updateDynamic("peerAsn")(peerAsn.asInstanceOf[js.Any])
    if (peerIpAddress != null) __obj.updateDynamic("peerIpAddress")(peerIpAddress)
    __obj.asInstanceOf[RouterBgpPeer]
  }
}

