package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeclarationOptions extends js.Object {
  /**
    * The XML encoding to be included in the declaration. If defined, this
    * value must be a valid encoding. If left undefined, no encoding is
    * included.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `include` is true, an XML declaration is included in the generated
    * XML. If left undefined, the default value is `true`.
    */
  var include: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The XML standalone attribute to be included. If defined, this value must
    * be `"yes"` or `"no"`. If left undefined, no standalone attribute is
    * included.
    */
  var standalone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The XML version to be included in the declaration. If defined, this
    * value must be a valid XML version number. If left undefined, the default
    * version is `"1.0"`.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object IDeclarationOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    include: js.UndefOr[scala.Boolean] = js.undefined,
    standalone: java.lang.String = null,
    version: java.lang.String = null
  ): IDeclarationOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include)
    if (standalone != null) __obj.updateDynamic("standalone")(standalone)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IDeclarationOptions]
  }
}

