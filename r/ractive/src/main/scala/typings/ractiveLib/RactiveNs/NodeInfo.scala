package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  var index: org.scalablytyped.runtime.StringDictionary[scala.Double]
  var keypath: java.lang.String
  var ractive: Ractive
}

object NodeInfo {
  @scala.inline
  def apply(
    index: org.scalablytyped.runtime.StringDictionary[scala.Double],
    keypath: java.lang.String,
    ractive: Ractive
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(index = index, keypath = keypath, ractive = ractive)
  
    __obj.asInstanceOf[NodeInfo]
  }
}

