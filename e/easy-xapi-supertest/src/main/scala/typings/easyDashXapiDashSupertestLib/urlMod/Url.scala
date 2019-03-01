package typings
package easyDashXapiDashSupertestLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var auth: java.lang.String
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var query: js.Any
  var search: java.lang.String
   // string | Object
  var slashes: scala.Boolean
}

object Url {
  @scala.inline
  def apply(
    auth: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    query: js.Any,
    search: java.lang.String,
    slashes: scala.Boolean,
    hash: java.lang.String = null,
    path: java.lang.String = null
  ): Url = {
    val __obj = js.Dynamic.literal(auth = auth, host = host, hostname = hostname, href = href, pathname = pathname, port = port, protocol = protocol, query = query, search = search, slashes = slashes)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Url]
  }
}

