package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialPropertiesHyperCube
  extends InitialProperties
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var qHyperCubeDef: HyperCubeDef
}

object InitialPropertiesHyperCube {
  @scala.inline
  def apply(
    qHyperCubeDef: HyperCubeDef,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): InitialPropertiesHyperCube = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitialPropertiesHyperCube]
  }
}

