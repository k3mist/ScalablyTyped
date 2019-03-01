package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationRule extends js.Object {
  /**
    * Deprecation description of the selected element(s). It can be provided if an
    * element is marked as `deprecated`.
    */
  var deprecationDescription: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the selected API(s). */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The selector is a comma-separated list of patterns. Each pattern is a
    * qualified name of the element which may end in "&#42;", indicating a wildcard.
    * Wildcards are only allowed at the end and for a whole component of the
    * qualified name, i.e. "foo.&#42;" is ok, but not "foo.b&#42;" or "foo.&#42;.bar". To
    * specify a default for all applicable elements, the whole pattern "&#42;"
    * is used.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentationRule {
  @scala.inline
  def apply(
    deprecationDescription: java.lang.String = null,
    description: java.lang.String = null,
    selector: java.lang.String = null
  ): DocumentationRule = {
    val __obj = js.Dynamic.literal()
    if (deprecationDescription != null) __obj.updateDynamic("deprecationDescription")(deprecationDescription)
    if (description != null) __obj.updateDynamic("description")(description)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[DocumentationRule]
  }
}

