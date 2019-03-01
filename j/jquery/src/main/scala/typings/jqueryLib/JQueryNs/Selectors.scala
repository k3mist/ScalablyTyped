package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors
  extends sizzleLib.sizzleMod.SizzleNs.Selectors {
  /**
    * @deprecated ​ Deprecated since 3.0. Use \`{@link Selectors#pseudos }\`.
    *
    * **Cause**: The standard way to add new custom selectors through jQuery is `jQuery.expr.pseudos`. These two other aliases are deprecated, although they still work as of jQuery 3.0.
    *
    * **Solution**: Rename any of the older usage to `jQuery.expr.pseudos`. The functionality is identical.
    */
  var `:`: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunctions
}

object Selectors {
  @scala.inline
  def apply(
    `:`: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunctions,
    attrHandle: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.AttrHandleFunctions,
    cacheLength: scala.Double,
    createPseudo: js.Function1[
      sizzleLib.sizzleMod.SizzleNs.SelectorsNs.CreatePseudoFunction, 
      sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunction
    ],
    filter: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.FilterFunctions,
    find: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.FindFunctions,
    `match`: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.Matches,
    preFilter: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PreFilterFunctions,
    pseudos: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunctions,
    setFilters: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.SetFilterFunctions
  ): Selectors = {
    val __obj = js.Dynamic.literal(attrHandle = attrHandle, cacheLength = cacheLength, createPseudo = createPseudo, filter = filter, find = find, `match` = `match`, preFilter = preFilter, pseudos = pseudos, setFilters = setFilters)
    __obj.updateDynamic(":")(`:`)
    __obj.asInstanceOf[Selectors]
  }
}

