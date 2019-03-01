package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDtdOptions extends js.Object {
  /**
    * If `include` is `true`, an XML DTD is included in the resulting XML. If
    * left undefined, the default value is `true`.
    */
  var include: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the DTD. This value cannot be left undefined if `include`
    * is `true`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The public identifier of the DTD, excluding quotation marks. If `pubId`
    * is defined, `sysId` must be defined as well. If left undefined, no
    * public identifier is included.
    */
  var pubId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The system identifier of the DTD, excluding quotation marks. If left
    * undefined, no system identifier is included.
    */
  var sysId: js.UndefOr[java.lang.String] = js.undefined
}

object IDtdOptions {
  @scala.inline
  def apply(
    include: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    pubId: java.lang.String = null,
    sysId: java.lang.String = null
  ): IDtdOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pubId != null) __obj.updateDynamic("pubId")(pubId)
    if (sysId != null) __obj.updateDynamic("sysId")(sysId)
    __obj.asInstanceOf[IDtdOptions]
  }
}

