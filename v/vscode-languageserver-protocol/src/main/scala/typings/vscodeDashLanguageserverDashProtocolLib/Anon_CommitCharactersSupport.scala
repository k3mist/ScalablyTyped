package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommitCharactersSupport extends js.Object {
  /**
    * Client supports commit characters on a completion item.
    */
  var commitCharactersSupport: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Client supports the deprecated property on a completion item.
    */
  var deprecatedSupport: js.UndefOr[scala.Boolean] = js.undefined
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
    * Client supports the preselect property on a completion item.
    */
  var preselectSupport: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Client supports snippets as insert text.
    *
    * A snippet can define tab stops and placeholders with `$1`, `$2`
    * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
    * the end of the snippet. Placeholders with equal identifiers are linked,
    * that is typing in one will update others too.
    */
  var snippetSupport: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CommitCharactersSupport {
  @scala.inline
  def apply(
    commitCharactersSupport: js.UndefOr[scala.Boolean] = js.undefined,
    deprecatedSupport: js.UndefOr[scala.Boolean] = js.undefined,
    documentationFormat: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.MarkupKind
    ] = null,
    preselectSupport: js.UndefOr[scala.Boolean] = js.undefined,
    snippetSupport: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CommitCharactersSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commitCharactersSupport)) __obj.updateDynamic("commitCharactersSupport")(commitCharactersSupport)
    if (!js.isUndefined(deprecatedSupport)) __obj.updateDynamic("deprecatedSupport")(deprecatedSupport)
    if (documentationFormat != null) __obj.updateDynamic("documentationFormat")(documentationFormat)
    if (!js.isUndefined(preselectSupport)) __obj.updateDynamic("preselectSupport")(preselectSupport)
    if (!js.isUndefined(snippetSupport)) __obj.updateDynamic("snippetSupport")(snippetSupport)
    __obj.asInstanceOf[Anon_CommitCharactersSupport]
  }
}

