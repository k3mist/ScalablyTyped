package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentationFormat extends js.Object {
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[
    js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.MarkupKind
    ]
  ] = js.undefined
  /**
    * Client capabilities specific to parameter information.
    */
  var parameterInformation: js.UndefOr[Anon_LabelOffsetSupport] = js.undefined
}

object Anon_DocumentationFormat {
  @scala.inline
  def apply(
    documentationFormat: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.MarkupKind
    ] = null,
    parameterInformation: Anon_LabelOffsetSupport = null
  ): Anon_DocumentationFormat = {
    val __obj = js.Dynamic.literal()
    if (documentationFormat != null) __obj.updateDynamic("documentationFormat")(documentationFormat)
    if (parameterInformation != null) __obj.updateDynamic("parameterInformation")(parameterInformation)
    __obj.asInstanceOf[Anon_DocumentationFormat]
  }
}

