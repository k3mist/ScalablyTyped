package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardStatus extends js.Object {
  var hostname: java.lang.String
  var locales: js.Array[java.lang.String]
  var name: java.lang.String
  var region_tag: java.lang.String
  var services: js.Array[Service]
  var slug: java.lang.String
}

object ShardStatus {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    locales: js.Array[java.lang.String],
    name: java.lang.String,
    region_tag: java.lang.String,
    services: js.Array[Service],
    slug: java.lang.String
  ): ShardStatus = {
    val __obj = js.Dynamic.literal(hostname = hostname, locales = locales, name = name, region_tag = region_tag, services = services, slug = slug)
  
    __obj.asInstanceOf[ShardStatus]
  }
}

