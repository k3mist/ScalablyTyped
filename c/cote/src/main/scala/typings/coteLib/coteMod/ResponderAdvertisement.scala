package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponderAdvertisement extends Advertisement {
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[java.lang.String] = js.undefined
}

object ResponderAdvertisement {
  @scala.inline
  def apply(
    name: java.lang.String,
    key: java.lang.String = null,
    namespace: java.lang.String = null,
    respondsTo: js.Array[java.lang.String] = null,
    subset: java.lang.String = null
  ): ResponderAdvertisement = {
    val __obj = js.Dynamic.literal(name = name)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (respondsTo != null) __obj.updateDynamic("respondsTo")(respondsTo)
    if (subset != null) __obj.updateDynamic("subset")(subset)
    __obj.asInstanceOf[ResponderAdvertisement]
  }
}

