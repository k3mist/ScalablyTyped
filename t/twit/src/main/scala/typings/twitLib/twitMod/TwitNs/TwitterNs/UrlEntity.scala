package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlEntity extends js.Object {
  var display_url: java.lang.String
  var expanded_url: java.lang.String
  var indices: js.Tuple2[scala.Double, scala.Double]
  var url: java.lang.String
}

object UrlEntity {
  @scala.inline
  def apply(
    display_url: java.lang.String,
    expanded_url: java.lang.String,
    indices: js.Tuple2[scala.Double, scala.Double],
    url: java.lang.String
  ): UrlEntity = {
    val __obj = js.Dynamic.literal(display_url = display_url, expanded_url = expanded_url, indices = indices, url = url)
  
    __obj.asInstanceOf[UrlEntity]
  }
}

