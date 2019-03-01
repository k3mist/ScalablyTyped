package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeConfig extends js.Object {
  var UTC: stdLib.Date
  var apiversion: java.lang.String
  var backup: nodeDashHueDashApiLib.Anon_Errorcode
  var bridgeid: java.lang.String
  var dhcp: scala.Boolean
  var factorynew: scala.Boolean
  var gateway: java.lang.String
  var ipaddress: java.lang.String
  var linkbutton: scala.Boolean
  var localtime: stdLib.Date
  var mac: java.lang.String
  var modelid: java.lang.String
  var name: java.lang.String
  var netmask: java.lang.String
  var portalconnection: java.lang.String
  var portalservices: scala.Boolean
  var portalstate: nodeDashHueDashApiLib.Anon_Communication
  var proxyaddress: java.lang.String
  var proxyport: scala.Double
  var replacesbridgeid: js.UndefOr[java.lang.String] = js.undefined
  var swupdate: nodeDashHueDashApiLib.Anon_Checkforupdate
  var swversion: java.lang.String
  var timezone: java.lang.String
  var whitelist: org.scalablytyped.runtime.StringDictionary[nodeDashHueDashApiLib.Anon_Createdate]
  var zigbeechannel: scala.Double
}

object IBridgeConfig {
  @scala.inline
  def apply(
    UTC: stdLib.Date,
    apiversion: java.lang.String,
    backup: nodeDashHueDashApiLib.Anon_Errorcode,
    bridgeid: java.lang.String,
    dhcp: scala.Boolean,
    factorynew: scala.Boolean,
    gateway: java.lang.String,
    ipaddress: java.lang.String,
    linkbutton: scala.Boolean,
    localtime: stdLib.Date,
    mac: java.lang.String,
    modelid: java.lang.String,
    name: java.lang.String,
    netmask: java.lang.String,
    portalconnection: java.lang.String,
    portalservices: scala.Boolean,
    portalstate: nodeDashHueDashApiLib.Anon_Communication,
    proxyaddress: java.lang.String,
    proxyport: scala.Double,
    swupdate: nodeDashHueDashApiLib.Anon_Checkforupdate,
    swversion: java.lang.String,
    timezone: java.lang.String,
    whitelist: org.scalablytyped.runtime.StringDictionary[nodeDashHueDashApiLib.Anon_Createdate],
    zigbeechannel: scala.Double,
    replacesbridgeid: java.lang.String = null
  ): IBridgeConfig = {
    val __obj = js.Dynamic.literal(UTC = UTC, apiversion = apiversion, backup = backup, bridgeid = bridgeid, dhcp = dhcp, factorynew = factorynew, gateway = gateway, ipaddress = ipaddress, linkbutton = linkbutton, localtime = localtime, mac = mac, modelid = modelid, name = name, netmask = netmask, portalconnection = portalconnection, portalservices = portalservices, portalstate = portalstate, proxyaddress = proxyaddress, proxyport = proxyport, swupdate = swupdate, swversion = swversion, timezone = timezone, whitelist = whitelist, zigbeechannel = zigbeechannel)
    if (replacesbridgeid != null) __obj.updateDynamic("replacesbridgeid")(replacesbridgeid)
    __obj.asInstanceOf[IBridgeConfig]
  }
}

