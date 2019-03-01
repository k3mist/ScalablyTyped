package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraitsRecord extends js.Object {
  val autonomous_system_number: js.UndefOr[scala.Double] = js.undefined
  val autonomous_system_organization: js.UndefOr[java.lang.String] = js.undefined
  val domain: js.UndefOr[java.lang.String] = js.undefined
  var ip_address: js.UndefOr[java.lang.String] = js.undefined
  val is_anonymous: js.UndefOr[scala.Boolean] = js.undefined
  val is_anonymous_proxy: js.UndefOr[scala.Boolean] = js.undefined
  val is_anonymous_vpn: js.UndefOr[scala.Boolean] = js.undefined
  val is_hosting_provider: js.UndefOr[scala.Boolean] = js.undefined
  val is_legitimate_proxy: js.UndefOr[scala.Boolean] = js.undefined
  val is_public_proxy: js.UndefOr[scala.Boolean] = js.undefined
  val is_satellite_provider: js.UndefOr[scala.Boolean] = js.undefined
  val is_tor_exit_node: js.UndefOr[scala.Boolean] = js.undefined
  val isp: js.UndefOr[java.lang.String] = js.undefined
  val organization: js.UndefOr[java.lang.String] = js.undefined
  val user_type: js.UndefOr[
    maxmindLib.maxmindLibStrings.business | maxmindLib.maxmindLibStrings.cafe | maxmindLib.maxmindLibStrings.cellular | maxmindLib.maxmindLibStrings.college | maxmindLib.maxmindLibStrings.content_delivery_network | maxmindLib.maxmindLibStrings.dialup | maxmindLib.maxmindLibStrings.government | maxmindLib.maxmindLibStrings.hosting | maxmindLib.maxmindLibStrings.library | maxmindLib.maxmindLibStrings.military | maxmindLib.maxmindLibStrings.residential | maxmindLib.maxmindLibStrings.router | maxmindLib.maxmindLibStrings.school | maxmindLib.maxmindLibStrings.search_engine_spider | maxmindLib.maxmindLibStrings.traveler
  ] = js.undefined
}

object TraitsRecord {
  @scala.inline
  def apply(
    autonomous_system_number: scala.Int | scala.Double = null,
    autonomous_system_organization: java.lang.String = null,
    domain: java.lang.String = null,
    ip_address: java.lang.String = null,
    is_anonymous: js.UndefOr[scala.Boolean] = js.undefined,
    is_anonymous_proxy: js.UndefOr[scala.Boolean] = js.undefined,
    is_anonymous_vpn: js.UndefOr[scala.Boolean] = js.undefined,
    is_hosting_provider: js.UndefOr[scala.Boolean] = js.undefined,
    is_legitimate_proxy: js.UndefOr[scala.Boolean] = js.undefined,
    is_public_proxy: js.UndefOr[scala.Boolean] = js.undefined,
    is_satellite_provider: js.UndefOr[scala.Boolean] = js.undefined,
    is_tor_exit_node: js.UndefOr[scala.Boolean] = js.undefined,
    isp: java.lang.String = null,
    organization: java.lang.String = null,
    user_type: maxmindLib.maxmindLibStrings.business | maxmindLib.maxmindLibStrings.cafe | maxmindLib.maxmindLibStrings.cellular | maxmindLib.maxmindLibStrings.college | maxmindLib.maxmindLibStrings.content_delivery_network | maxmindLib.maxmindLibStrings.dialup | maxmindLib.maxmindLibStrings.government | maxmindLib.maxmindLibStrings.hosting | maxmindLib.maxmindLibStrings.library | maxmindLib.maxmindLibStrings.military | maxmindLib.maxmindLibStrings.residential | maxmindLib.maxmindLibStrings.router | maxmindLib.maxmindLibStrings.school | maxmindLib.maxmindLibStrings.search_engine_spider | maxmindLib.maxmindLibStrings.traveler = null
  ): TraitsRecord = {
    val __obj = js.Dynamic.literal()
    if (autonomous_system_number != null) __obj.updateDynamic("autonomous_system_number")(autonomous_system_number.asInstanceOf[js.Any])
    if (autonomous_system_organization != null) __obj.updateDynamic("autonomous_system_organization")(autonomous_system_organization)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address)
    if (!js.isUndefined(is_anonymous)) __obj.updateDynamic("is_anonymous")(is_anonymous)
    if (!js.isUndefined(is_anonymous_proxy)) __obj.updateDynamic("is_anonymous_proxy")(is_anonymous_proxy)
    if (!js.isUndefined(is_anonymous_vpn)) __obj.updateDynamic("is_anonymous_vpn")(is_anonymous_vpn)
    if (!js.isUndefined(is_hosting_provider)) __obj.updateDynamic("is_hosting_provider")(is_hosting_provider)
    if (!js.isUndefined(is_legitimate_proxy)) __obj.updateDynamic("is_legitimate_proxy")(is_legitimate_proxy)
    if (!js.isUndefined(is_public_proxy)) __obj.updateDynamic("is_public_proxy")(is_public_proxy)
    if (!js.isUndefined(is_satellite_provider)) __obj.updateDynamic("is_satellite_provider")(is_satellite_provider)
    if (!js.isUndefined(is_tor_exit_node)) __obj.updateDynamic("is_tor_exit_node")(is_tor_exit_node)
    if (isp != null) __obj.updateDynamic("isp")(isp)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (user_type != null) __obj.updateDynamic("user_type")(user_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraitsRecord]
  }
}

