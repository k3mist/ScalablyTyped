package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevice extends js.Object {
  /**
    * A device unique ID.
    */
  var id: java.lang.String
  /**
    * The IP address.
    */
  var ip: java.lang.String
  /**
    * The device language.
    */
  var language: java.lang.String
  /**
    * The current display language of the operating system.
    */
  var locale: java.lang.String
  /**
    * The device model for the current device.
    */
  var model: java.lang.String
  /**
    * The IANA interface type for the internet connected network adapter.
    */
  var network: scala.Double
  /**
    * The device OEM for the current device.
    */
  var oemName: java.lang.String
  /**
    * The OS name.
    */
  var os: java.lang.String
  /**
    * The OS version.
    */
  var osversion: java.lang.String
  /**
    * The application screen resolution.
    */
  var resolution: java.lang.String
  /**
    * The type for the current device.
    */
  var `type`: java.lang.String
}

object IDevice {
  @scala.inline
  def apply(
    id: java.lang.String,
    ip: java.lang.String,
    language: java.lang.String,
    locale: java.lang.String,
    model: java.lang.String,
    network: scala.Double,
    oemName: java.lang.String,
    os: java.lang.String,
    osversion: java.lang.String,
    resolution: java.lang.String,
    `type`: java.lang.String
  ): IDevice = {
    val __obj = js.Dynamic.literal(id = id, ip = ip, language = language, locale = locale, model = model, network = network, oemName = oemName, os = os, osversion = osversion, resolution = resolution, `type` = `type`)
  
    __obj.asInstanceOf[IDevice]
  }
}

