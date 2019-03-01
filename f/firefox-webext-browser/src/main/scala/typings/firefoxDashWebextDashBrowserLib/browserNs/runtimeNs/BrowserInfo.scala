package typings
package firefoxDashWebextDashBrowserLib.browserNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing information about the current browser. */
trait BrowserInfo extends js.Object {
  /** The browser's build ID/date, for example '20160101'. */
  var buildID: java.lang.String
  /** The name of the browser, for example 'Firefox'. */
  var name: java.lang.String
  /** The name of the browser vendor, for example 'Mozilla'. */
  var vendor: java.lang.String
  /** The browser's version, for example '42.0.0' or '0.8.1pre'. */
  var version: java.lang.String
}

object BrowserInfo {
  @scala.inline
  def apply(
    buildID: java.lang.String,
    name: java.lang.String,
    vendor: java.lang.String,
    version: java.lang.String
  ): BrowserInfo = {
    val __obj = js.Dynamic.literal(buildID = buildID, name = name, vendor = vendor, version = version)
  
    __obj.asInstanceOf[BrowserInfo]
  }
}

