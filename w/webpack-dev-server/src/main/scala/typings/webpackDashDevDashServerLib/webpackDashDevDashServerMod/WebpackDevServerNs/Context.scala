package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var `match`: stdLib.RegExpMatchArray
  var parsedUrl: nodeLib.urlMod.Url
}

object Context {
  @scala.inline
  def apply(`match`: stdLib.RegExpMatchArray, parsedUrl: nodeLib.urlMod.Url): Context = {
    val __obj = js.Dynamic.literal(`match` = `match`, parsedUrl = parsedUrl)
  
    __obj.asInstanceOf[Context]
  }
}

