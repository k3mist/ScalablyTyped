package typings
package gruntLib.nodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://npmjs.org/doc/json.html}
  */
trait NodePackage extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var homepage: js.UndefOr[java.lang.String] = js.undefined
  var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var version: java.lang.String
}

object NodePackage {
  @scala.inline
  def apply(
    name: java.lang.String,
    version: java.lang.String,
    description: java.lang.String = null,
    homepage: java.lang.String = null,
    keywords: js.Array[java.lang.String] = null
  ): NodePackage = {
    val __obj = js.Dynamic.literal(name = name, version = version)
    if (description != null) __obj.updateDynamic("description")(description)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    __obj.asInstanceOf[NodePackage]
  }
}

