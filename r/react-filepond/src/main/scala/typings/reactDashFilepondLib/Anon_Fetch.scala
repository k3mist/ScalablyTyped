package typings
package reactDashFilepondLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fetch extends js.Object {
  var fetch: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl
  var load: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl
  var process: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl
  var restore: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl
  var revert: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl
}

object Anon_Fetch {
  @scala.inline
  def apply(
    fetch: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl,
    load: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl,
    process: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl,
    restore: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl,
    revert: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl
  ): Anon_Fetch = {
    val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], restore = restore.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fetch]
  }
}

